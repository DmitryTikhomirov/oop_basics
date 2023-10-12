package com.company.menu.dialog;

import com.company.menu.enums.MenuType;

import static com.company.config.PropertyUtils.getProperty;
import static com.company.constants.Constants.CONON;
import static com.company.constants.Constants.SPACE;

public class MainDialog extends AbstractDialog {

    public void show() {
        start();
    }

    @Override
    int start() {
        logger.info(getProperty("messages.menu.title"));
        MenuType[] menuType = MenuType.values();
        for (MenuType menu : menuType) {
            logger.info(menu.getId() + CONON + SPACE +  menu.getName());
        }
        logger.info(getProperty("messages.choose.your.option"));
        int optionNumber = -1;
        while (optionNumber != 0) {
            optionNumber = Integer.parseInt(getUserInput());
            if (optionNumber > 0 && optionNumber <= menuType.length) {
                switch (optionNumber) {
                    case 1 -> {
                        logger.info(getProperty("messages.menu.option.1"));
                        optionNumber = MenuType.MANAGER.showMenu();
                    }
                    case 2 -> {
                        logger.info(getProperty("messages.menu.option.2"));
                        optionNumber = MenuType.CUSTOMER.showMenu();
                    }
                    case 3 -> {
                        logger.info(getProperty("messages.menu.option.3"));
                        optionNumber = MenuType.EXIT.showMenu();
                    }
                    default -> {
                        logger.info(getProperty("messages.menu.option.default"));
                        optionNumber = MenuType.EXIT.showMenu();
                    }
                }
            } else {
                logger.info(getProperty("messages.menu.option.default"));
                optionNumber = MenuType.EXIT.showMenu();
            }
        }
        return 0;
    }
}
