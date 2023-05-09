package com.example.question1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        GridPane gridPane = new GridPane();
        gridPane.add(new ImageView(new Image("file:images/uk.png")),0,0);
        gridPane.add(new ImageView(new Image("file:images/ca.jpeg")),1,0);
        gridPane.add(new ImageView(new Image("file:images/china.png")),0,1);
        gridPane.add(new ImageView(new Image("file:images/us.png")),1,1);

        Stage s1 = new Stage();
        s1.setScene(new Scene(gridPane));
        s1.setTitle("Exercise14_01");
        s1.show();
    }

    public static void main(String[] args) {
        launch();
    }
}