package com.alayoubi.dataparser.builder;


import com.alayoubi.dataparser.model.CandleStick;
import com.alayoubi.dataparser.model.Stock;
import com.alayoubi.dataparser.util.StockUtil;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.alayoubi.dataparser.constants.APIConstants.*;

public class StockBuilder {


    private CandleStick candleStickBuilder(String date, JSONObject stockDate){
        CandleStick candleStick = new CandleStick();
        JSONObject jsonObject = (JSONObject) stockDate.get(date);
        candleStick.setClose(StockUtil.getJsonAsDouble(jsonObject, CLOSE));
        candleStick.setLow(StockUtil.getJsonAsDouble(jsonObject, LOW));
        candleStick.setHigh(StockUtil.getJsonAsDouble(jsonObject, HIGH));
        candleStick.setOpen(StockUtil.getJsonAsDouble(jsonObject, OPEN));
        candleStick.setVolume(StockUtil.getJsonAsInt(jsonObject, VOLUME));
        candleStick.setDate(date);
        return candleStick;
    }

    public Stock build(String jsonFile, String name, String from, String to, String function){
        JSONParser jsonParser = new JSONParser();
        Stock stock = null;
        try{
            Object object = jsonParser.parse(jsonFile);
            JSONObject jsonObject = (JSONObject) object;
            JSONObject stockData = (JSONObject) jsonObject.get(getTimeSeries(function));

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            Date fromDate = StockUtil.StringToDate(from);
            Date toDate = StockUtil.StringToDate(to);

            Calendar cal = Calendar.getInstance();
            cal.setTime(fromDate);

            stock = new Stock();
            stock.setName(name);
            if(stockData != null) {
                while (cal.getTime().before(toDate)) {
                    cal.add(Calendar.DATE, 1);
                    String date = dateFormat.format(cal.getTime());
                    System.out.println(date);
                    if (stockData.get(date) != null) {
                        stock.addCandleStick(candleStickBuilder(date, stockData));
                    }
                }
            }


        }catch(Exception e){
            System.out.println("EXCEPTION: " + e.getMessage());
        }

        return stock;

    }

    private String getTimeSeries(String timeSeries){
        if(timeSeries.equals(TIME_SERIES_DAILY)){
            return "Time Series (Daily)";
        }
        else if(timeSeries.equals(TIME_SERIES_WEEKLY)){
            return "Weekly Time Series";
        }
        else if(timeSeries.equals(TIME_SERIES_MONTHLY)){
            return "Monthly Time Series";
        }
        return "";
    }

}
