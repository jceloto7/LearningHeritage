package com.jceloto7.learning_heritage.service;

public class PingService extends Command {
    @Override
    protected String commandImpl() {
        // Lógica para executar o ping
        return "Ping para 8.8.8.8: sucesso";
    }

}
