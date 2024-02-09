package com.example.dbms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class bookingController {

    @FXML
    void pay(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.thanks);
    }

}
