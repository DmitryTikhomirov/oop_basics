package com.company.service;

import com.company.logger.Logger;
import com.company.models.Client;
import com.company.models.Credit;
import com.company.records.writting.TxtFileWriting;

public class ClientService extends BasicService{

    private static Logger logger = Logger.getInstance();
    private TxtFileWriting serviceFile = new TxtFileWriting();

    public ClientService() {

    }

    public void deleteClient(Client client) {
       logger.info("Client deleted");

    }

    public Client createClient(String name, String surname, String patronymic, int age)  {
        Client client = new Client(name, surname, patronymic, age);
        serviceFile.write(client);
        logger.info("Client created");
        return client;
    }

    public void updateClient(Client client) {
        logger.info("Client updated");
    }

    public void addCredit(Client client, Credit credit) {
        super.addCredit(credit, client);
        logger.info("Credit added");
    }
}
