/*
 * Developed by Omar Alayoubi on 8/9/18 6:12 PM
 * Last Modified 8/9/18 6:06 PM.
 * Copyright (c) 2018. All rights reserved
 */
package com.alayoubi.dataparser.service.impl;

import com.alayoubi.dataparser.model.Stock;
import com.alayoubi.dataparser.dao.StockDAO;
import com.alayoubi.dataparser.service.StockService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service(value="StockService")
public class StockServiceImpl implements StockService {

    @Autowired
    StockDAO stockDAO;

    @Override
    public Stock getStockQuote(String symbol, String function, String outputSize, String dataType, String fromDate, String toDate) throws IOException {
        return stockDAO.getStockQuote(symbol, function, outputSize, dataType, fromDate, toDate);
    }
}
