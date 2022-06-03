package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.Model.InGameEvents.GameEvent;
import de.prog2.uwupatch1.util.MyIO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DungeonController {

    @FXML
    Label textLabel;

    //GameEvent ge = new GameEvent(new Trader(new int[]{2, 2, 2, 2, 2})); //random ass trader lmao

    @FXML
    public void goToMainMenu(ActionEvent event) {

        MyIO.loadXML(event, "StartStage.fxml");
    }

    public void onTileEntered(ActionEvent event){
        textLabel.setText("Aktuelles GameEvent: " + GameEvent.getCurrentEvent());
    }

    public void onFightEntered(ActionEvent event) {
        textLabel.setText("Sie haben einen Kampf betreten.");
        //nachher wird noch neue FXML Page geladen...
    }
}
