package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.util.MyIO;
import javafx.event.ActionEvent;

public class StartController {

    public void onlineChose(ActionEvent event) {
        MyIO.loadXML(event, "onOnlineMode.fxml");
    }

    public void onSettingChange(ActionEvent event) {
        MyIO.loadXML(event, "SettingStage.fxml");
    }

    public void goToMainMenu(ActionEvent event) {
        MyIO.loadXML(event, "StartStage.fxml");
    }


    public void onLocalChose(ActionEvent event) {
        MyIO.loadXML(event, "onLocalMode.fxml");
    }


    public void applicationQuit(){
        javafx.application.Platform.exit();
    }


}