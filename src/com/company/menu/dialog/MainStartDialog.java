package com.company.menu.dialog;

import com.company.logger.Logger;
import com.company.menu.enums.MenuType;
import com.company.service.UserInputService;
import com.company.service.impl.UserInputServiceImpl;

import static com.company.config.PropertyUtils.getProperty;
import static com.company.constants.Constants.CONON;
import static com.company.constants.Constants.SPACE;

public class MainStartDialog implements StartDialog {

    private final UserInputService userInputService;
    private final Logger logger;

    public MainStartDialog(Logger logger, UserInputService userInputService) {
        this.userInputService = userInputService;
        this.logger = logger;
    }

    @Override
    public int start() {
        logger.info(getProperty("messages.menu.title"));
        MenuType[] menuType = MenuType.values();
        for (MenuType menu : menuType) {
            logger.info(menu.getId() + CONON + SPACE + menu.getName());
        }
        logger.info(getProperty("messages.choose.your.option"));
        int optionNumber = -1;
        while (optionNumber != 0) {
            optionNumber = userInputService.getInteger();
            if (optionNumber > 0 && optionNumber <= menuType.length) {
                switch (optionNumber) {
                    case 1 -> {
                        logger.info(getProperty("messages.menu.option.1"));
                        optionNumber = MenuType.MANAGER.showMenu(logger, userInputService);
                    }
                    case 2 -> {
                        logger.info(getProperty("messages.menu.option.2"));
                        optionNumber = MenuType.CUSTOMER.showMenu(logger, userInputService);
                    }
                    case 3 -> {
                        logger.info(getProperty("messages.menu.option.3"));
                        optionNumber = MenuType.EXIT.showMenu(logger, userInputService);
                    }
                    default -> {
                        logger.info(getProperty("messages.menu.option.default"));
                        optionNumber = MenuType.EXIT.showMenu(logger, userInputService);
                    }
                }
            } else {
                logger.info(getProperty("messages.menu.option.default"));
                optionNumber = MenuType.EXIT.showMenu(logger, userInputService);
            }
        }
        return 0;
    }
}
