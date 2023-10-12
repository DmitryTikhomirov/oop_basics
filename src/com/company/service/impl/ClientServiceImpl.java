package com.company.service.impl;

import com.company.logger.Logger;
import com.company.models.Client;
import com.company.models.Credit;
import com.company.records.writting.RecordsWriting;
import com.company.service.ClientService;
import com.company.service.UserInputService;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    private final RecordsWriting fileWritingService;
    private final UserInputService userInputService;
    private final Logger logger;

    public ClientServiceImpl(RecordsWriting fileWritingService, UserInputService userInputService, Logger logger) {
        this.fileWritingService = fileWritingService;
        this.userInputService = userInputService;
        this.logger = logger;
    }

    @Override
    public List<Credit> getMyCredits() {
        return null;
    }

    @Override
    public Client getMyInfo() {
        return null;
    }

    @Override
    public Client updateMyInfo() {
        return null;
    }
}
