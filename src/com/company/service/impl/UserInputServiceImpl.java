package com.company.service.impl;

import com.company.service.UserInputService;

import java.util.Scanner;

public class UserInputServiceImpl implements UserInputService {
    private final Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public Integer getInteger() {
        return scanner.nextInt();
    }

}
