package com.company.menu.enums;

public enum ClientMenuType {
    ADD_CLIENT("Add client", 1),
    ADD_CREDIT("Add credit", 2),
    SHOW_CREDITS("Show credits", 3),
    EXIT("Exit", 0);

    private String name;
    private int id;

    ClientMenuType(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}