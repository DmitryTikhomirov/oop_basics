package com.company.service;

import com.company.models.Credit;

import java.util.List;

public interface CreditService {

    List<Credit> getAllCredits();

    void createCredit();

    void deleteCredit(Long id);
}
