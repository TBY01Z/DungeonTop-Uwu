package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.util.MyIO;
import javafx.event.ActionEvent;

public class OnLocalModeControl {
    public void choseCharacterStage(ActionEvent event) {
        MyIO.loadXML(event, "choseCharacterType.fxml");
    }

    public void loadGame(ActionEvent event) {
        MyIO.loadXML(event, "choseCharacterType.fxml");
    }
}
