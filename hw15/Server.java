package com.pb.volkov.hw15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static class Echo implements Runnable {
        private final Socket clientSocket;

        Echo(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            BufferedReader in = null;
            PrintWriter out = null;
            ServerSocket server = null;

            try {
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String clientMessage = null;

            while (true) {

                try {
                    assert in != null;
                    if ((clientMessage = in.readLine()) == null) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if ("Exit".equalsIgnoreCase(clientMessage)) {
                    break;
                }

                assert out != null;
                out.println("Server: " + clientMessage + " | Date stamp: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
                System.out.println(clientMessage);
            }

            assert out != null;
            out.close();

            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                assert false;
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) throws IOException {

        int port = 1111;
        ServerSocket server = new ServerSocket(port);
        System.out.println("Run server.");
        System.out.println("Waiting for connection...");
        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        while (true) {
            Socket clientSocket = server.accept();
            threadPool.submit(new Server.Echo(clientSocket));
            System.out.println("New user joined session.");
        }

    }
}