package com.company;

import com.company.logger.Logger;
import com.company.menu.dialog.MainStartDialog;
import com.company.service.impl.UserInputServiceImpl;
//  Проверка Git

public class Main {
    public static void main(String[] args) {
        MainStartDialog mainDialog = new MainStartDialog(Logger.getInstance(), new UserInputServiceImpl());
        mainDialog.start();
    }
}
