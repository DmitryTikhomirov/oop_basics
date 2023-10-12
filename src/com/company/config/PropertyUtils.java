package com.company.config;

import com.company.exceptions.FilesOperationException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    public static final String FILE_NAME = "system.properties";
    public static final String FILE_PATH = "src/resources/";

    private static final Properties property = new Properties();

    static {
        try (FileInputStream fileInputStream = new FileInputStream(FILE_PATH + FILE_NAME)) {
            property.load(fileInputStream);
        } catch (IOException e) {
            throw new FilesOperationException(e.getMessage());
        }
    }
    private PropertyUtils() {

    }

    public static String getProperty(String key) {
        return property.getProperty(key);
    }

}
