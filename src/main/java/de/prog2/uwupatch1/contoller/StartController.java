package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.util.MyIO;
import javafx.event.ActionEvent;

public class StartController {

    public void onCharacterChose(ActionEvent event) {
        MyIO.loadXML(event, "choseCharacterType.fxml");
    }

    public void onSettingChange(ActionEvent event) {
        MyIO.loadXML(event, "SettingStage.fxml");
    }

    public void goToMainMenu(ActionEvent event) {
        MyIO.loadXML(event, "StartStage.fxml");
    }


    public void goToDungeonScene(ActionEvent event) {
        MyIO.loadXML(event, "Battlefield.fxml");
    }


    public void applicationQuit(){
        javafx.application.Platform.exit();
    }


}