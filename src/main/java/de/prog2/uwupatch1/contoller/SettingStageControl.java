package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.util.MyIO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.awt.*;

public class SettingStageControl {
    private Scene scene;
    private Stage stage;

    @FXML
    protected void onMainMenuChange(ActionEvent event) {
        MyIO.loadXML(event, "StartStage.fxml");
    }

    @FXML
    private CheckBox fsCheckbox;
    public void onFullscreenClick(ActionEvent event) {
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        fsCheckbox.setSelected(!stage.isFullScreen());
        stage.setFullScreen(!stage.isFullScreen());
    }

    // getter & setter

    public static double WIDTH() {
        return 1536;
    }

    public static void setWIDTH(double WIDTH) {

    }

    public static double HIGHT() {
        return 788;
    }

    public static void setHEIGHT(double HEIGHT) {

    }
}
