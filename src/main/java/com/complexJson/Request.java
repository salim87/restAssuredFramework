package com.complexJson;

public class Request {

    public String quoteFromDate;
    public String quoteToDate;
    public Curves curves;
    public String updateOnly;
    public String insertedOrUpdated;

    public String getQuoteFromDate() {
        return quoteFromDate;
    }

    public Request setQuoteFromDate(String quoteFromDate) {
        this.quoteFromDate = quoteFromDate;
        return this;
    }

    public String getQuoteToDate() {
        return quoteToDate;
    }

    public Request setQuoteToDate(String quoteToDate) {
        this.quoteToDate = quoteToDate;
        return this;
    }

    public Curves getCurves() {
        return curves;
    }

    public Request setCurves(Curves curves) {
        this.curves = curves;
        return this;
    }

    public String getUpdateOnly() {
        return updateOnly;
    }

    public Request setUpdateOnly(String updateOnly) {
        this.updateOnly = updateOnly;
        return this;
    }



    public String getInsertedOrUpdated() {
        return insertedOrUpdated;
    }

    public Request setInsertedOrUpdated(String insertedOrUpdated) {
        this.insertedOrUpdated = insertedOrUpdated;
        return this;
    }
}
