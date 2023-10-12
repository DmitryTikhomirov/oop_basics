package com.company.menu.dialog;

import com.company.config.PropertyUtils;
import com.company.menu.enums.ClientMenuType;
import com.company.menu.enums.MenuType;
import com.company.models.Client;
import com.company.service.ClientService;

import static com.company.constants.Constants.CONON;
import static com.company.constants.Constants.SPACE;

public class ClientDialog extends AbstractDialog {

    public ClientService clientService = new ClientService();

    public ClientDialog() {
        super();
    }

    public int show() {
        return start();
    }

    @Override
    int start() {
        ClientMenuType[] clientMenuType = ClientMenuType.values();
        for (ClientMenuType clientMenuType1 : clientMenuType) {
            logger.info(clientMenuType1.getId() + CONON + SPACE +  clientMenuType1.getName());
        }
        logger.info(PropertyUtils.getProperty("messages.choose.your.option"));
        int optionNumber = -1;
        while (optionNumber != 0) {
            optionNumber = Integer.parseInt(getUserInput());
            if (optionNumber > 0 && optionNumber <= clientMenuType.length) {
                switch (optionNumber) {
                    case 1 -> {
                        logger.info(PropertyUtils.getProperty("messages.client.option.1"));
                        Client client = clientService.createClient("name", "surname", "email", 12);
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
                optionNumber = MenuType.EXIT.showMenu();

            }
        }
        return 0;
    }


}
