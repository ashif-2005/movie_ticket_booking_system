package com.example.dbms;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import model.model;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class homecontroller {

    @FXML
    private HBox filim;

    @FXML
    private HBox trending;

    private List<model> Filim;
    private List<model> Movie;

    public void initialize() throws IOException {
        Filim = new ArrayList<>(Trending());
        Movie = new ArrayList<>(Today());
        for(int i=0;i<Filim.size();i++){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("card.fxml"));
            HBox cardbox = fxmlLoader.load();
            cardcontroller controller = fxmlLoader.getController();
            controller.setData(Filim.get(i));
            trending.getChildren().add(cardbox);
        }
        for(int i=0;i<Movie.size();i++){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("card1.fxml"));
            HBox cardbox = fxmlLoader.load();
            cardcontroller controller = fxmlLoader.getController();
            controller.setData(Movie.get(i));
            filim.getChildren().add(cardbox);
        }
    }

    private List<model> Trending() {
        List<model> l = new ArrayList<>();
        try (MongoClient mongoclient = new MongoClient("localhost", 27017)) {
            MongoDatabase db = mongoclient.getDatabase("movie");
            MongoCollection<Document> collection = db.getCollection("trending");
            MongoCursor<Document> cursor = collection.find().iterator();
            while(cursor.hasNext()){
                model obj = new model();
                Document document = cursor.next();
                String name = document.getString("movie name");
                int price = document.getInteger("ticket price");
                String image = document.getString("index");
                obj.setName(name);
                obj.setPrice(price);
                obj.setImage(image);
                l.add(obj);
            }
            return l;
        }
    }

    private List<model> Today() {
        List<model> l1 = new ArrayList<>();
        try (MongoClient mongoclient = new MongoClient("localhost", 27017)) {
            MongoDatabase db = mongoclient.getDatabase("movie");
            MongoCollection<Document> collection = db.getCollection("movie");
            MongoCursor<Document> cursor = collection.find().iterator();
            while(cursor.hasNext()){
                model obj = new model();
                Document document = cursor.next();
                String name = document.getString("movie name");
                int price = document.getInteger("ticket price");
                String image = document.getString("index");
                obj.setName(name);
                obj.setPrice(price);
                obj.setImage(image);
                l1.add(obj);
            }
            return l1;
        }
    }
}
