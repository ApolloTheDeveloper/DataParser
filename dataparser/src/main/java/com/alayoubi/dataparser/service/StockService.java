/*
 * Developed by Omar Alayoubi on 8/9/18 6:12 PM
 * Last Modified 8/9/18 6:06 PM.
 * Copyright (c) 2018. All rights reserved
 */
package com.alayoubi.dataparser.service;

import com.alayoubi.dataparser.model.Stock;
import com.alayoubi.dataparser.model.StockRequest;

import java.io.IOException;


public interface StockService {

    public Stock getStockQuote(StockRequest stockRequest) throws IOException;


}
