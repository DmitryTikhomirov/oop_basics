package com.company.service;

import com.company.logger.Logger;
import com.company.models.Client;
import com.company.models.Credit;

public class BasicService {

    private static Logger logger = Logger.getInstance();

    public void addCredit(Credit credit, Client client) {
        logger.info("Credit added");

    }
}
