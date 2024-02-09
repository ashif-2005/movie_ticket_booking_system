package com.example.dbms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.model;

public class cardcontroller {

    @FXML
    private ImageView img;

    @FXML
    private Label name;

    @FXML
    private Label price;

    @FXML
    void buy(ActionEvent event) {
        System.out.println("Buy Button Pressed");
    }

    void setData(model data){
        Image image = new Image("C:\\Users\\Ashif\\Desktop\\java\\dbms\\src\\main\\resources\\com\\example\\dbms\\movie\\"+data.getImage()+".jpeg");
        img.setImage(image);
        name.setText(data.getName());
        price.setText(String.valueOf(data.getPrice()));
    }
}
