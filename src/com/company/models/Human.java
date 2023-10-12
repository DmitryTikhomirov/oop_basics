package com.company.models;

public abstract class Human {
    private String firstName;
    private String secondName;
    private String patronymic;
    private int age;

    protected Human(String firstName, String secondName, String patronymic, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" + "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                '}';
    }
}
