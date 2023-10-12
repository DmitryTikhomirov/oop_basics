package com.company.menu.dialog;

import com.company.logger.Logger;

import java.util.Scanner;

public abstract class AbstractDialog {
    static Logger logger = Logger.getInstance();
    static Scanner scanner = new Scanner(System.in);

     abstract int start();
     public String getUserInput() {
        return scanner.nextLine();
     }

}
