package com.company.logger;

public enum LoggerType {
    INFO("INFO"),
    WARNING("WARNING"),
    ERROR("ERROR");

    private String type;

    LoggerType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
