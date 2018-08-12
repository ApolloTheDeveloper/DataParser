/*
 * Developed by Omar Alayoubi on 8/9/18 6:12 PM
 * Last Modified 8/9/18 6:06 PM.
 * Copyright (c) 2018. All rights reserved
 */
package com.alayoubi.dataparser.constants;

public interface APIConstants {

    /**
     * Parameters values
     * */
    static final String TIME_SERIES_DAILY = "TIME_SERIES_DAILY";
    static final String TIME_SERIES_WEEKLY = "TIME_SERIES_WEEKLY";
    static final String TIME_SERIES_MONTHLY = "TIME_SERIES_MONTHLY";
    static final String TIME_SERIES_INTRADAY = "TIME_SERIES_INTRADAY";

    static final String API_KEY_VALUE = "W7NVMOADDFAEPXYE";
    static final String JSON_DATA_TYPE = "json";
    static final String CSV_DATA_TYPE = "csv";
    static final String FULL_OUTPUT_SIZE = "full";
    static final String COMPACT_OUTPUT_SIZE = "compact";



    /**
     * Parameters
     * */
    static final String URL_ = "https://www.alphavantage.co/query?";
    static final String FUNCTION = "function";
    static final String SYMBOL = "symbol";
    static final String API_KEY = "apikey";
    static final String DATA_TYPE = "datatype";
    static final String OUTPUT_SIZE = "outputsize";



    /**
     * JSON Constants
     * */
    static final String META_DATA = "Meta Data";
    static final String CLOSE = "4. close";
    static final String HIGH = "2. high";
    static final String OPEN = "1. open";
    static final String VOLUME = "5. volume";
    static final String LOW = "3. low";

}
