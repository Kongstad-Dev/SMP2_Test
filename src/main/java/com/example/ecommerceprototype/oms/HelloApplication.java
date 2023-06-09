package com.example.ecommerceprototype.oms;

import com.example.ecommerceprototype.oms.DB.StockInterface;
import com.example.ecommerceprototype.oms.MockShop.PlaceholderInstShop;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application implements StockInterface {
    @Override
    public void start(Stage stage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        StockInterface.sendOrderOMS(PlaceholderInstShop.getInstShop1());


    }

    public static void main(String[] args) {
        launch();
    }
}



