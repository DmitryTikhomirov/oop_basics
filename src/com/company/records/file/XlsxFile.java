package com.company.records.file;

import com.company.logger.Logger;

import java.io.File;
import java.util.List;

public class XlsxFile extends AbstractFile{
    @Override
    public void createFile(String fileName) {
        File file = new File(fileName + ".xml");
        Logger.getInstance().info("File " + fileName + ".xml created");
    }

    @Override
    public void writeToFile(String fileName, String text) {

    }

    @Override
    public List<String> readFromFile(String fileName) {
        return null;
    }
}
