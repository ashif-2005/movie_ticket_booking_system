package com.example.dbms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage stage_var;
    public static Scene first;
    public static Scene home;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("firstpage.fxml"));
        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("homescreen.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        Scene scene1 = new Scene(fxmlLoader1.load());

        stage_var = stage;
        home = scene1;

        stage.setTitle("Movie Ticket Booking System");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}