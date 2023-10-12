package com.company.service.impl;

import com.company.logger.Logger;
import com.company.models.Client;
import com.company.models.Credit;
import com.company.service.ClientService;
import com.company.service.ManagerService;
import com.company.service.UserInputService;

import java.util.List;
import java.util.Optional;

public class ManagerServiceImpl implements ManagerService {

    private final UserInputService userInputService;
    private final ClientService clientService;
    private final Logger logger;

    public ManagerServiceImpl(UserInputService userInputService, ClientService clientService, Logger logger) {
        this.userInputService = userInputService;
        this.clientService = clientService;
        this.logger = logger;
    }


    @Override
    public Client createClient() {
        return null;
    }

    @Override
    public Optional<Client> getClient(Long id) {
        return Optional.empty();
    }

    @Override
    public void removeClient(Long id) {

    }

    @Override
    public Credit createCredit() {
        return null;
    }

    @Override
    public Optional<Credit> getCredit(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Credit> getCredits() {
        return null;
    }
}
