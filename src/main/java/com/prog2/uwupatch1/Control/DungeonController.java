package com.prog2.uwupatch1.Control;

import com.prog2.uwupatch1.Start;
import com.prog2.uwupatch1.View.LoadFXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DungeonController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void goToMainMenu(ActionEvent event) throws Exception{
        root = FXMLLoader.load(Start.class.getResource("StartStage.fxml"));
        LoadFXML.loadXML(event, root);
    }

}
