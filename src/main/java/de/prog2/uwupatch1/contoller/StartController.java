package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.util.MyIO;
import javafx.event.ActionEvent;

import java.io.IOException;

public class StartController {

    public void onCharacterChose(ActionEvent event)throws IOException{
        MyIO.loadXML(event, "choseCharacterType.fxml");
    }

    public void onSettingChange(ActionEvent event) throws IOException {
        MyIO.loadXML(event, "SettingStage.fxml");
    }

    public void goToMainMenu(ActionEvent event) throws Exception{
        MyIO.loadXML(event, "StartStage.fxml");
    }


    public void goToDungeonScene(ActionEvent event) throws Exception{
        MyIO.loadXML(event, "Dungeon.fxml");
    }


    public void applicationQuit(){
        javafx.application.Platform.exit();
    }


}