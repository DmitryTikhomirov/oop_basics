package com.company.service;

import com.company.models.Client;
import com.company.models.Credit;

import java.util.List;

public interface ClientService {

    List<Credit> getMyCredits();

    Client getMyInfo();

    Client updateMyInfo();

}
