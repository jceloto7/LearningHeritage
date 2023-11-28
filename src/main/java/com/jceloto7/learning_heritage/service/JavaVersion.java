package com.jceloto7.learning_heritage.service;

public class JavaVersion extends Command {
    @Override
    protected String commandImpl() {
        // Lógica para obter a versão do Java
        return "Versão do Java: " + System.getProperty("java.version");
    }

}
