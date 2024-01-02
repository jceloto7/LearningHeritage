package com.jceloto7.learning_heritage.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PingService extends Command {
    @Override
    protected String commandImpl() {
        String ipAddress = "8.8.8.8"; // Endereço IP padrão
        StringBuilder commandOutput = new StringBuilder();
        try {
            Process process = Runtime.getRuntime().exec("ping " + ipAddress);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                commandOutput.append(line).append("\n");
            }

            int exitCode = process.waitFor();
            commandOutput.append("\nComando ping concluído com código de saída: ").append(exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return commandOutput.toString();
    }
    }