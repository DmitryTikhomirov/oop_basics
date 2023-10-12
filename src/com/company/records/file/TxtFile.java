package com.company.records.file;

import com.company.exceptions.FilesOperationException;
import com.company.logger.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TxtFile extends AbstractFile {
    private static Logger logger = Logger.getInstance();

    private static final String FILE_EXTENSION = ".txt";

    @Override
    public void createFile(String fileName) {
        try {
            Files.createFile(Path.of(fileName + FILE_EXTENSION));
            logger.info("File created");
        } catch (IOException e) {
            logger.error(e.getMessage());
            throw new FilesOperationException("Error while creating file");
        }
    }

    @Override
    public void writeToFile(String fileName, String text) {
        File file = getFileFromString(fileName);
        try {
            Files.write(file.toPath(), text.getBytes());
            logger.info("File written");
        } catch (IOException e) {
            Logger.getInstance().error(e.getMessage());
            throw new FilesOperationException("Error while writing to file");
        }
    }

    @Override
    public List<String> readFromFile(String fileName) {
        File file = getFileFromString(fileName);
        try {
            return Files.readAllLines(file.toPath());
        } catch (IOException e) {
            logger.error(e.getMessage());
            throw new FilesOperationException("Error while reading from file");
        }
    }

    private boolean isFileExists(String fileName) {
        File file = getFileFromString(fileName);
        return file.exists();
    }

    private File getFileFromString(String fileName) {
        return new File(fileName + FILE_EXTENSION);
    }
}
