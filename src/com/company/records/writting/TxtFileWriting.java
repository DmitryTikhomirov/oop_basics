package com.company.records.writting;

import com.company.logger.Logger;
import com.company.models.Human;
import com.company.records.file.TxtFile;

import static com.company.constants.Constants.FILE_NAME;

public class TxtFileWriting implements RecordsWriting {

    private final TxtFile file = new TxtFile();
    public static final Logger logger = Logger.getInstance();

    @Override
    public void write(Human human) {
        file.writeToFile(FILE_NAME,  human.toString());
        logger.info("Record was written to file");
    }

    @Override
    public void delete(Human human) {

    }

    @Override
    public void update(Human human) {

    }

    @Override
    public void read(Human human) {

    }
}
