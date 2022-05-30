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
    private static double WIDTH = 1500;
    private static double HIGHT = 800;

    @FXML
    protected void onMainMenuChange(ActionEvent event) throws IOException {
        MyIO.loadXML(event, "StartStage.fxml");
    }

    @FXML
    public void onFullscreenClick() {
        stage.setFullScreen(!stage.isFullScreen()); //this.stage ist wohl null
    }

    // getter & setter

    public static double WIDTH() {
        return WIDTH;
    }

    public static void setWIDTH(double WIDTH) {
        WIDTH = WIDTH;

    }

    public static double HIGHT() {
        return HIGHT;
    }

    public static void setHIGHT(double HIGHT) {
        HIGHT = HIGHT;

    }
}
