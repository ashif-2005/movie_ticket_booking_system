package com.example.dbms;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    void getstarted() {
        HelloApplication.stage_var.setScene(HelloApplication.home);
    }
}