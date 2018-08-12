package com.alayoubi.dataparser.model;



public class StockRequest {

    private String symbol;
    private String function;
    private String dataType;
    private String fromDate;
    private String toDate;
    private String outputSize;


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getOutputSize() {
        return outputSize;
    }

    public void setOutputSize(String outputSize) {
        this.outputSize = outputSize;
    }



}
