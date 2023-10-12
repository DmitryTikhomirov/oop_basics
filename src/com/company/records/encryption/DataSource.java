package com.company.records.encryption;

public interface DataSource {
    void writeData(String data);

    String readData();
}