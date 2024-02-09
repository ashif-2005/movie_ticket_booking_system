module com.example.dbms {
    requires javafx.controls;
    requires javafx.fxml;
    requires mongo.java.driver;


    opens com.example.dbms to javafx.fxml;
    exports com.example.dbms;
}