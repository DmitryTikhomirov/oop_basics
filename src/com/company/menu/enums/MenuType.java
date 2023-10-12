package com.company.menu.enums;

import com.company.menu.dialog.ClientDialog;
import com.company.menu.dialog.ManagerDialog;

public enum MenuType {
    MANAGER("Manager", 1){
        @Override
        public int showMenu() {
            return new ManagerDialog().show();
        }
    },
    CUSTOMER("Customer", 2){
        @Override
        public int showMenu() {
            return new ClientDialog().show();
        }
    },
    EXIT("Exit", 0){
        @Override
        public int showMenu() {
            System.exit(0);
            return 0;
        }
    };

    abstract public int showMenu();

    private String name;
    private int id;

    MenuType(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }



}




