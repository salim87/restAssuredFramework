package com.complexJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
    public int id;
    @JsonProperty("Interperoperation")
    public String interperoperation;
    @JsonProperty("DateOfOperation")
    public String dateOfOperation;

    public int getId() {
        return id;
    }

    public Root setId(int id) {
        this.id = id;
        return this;
    }

    public String getInterperoperation() {
        return interperoperation;
    }

    public Root setInterperoperation(String interperoperation) {
        this.interperoperation = interperoperation;
        return this;
    }

    public String getDateOfOperation() {
        return dateOfOperation;
    }

    public Root setDateOfOperation(String dateOfOperation) {
        this.dateOfOperation = dateOfOperation;
        return this;
    }
}
