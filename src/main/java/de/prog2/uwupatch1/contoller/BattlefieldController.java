package de.prog2.uwupatch1.contoller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static de.prog2.uwupatch1.util.MyIO.loadIcon;

public class BattlefieldController implements Initializable {

    @FXML
    Label gegnerLabel;  //verwendet fuer die anzeige der gegnernamen.
    @FXML
    private ImageView tile1 = new ImageView();
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

    private final Image newCard = loadIcon("hello.png");

    public void placeTestCard(){
        tile1.setImage(newCard);
    }

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  {@code null} if the location is not known.
     * @param resources The resources used to localize the root object, or {@code null} if
     *                  the root object was not localized.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tile1.setImage(loadIcon("penis.jpg"));
    }
}
