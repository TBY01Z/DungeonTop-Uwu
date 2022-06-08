package de.prog2.uwupatch1.View;

import de.prog2.uwupatch1.Model.Collectables.InputClass;
import de.prog2.uwupatch1.contoller.SettingStageControl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstStage extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FirstStage.class.getResource("StartStage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), SettingStageControl.WIDTH(), SettingStageControl.HIGHT());
        stage.setTitle("DungeonTop UWU");
        stage.setMaximized(!stage.isMaximized());
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        if(InputClass.inputFill()){
            Application.launch(FirstStage.class, args);
        }
    }
}
