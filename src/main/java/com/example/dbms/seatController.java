package com.example.dbms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class seatController {

    @FXML
    private Button button;
    @FXML
    void color() {
        button.setStyle("-fx-background-color: lightgreen;");
    }

    @FXML
    void select(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.booking);
    }

}
