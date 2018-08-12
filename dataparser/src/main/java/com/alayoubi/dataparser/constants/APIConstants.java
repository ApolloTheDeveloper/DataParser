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
    static String TIME_SERIES_DAILY = "TIME_SERIES_DAILY";
    static String TIME_SERIES_WEEKLY = "TIME_SERIES_WEEKLY";
    static String TIME_SERIES_MONTHLY = "TIME_SERIES_MONTHLY";
    static String TIME_SERIES_INTRADAY = "TIME_SERIES_INTRADAY";

    static String API_KEY_VALUE = "W7NVMOADDFAEPXYE";
    static String JSON_DATA_TYPE = "json";
    static String CSV_DATA_TYPE = "csv";
    static String FULL_OUTPUT_SIZE = "full";
    static String COMPACT_OUTPUT_SIZE = "compact";



    /**
     * Parameters
     * */
    static String URL_ = "https://www.alphavantage.co/query?";
    static String FUNCTION = "function";
    static String SYMBOL = "symbol";
    static String API_KEY = "apikey";
    static String DATA_TYPE = "datatype";
    static String OUTPUT_SIZE = "outputsize";



    /**
     * JSON Constants
     * */
    static String META_DATA = "Meta Data";
    static String CLOSE = "4. close";
    static String HIGH = "2. high";
    static String OPEN = "1. open";
    static String VOLUME = "5. volume";
    static String LOW = "3. low";

}
