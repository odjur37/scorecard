package com.erik.scorecard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setResources(ResourceBundle.getBundle("com.erik.scorecard.application"));
        Parent root = fxmlLoader.load(getClass().getResourceAsStream("mainwindow.fxml"));
        setUserAgentStylesheet(STYLESHEET_MODENA);
        primaryStage.setTitle("ScoreCard");
        primaryStage.setScene(new Scene(root, 300, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
