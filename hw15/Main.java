package com.pb.volkov.hw15;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.nio.file.Paths;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Paths.get("src/com/pb/volkov/hw15/GUI.fxml").toUri().toURL());
        Scene scene = new Scene(root);
        stage.setTitle("Messenger");
        stage.setScene(scene);
        stage.show();
    }
}