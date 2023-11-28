package com.jceloto7.learning_heritage.service;

public class GetRouterIPService extends Command {
    @Override
    protected String commandImpl() {
        // Lógica para obter o IP do roteador
        return "IP do roteador: 192.168.1.1";
    }

}
