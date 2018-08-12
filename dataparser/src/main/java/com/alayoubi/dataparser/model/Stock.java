/*
 * Developed by Omar Alayoubi on 8/9/18 6:12 PM
 * Last Modified 8/9/18 6:06 PM.
 * Copyright (c) 2018. All rights reserved
 */
package com.alayoubi.dataparser.model;

import java.util.ArrayList;
import java.util.List;

import com.alayoubi.dataparser.model.CandleStick;

public class Stock {

    private List<CandleStick> stock;
    private String name;

    public Stock(){
        stock = new ArrayList<CandleStick>();
    }

    public List<CandleStick> getStock() {
        return stock;
    }

    public void setStock(List<CandleStick> stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCandleStick(CandleStick candleStick){stock.add(candleStick);}
}
