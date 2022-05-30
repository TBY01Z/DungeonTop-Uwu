package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.util.MyIO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SettingStageControl {
    private Scene scene;
    private Stage stage;

    @FXML
    protected void onMainMenuChange(ActionEvent event) throws IOException {
        MyIO.loadXML(event, "StartStage.fxml");
    }

    @FXML
    public void onFullscreenClick() {
        stage.setFullScreen(!stage.isFullScreen()); //this.stage ist wohl null
    }
}
