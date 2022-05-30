package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.util.MyIO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class DungeonController {


    @FXML
    public void goToMainMenu(ActionEvent event) throws Exception{

        MyIO.loadXML(event, "StartStage.fxml");
    }

}
