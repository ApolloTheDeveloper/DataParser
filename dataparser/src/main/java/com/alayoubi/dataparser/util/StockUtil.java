/*
 * Developed by Omar Alayoubi on 8/10/18 1:54 PM
 * Last Modified 8/10/18 1:54 PM.
 * Copyright (c) 2018. All rights reserved
 */

package com.alayoubi.dataparser.util;

import org.json.simple.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.alayoubi.dataparser.constants.APIConstants.*;

public class StockUtil {

    public static String prepareRequest(String symbol, String function, String outputSize, String dataType) throws UnsupportedEncodingException {
        Map<String, String> params = new HashMap<String, String>();
        params.put(FUNCTION, function);
        params.put(SYMBOL, symbol);
        params.put(OUTPUT_SIZE, outputSize);
        params.put(DATA_TYPE, dataType);
        params.put(API_KEY, API_KEY_VALUE);
        return prepareParameter(params);
    }

    private static String prepareParameter(Map<String, String> params) throws UnsupportedEncodingException {

            StringBuilder result = new StringBuilder();
            result.append(URL_);
            for (Map.Entry<String, String> entry : params.entrySet()) {
                result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                result.append("=");
                result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                result.append("&");
            }

            String resultString = result.toString();
            return resultString.length() > 0
                    ? resultString.substring(0, resultString.length() - 1)
                    : resultString;

    }

    public static double getJsonAsDouble(JSONObject jsonObject, String key){
        return Double.parseDouble(jsonObject.get(key).toString());

    }

    public static int getJsonAsInt(JSONObject jsonObject, String key){
        return Integer.parseInt(jsonObject.get(key).toString());
    }

    public static Date StringToDate(String s){

        Date result = null;
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            result  = dateFormat.parse(s);
        }

        catch(Exception e){
            e.printStackTrace();
        }
        return result ;
    }


}
