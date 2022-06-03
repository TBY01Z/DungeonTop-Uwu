package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.Model.Collectables.PersonalityTypeCasts;
import de.prog2.uwupatch1.Model.Icon.LoadIcons;
import de.prog2.uwupatch1.Model.PlayerSelf.PersonalityTypeCast;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class MadeCharacterStageController implements Initializable {
    @FXML
    private ImageView startDeckIcon = new ImageView();
    @FXML
    private ImageView charDeckIcon = new ImageView();
    private int ID_PARAMETER = 1000;
    private int startDeckCounter = ID_PARAMETER;
    private int charDeckCounter = ID_PARAMETER;

    private static ObservableList<Image> startImages= FXCollections.observableArrayList();
    private static ObservableList<Image> charImages= FXCollections.observableArrayList();

    public static void fillStartImages(){
        startImages.add(new Image(String.valueOf(LoadIcons.class.getResource("startIcon01.png"))));
        startImages.add(new Image(String.valueOf(LoadIcons.class.getResource("startIcon02.png"))));
        startImages.add(new Image(String.valueOf(LoadIcons.class.getResource("startIcon03.png"))));

    }
    @FXML
    public void startForward(ActionEvent event) {
        startDeckCounter++;
        startDeckIcon.setImage(startImages.get((startDeckCounter%startImages.size())));
    }
    @FXML
    public void startBackward(ActionEvent event) {
        charDeckCounter--;
        charDeckIcon.setImage(charImages.get((charDeckCounter%charImages.size())));
    }

    @FXML
    public void charForward(ActionEvent event) {
        charDeckCounter++;
        charDeckIcon.setImage(charImages.get((charDeckCounter%charImages.size())));
    }
    @FXML
    public void charBackward(ActionEvent event) {
        charDeckCounter--;
        charDeckIcon.setImage(charImages.get((charDeckCounter%charImages.size())));
    }
    public static void fillCharImages(){
        ObservableList<PersonalityTypeCast> aracterTypes = PersonalityTypeCasts.getClassTypes();
        for (PersonalityTypeCast charrr:
             aracterTypes) {
            charImages.add(charrr.icon());
        }
    }
    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        charDeckIcon.setImage(charImages.get(0));
        startDeckIcon.setImage(startImages.get(0));


    }
}
