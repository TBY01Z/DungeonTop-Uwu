package de.prog2.uwupatch1.contoller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class BattlefieldController {

    @FXML
    Label gegnerLabel;  //verwendet fuer die anzeige der gegnernamen.
    @FXML
    ImageView tile1;
    @FXML
    ImageView tile2;
    @FXML
    ImageView tile3;
    @FXML
    ImageView tile4;
    @FXML
    ImageView tile5;
    @FXML
    ImageView tile6;
    @FXML
    ImageView tile7;
    @FXML
    ImageView tile8;
    @FXML
    ImageView tile9;
    @FXML
    ImageView tile10;
    @FXML
    ImageView tile11;
    @FXML
    ImageView tile12;
    @FXML
    ImageView tile13;
    @FXML
    ImageView tile14;
    @FXML
    ImageView tile15;
    @FXML
    ImageView tile16;      //fml dude

    Image newCard = new Image(getClass().getResourceAsStream("hello.png"));

    public void placeTestCard(){
        tile1.setImage(newCard);
    }

}
