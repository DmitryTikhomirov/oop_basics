package com.company.menu.enums;

public
enum ManagerMenuType {
    ADD_CLIENT("Add client"),
    REMOVE_CLIENT("Remove client"),
    ADD_CREDIT("Add credit"),
    REMOVE_CREDIT("Remove credit"),
    SHOW_CLIENTS("Show clients"),
    SHOW_CREDITS("Show credits"),
    EXIT("Exit");

    private String name;

    ManagerMenuType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}