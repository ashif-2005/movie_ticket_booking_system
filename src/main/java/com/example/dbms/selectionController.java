package com.example.dbms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class selectionController {

    @FXML
    private Button button;

    @FXML
    private Button button1;
    @FXML
    void next(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.payment);
    }

    @FXML
    void select(ActionEvent event) {
        button.setStyle("-fx-background-color: white;");
    }

    @FXML
    void select1(ActionEvent event) {
        button1.setStyle("-fx-background-color: white;");
    }

}
