package com.example.dbms;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

public class Main {
    public static void main(String[] args) {
        try (MongoClient mongoclient = new MongoClient("localhost", 27017)) {
            MongoDatabase db = mongoclient.getDatabase("movie");
            MongoCollection<Document> collection = db.getCollection("login");
            MongoCursor<Document> cursor = collection.find().iterator();
            while(cursor.hasNext()){
                String name = cursor.getString("movie name");
                int price = cursor.getInteger("ticket price");
                String image = cursor.getString("index");
            }
        }
    }
}