package com.company.models;

public class Manager extends Human {
    private String position;
    private String workExperience;
    private boolean availableToGetCredit;

    public Manager(String firstName, String secondName, String patronymic, int age) {
        super(firstName, secondName, patronymic, age);
    }
}
