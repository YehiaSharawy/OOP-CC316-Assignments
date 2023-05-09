package com.example.question2;

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
        for(int i =0; i<3;i++){
            for(int j=0; j<3;j++){
                int random = (int)(Math.random()*2);
                ImageView x = new ImageView(new Image("file:images/x.png"));
                x.setFitWidth(50);
                x.setFitHeight(50);
                ImageView o = new ImageView(new Image("file:images/o.png"));
                o.setFitWidth(50);
                o.setFitHeight(50);
                if(random == 0)
                    gridPane.add(x,j,i);
                else
                    gridPane.add(o,j,i);
            }
        }

        Stage s1 = new Stage();
        s1.setScene(new Scene(gridPane));
        s1.show();
        s1.setTitle("Exercise14_02");
    }

    public static void main(String[] args) {
        launch();
    }
}