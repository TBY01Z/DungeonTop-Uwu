package com.prog2.uwupatch1.View;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoadFXML {
    private static Scene scene;
    private static Stage stage;

    public static void loadXML(ActionEvent event, Parent root){
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(false);
        stage.setResizable(false);
        stage.setFullScreen(true);
        stage.show();
    }
}
