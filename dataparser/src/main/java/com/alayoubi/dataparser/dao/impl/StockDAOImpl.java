/*
 * Developed by Omar Alayoubi on 8/9/18 6:12 PM
 * Last Modified 8/9/18 6:06 PM.
 * Copyright (c) 2018. All rights reserved
 */
package com.alayoubi.dataparser.dao.impl;

import com.alayoubi.dataparser.dao.StockDAO;
import com.alayoubi.dataparser.model.Stock;
import com.alayoubi.dataparser.util.StockUtil;


import com.alayoubi.dataparser.builder.StockBuilder;


import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;




@Repository(value = "StockDAO")
public class StockDAOImpl implements StockDAO {

    @Override
    public Stock getStockQuote(String symbol, String function, String outputSize, String dataType, String fromDate, String toDate) throws IOException {

        URL url = new URL(StockUtil.prepareRequest(symbol, function, outputSize, dataType));
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setDoOutput(true);

        int responseCode = con.getResponseCode();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        StockBuilder builder = new StockBuilder();
        builder.build(content.toString(), symbol, fromDate, toDate);




        con.disconnect();




        return null;
    }
}
