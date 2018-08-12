/*
 * Developed by Omar Alayoubi on 8/9/18 6:12 PM
 * Last Modified 8/9/18 6:06 PM.
 * Copyright (c) 2018. All rights reserved
 */
package com.alayoubi.dataparser.restservice;



import com.alayoubi.dataparser.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.alayoubi.dataparser.service.StockService;

import java.io.IOException;

import static com.alayoubi.dataparser.constants.APIConstants.COMPACT_OUTPUT_SIZE;
import static com.alayoubi.dataparser.constants.APIConstants.JSON_DATA_TYPE;
import static com.alayoubi.dataparser.constants.APIConstants.TIME_SERIES_DAILY;


@RestController
@RequestMapping("/v1/stocks")
public class StockRestService {

    @Autowired
    StockService stockService;

    @RequestMapping("/quote")
    public Stock getStockQuote(@RequestParam(value = "symbol", defaultValue="AMZN") String symbol,
                               @RequestParam(value="function", defaultValue = TIME_SERIES_DAILY) String function,
                               @RequestParam(value="outputSize", defaultValue = COMPACT_OUTPUT_SIZE) String outputSize,
                               @RequestParam(value="dataType", defaultValue = JSON_DATA_TYPE) String dataType,
                               @RequestParam(value="fromDate", defaultValue = "2018-06-20") String fromDate,
                               @RequestParam(value="toDate", defaultValue = "2018-08-10") String toDate) throws IOException {
        return stockService.getStockQuote(symbol, function, outputSize, dataType, fromDate, toDate);

    }
}
