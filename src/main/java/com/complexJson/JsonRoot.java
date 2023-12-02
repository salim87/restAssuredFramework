package com.complexJson;

public class JsonRoot {

    public Request getRequest() {
        return request;
    }

    public JsonRoot setRequest(Request request) {
        this.request = request;
        return this;
    }

    private Request request;
}
