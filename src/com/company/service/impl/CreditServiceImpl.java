package com.company.service.impl;

import com.company.models.Credit;
import com.company.records.file.AbstractFile;
import com.company.records.file.FileInterface;
import com.company.service.CreditService;

import java.util.List;

public class CreditServiceImpl implements CreditService {

    private final AbstractFile fileWithCredits;
    private final FileInterface fileInterface;

    public CreditServiceImpl(AbstractFile fileWithCredits, FileInterface fileInterface) {
        this.fileWithCredits = fileWithCredits;
        this.fileInterface = fileInterface;
    }

    @Override
    public List<Credit> getAllCredits() {
        return null;
    }

    @Override
    public void createCredit() {

    }

    @Override
    public void deleteCredit(Long id) {

    }
}
