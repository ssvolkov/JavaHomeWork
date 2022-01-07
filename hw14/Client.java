package com.pb.volkov.hw14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        System.out.println("Run client part.");
        String servIP = "localhost";
        int servPort = 1111;
        System.out.println("Server connection: " + servIP + ":" + servPort);
        Socket server = new Socket(servIP, servPort);
        BufferedReader inServer = new BufferedReader(new InputStreamReader(server.getInputStream()));
        PrintWriter outServer = new PrintWriter(server.getOutputStream(),true);
        BufferedReader inConsole = new BufferedReader(new InputStreamReader(System.in));

        String dataFromUser, dataFromServer;

        while ((dataFromUser = inConsole.readLine()) != null){
            outServer.println(dataFromUser);
            dataFromServer = inServer.readLine();
            System.out.println(dataFromServer);
            if ("Exit".equalsIgnoreCase(dataFromUser)){
                break;
            }
        }

        outServer.close();
        inServer.close();
        outServer.close();
        server.close();

    }
}