package com.company.service;

import com.company.models.Client;
import com.company.models.Credit;

import java.util.List;
import java.util.Optional;

public interface ManagerService {
    //clients
    Client createClient();

    Optional<Client> getClient(Long id);

    void removeClient(Long id);

    //credits
    Credit createCredit();

    Optional<Credit> getCredit(Long id);

    List<Credit> getCredits();
}
