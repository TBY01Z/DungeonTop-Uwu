package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.util.MyIO;
import javafx.event.ActionEvent;

public class OnOnlineModeController {
    public void choseCharacterStage(ActionEvent event) {
        MyIO.loadXML(event, "choseCharacterType.fxml");
        MyIO.setOnlineMode(true);
    }

    public void loadGame(ActionEvent event) {
        MyIO.loadXML(event, "loadGameStage.fxml");
        MyIO.setOnlineMode(true);
    }
}
