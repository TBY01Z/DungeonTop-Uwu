package com.prog2.uwupatch1.Control;

import com.prog2.uwupatch1.Start;
import com.prog2.uwupatch1.View.LoadFXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class StartContoller {
    private Parent root;
    private Scene scene;
    private Stage stage;

    private final Pane pane = new Pane();

    @FXML
    protected void onSettingChange(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(Start.class.getResource("SettingStage.fxml")));
        LoadFXML.loadXML(event,root);
    }
    @FXML
    public void goToMainMenu(ActionEvent event) throws Exception{
        root = FXMLLoader.load(Objects.requireNonNull(Start.class.getResource("StartStage.fxml")));
        LoadFXML.loadXML(event, root);
    }

    @FXML
    public void goToDungeonScene(ActionEvent event) throws Exception{
        root = FXMLLoader.load(Objects.requireNonNull(Start.class.getResource("Dungeon.fxml")));
        LoadFXML.loadXML(event, root);
    }

    @FXML
    public void applicationQuit(){
        javafx.application.Platform.exit();
    }
}