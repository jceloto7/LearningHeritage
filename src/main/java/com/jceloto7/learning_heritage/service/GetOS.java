package com.jceloto7.learning_heritage.service;

public class GetOS extends Command {
        @Override
        protected String commandImpl() {
            // Lógica para obter o sistema operacional
            return "Sistema Operacional: " + System.getProperty("os.name");
        }
    }



