package com.alayoubi.dataparser.model;


import java.util.ArrayList;

public class DailyReturn {

    private ArrayList<Double> daily_returns;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    private String symbol;

    DailyReturn(){
        daily_returns = new ArrayList<Double>();
    }

    public ArrayList<Double> getDaily_returns() {
        return daily_returns;
    }

    public void setDaily_returns(ArrayList<Double> daily_returns) {
        this.daily_returns = daily_returns;
    }

    public void computeDailyReturns(Stock stock){
        for(CandleStick candleStick : stock.getStock()){
            daily_returns.add(computeDayReturn(candleStick));
        }

    }


    private double computeDayReturn(CandleStick candleStick){
        return (candleStick.getClose() - candleStick.getOpen())/(candleStick.getOpen());
    }
}
