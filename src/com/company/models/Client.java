package com.company.models;

import java.util.Objects;

public class Client extends Human{
    private String currentWorkPlace;
    private int monthsOfWorkInTheLastPlace;
    private boolean haveAnotherCredits;

    public Client(String name, String surname, String patronymic, int age) {
        super(name, surname, patronymic, age);
    }

    public String getCurrentWorkPlace() {
        return currentWorkPlace;
    }

    public void setCurrentWorkPlace(String currentWorkPlace) {
        this.currentWorkPlace = currentWorkPlace;
    }

    public int getMonthsOfWorkInTheLastPlace() {
        return monthsOfWorkInTheLastPlace;
    }

    public void setMonthsOfWorkInTheLastPlace(int monthsOfWorkInTheLastPlace) {
        this.monthsOfWorkInTheLastPlace = monthsOfWorkInTheLastPlace;
    }

    public boolean isHaveAnotherCredits() {
        return haveAnotherCredits;
    }

    public void setHaveAnotherCredits(boolean haveAnotherCredits) {
        this.haveAnotherCredits = haveAnotherCredits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return monthsOfWorkInTheLastPlace == client.monthsOfWorkInTheLastPlace && haveAnotherCredits == client.haveAnotherCredits && Objects.equals(currentWorkPlace, client.currentWorkPlace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentWorkPlace, monthsOfWorkInTheLastPlace, haveAnotherCredits);
    }

    @Override
    public String toString() {
        return "Client{" +
                "currentWorkPlace='" + currentWorkPlace + '\'' +
                ", monthsOfWorkInTheLastPlace=" + monthsOfWorkInTheLastPlace +
                ", haveAnotherCredits=" + haveAnotherCredits +
                '}' + super.toString();
    }
}
