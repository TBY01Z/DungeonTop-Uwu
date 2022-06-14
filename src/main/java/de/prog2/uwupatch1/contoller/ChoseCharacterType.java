package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.util.MyIO;
import javafx.event.ActionEvent;

public class ChoseCharacterType {
    private static boolean adventureMode;


    public void toAdventure(ActionEvent event) {
        adventureMode = true;
        MyIO.loadXML(event,"MadeCharacterStage.fxml");
    }

    public void toDungeonMaster(ActionEvent event) {
        adventureMode = false;
        MyIO.loadXML(event,"MadeCharacterStage.fxml");
    }

    public void onMenu(ActionEvent event) {
        MyIO.loadXML(
                event,"StartStage.fxml"
        );
    }

    public static boolean adventureMode() {
        return adventureMode;
    }

    public static void setAdventureMode(boolean adventureMode) {
        ChoseCharacterType.adventureMode = adventureMode;
    }
}
