package com.prog2.uwupatch1;

import com.prog2.uwupatch1.Model.Database.InputClass;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Start extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Start.class.getResource("StartStage.fxml")));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("");
        stage.setTitle("DungeonTop UWU");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        if(InputClass.inputFill()){
            launch();
        }
    }

}