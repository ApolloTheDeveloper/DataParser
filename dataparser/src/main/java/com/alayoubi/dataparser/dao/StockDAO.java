/*
 * Developed by Omar Alayoubi on 8/9/18 6:12 PM
 * Last Modified 8/9/18 6:06 PM.
 * Copyright (c) 2018. All rights reserved
 */

package com.alayoubi.dataparser.dao;


import com.alayoubi.dataparser.model.Stock;

import java.io.IOException;

public interface StockDAO {

    Stock getStockQuote(String symbol, String function, String outputSize, String dataType, String fromDate, String toDate) throws IOException;
}
