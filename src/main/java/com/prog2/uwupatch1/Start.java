package com.prog2.uwupatch1;

import com.prog2.uwupatch1.Model.Database.InputClass;
import com.prog2.uwupatch1.View.ViewManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

import java.util.Objects;

public class Start extends Application {

//    private static int resWidth;
//    private static int resHeight;

    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(Objects.requireNonNull(Start.class.getResource("StartStage.fxml")));
//        Scene scene = new Scene(root);
//        //Canvas canvas = new Canvas(resWidth, resHeight); <-- das wär vielleicht mal ne idee für die resolution settings
//        stage.setResizable(false);
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("");
//        stage.setTitle("DungeonTop UWU");
//        stage.setScene(scene);
        ViewManager vm = new ViewManager();
//        ViewManager.setHeight(720);
//        ViewManager.setWidth(1280);       //so könnte man die einstellungen ändern
//        ViewManager.setFullscreen(true);    //TODO: grafische einstellungen in der UI implementieren mit menüs und so
        stage = vm.getMainStage();
        stage.show();
    }

    public static void main(String[] args) {
        if(InputClass.inputFill()){
            launch();
        }
    }

}