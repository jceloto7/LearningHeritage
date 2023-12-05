package com.jceloto7.learning_heritage.view;

import com.jceloto7.learning_heritage.Bootstrap;
import com.jceloto7.learning_heritage.controller.GetRouterIPController;
import com.jceloto7.learning_heritage.service.Command;
import com.jceloto7.learning_heritage.service.GetRouterIPService;
import com.jceloto7.learning_heritage.util.InputUtil;

import java.util.Scanner;

public class CommandView {
    public void mainMenu() {
        String switchOption = "1";
        InputUtil inputUtil = Bootstrap.inputUtil;
        GetRouterIPController getRouterIPController = new GetRouterIPController(Bootstrap.getRouterIPService);

        while (!switchOption.equals("9")) {
            System.out.println("""
                    Please, choose an option:
                    1- Router IP
                    2- Ping for 8.8.8.8
                    3- Java Version
                    4- Operational System
                    9- Exit
                    """);

            switchOption = inputUtil.getInput();
            switch (switchOption) {
                case "1" -> {
                    String result = getRouterIPController.commandImpl();
                    System.out.println(result);

                }

                case "2" -> {
                    System.out.println("case 2");
                }

                case "3" -> {
                    System.out.println("case 3");
                }

                case "4" -> {
                    System.out.println("case 4");

                }

                case "9" -> {
                    inputUtil.closeScanner();
                    System.out.println("Bye.");
                }

                default -> System.out.println("Invalid option. Please try again.");
            }
        }

    }
}

