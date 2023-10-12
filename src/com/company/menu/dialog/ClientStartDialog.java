package com.company.menu.dialog;

import com.company.config.PropertyUtils;
import com.company.logger.Logger;
import com.company.menu.enums.ClientMenuType;
import com.company.menu.enums.MenuType;
import com.company.service.ClientService;
import com.company.service.UserInputService;
import com.company.service.impl.ClientServiceImpl;

import static com.company.constants.Constants.CONON;
import static com.company.constants.Constants.SPACE;

public class ClientStartDialog implements StartDialog {

    private final ClientService clientService;
    private final Logger logger;
    private final UserInputService userInputService;

    public ClientStartDialog(ClientService clientService, Logger logger, UserInputService userInputService) {
        this.clientService = clientService;
        this.logger = logger;
        this.userInputService = userInputService;
    }

    @Override
    public int start() {
        ClientMenuType[] clientMenuType = ClientMenuType.values();
        for (ClientMenuType clientMenuType1 : clientMenuType) {
            logger.info(clientMenuType1.getId() + CONON + SPACE + clientMenuType1.getName());
        }
        logger.info(PropertyUtils.getProperty("messages.choose.your.option"));
        int optionNumber = -1;
        while (optionNumber != 0) {
            optionNumber = userInputService.getInteger();
            if (optionNumber > 0 && optionNumber <= clientMenuType.length) {
                switch (optionNumber) {
                    case 1 -> {
                        logger.info(PropertyUtils.getProperty("messages.client.option.1"));
                    }
                    case 2 -> {
                        logger.info(PropertyUtils.getProperty("messages.client.option.2"));
                    }
                    case 3 -> {
                        logger.info(PropertyUtils.getProperty("messages.client.option.3"));

                    }
                    default -> {
                        logger.info(PropertyUtils.getProperty("messages.client.option.4"));
                    }
                }
            } else {
                logger.info(PropertyUtils.getProperty("messages.client.option.4"));
                optionNumber = MenuType.EXIT.showMenu(logger, userInputService);

            }
        }
        return 0;
    }


}
