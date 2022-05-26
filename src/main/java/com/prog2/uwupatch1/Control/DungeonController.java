package com.prog2.uwupatch1.Control;

import com.prog2.uwupatch1.Start;
import com.prog2.uwupatch1.View.LoadFXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class DungeonController {
    private Stage stage;
    private Scene scene;

    @FXML
    public void goToMainMenu(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(Start.class.getResource("StartStage.fxml")));
        LoadFXML.loadXML(event, root);
    }

}
