package com.company.menu.enums;

import com.company.logger.Logger;
import com.company.menu.dialog.ClientStartDialog;
import com.company.menu.dialog.ManagerStartDialog;
import com.company.records.writting.TxtFileWriting;
import com.company.service.UserInputService;
import com.company.service.impl.ClientServiceImpl;

public enum MenuType {
    MANAGER("Manager", 1) {
        @Override
        public int showMenu(Logger logger, UserInputService userInputService) {
            return new ManagerStartDialog().start();
        }
    },
    CUSTOMER("Customer", 2) {
        @Override
        public int showMenu(Logger logger, UserInputService userInputService) {
            TxtFileWriting fileWriting = new TxtFileWriting();
            ClientServiceImpl clientService = new ClientServiceImpl(fileWriting, userInputService, logger);
            ClientStartDialog clientStartDialog = new ClientStartDialog(clientService, logger, userInputService);

            return clientStartDialog.start();
        }
    },
    EXIT("Exit", 0) {
        @Override
        public int showMenu(Logger logger, UserInputService userInputService) {
            System.exit(0);
            return 0;
        }
    };

    public abstract int showMenu(Logger logger, UserInputService userInputService);

    private final String name;
    private final int id;

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




