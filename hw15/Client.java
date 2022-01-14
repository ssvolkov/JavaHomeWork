package com.pb.volkov.hw15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Client extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("GUI.fxml")));
        primaryStage.setTitle("Messenger");
        primaryStage.setScene(new Scene(root, 500, 700));
        primaryStage.show();

    }

    @FXML
    public TextField textField;

    @FXML
    private TextArea textArea;

    @FXML
    public void handleSubmit(ActionEvent event) throws IOException {

        System.out.println("Run client part.");
        String servIP = "localhost";
        int servPort = 1111;
        System.out.println("Server connection: " + servIP + ":" + servPort);
        Socket server = new Socket(servIP, servPort);

        textArea.setText(textArea.getText()
                + "\n" + textField.getText()
                + "\n"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))+"\n");
        textField.clear();

        server.close();

    }
}