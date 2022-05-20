package com.prog2.uwupatch1.View;

import com.prog2.uwupatch1.Start;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DungeonController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void goToMainMenu(ActionEvent event) throws Exception{
        root = FXMLLoader.load(Start.class.getResource("StartStage.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void goToDungeonScene(ActionEvent event) throws Exception{
        root = FXMLLoader.load(Start.class.getResource("Dungeon.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
