package com.prog2.uwupatch1.Control;

import com.prog2.uwupatch1.Start;
import com.prog2.uwupatch1.View.LoadFXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SettingStageControl {
    private Scene scene;
    private Stage stage;

    @FXML
    protected void onMainMenuChange(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Start.class.getResource("StartStage.fxml")));
        LoadFXML.loadXML(event, root);
    }

    @FXML
    public void onFullscreenClick() {
        stage.setFullScreen(!stage.isFullScreen()); //this.stage ist wohl null
    }
}
