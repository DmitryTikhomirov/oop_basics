package com.company.records.file;

import java.io.IOException;
import java.util.List;

public interface FileInterface {
    void createFile(String fileName) throws IOException;
    void writeToFile(String fileName, String text);
    List<String> readFromFile(String fileName);
}
