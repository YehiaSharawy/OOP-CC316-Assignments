package com.example.question3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.setAlignment(Pos.CENTER);

        Label label = new Label("Java");
        label.setRotate(90);
        label.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        int i=0;
        do{
            label.setTextFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
            hbox.getChildren().addAll(label);
            i++;
        }while(i<5);


        Stage s1 = new Stage();
        s1.setScene(new Scene(hbox,200,200));
        s1.show();
    }

    public static void main(String[] args) {
        launch();
    }
}