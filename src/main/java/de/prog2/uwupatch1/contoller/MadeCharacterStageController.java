package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.FirstStage;
import de.prog2.uwupatch1.Model.Database.StartDecks;
import de.prog2.uwupatch1.Model.PlayerAttachment.Deck;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class MadeCharacterStageController implements Initializable {
    @FXML
    private ImageView startDeckIcon;
    private int startDeckCounter;
    private int ID_PARAMETER = 100;
    private int INDEX_CONST = -1;
    private static ObservableList<Image> startImages= FXCollections.observableArrayList();
    public static void fillStartImages(String resourses){
        startImages.add(new Image(String.valueOf(FirstStage.class.getResource("startIcon01.png"))));
        startImages.add(new Image(String.valueOf(FirstStage.class.getResource("startIcon02.png"))));


    }
    @FXML
    public void startForward(ActionEvent event) {
        startDeckCounter++;
        startDeckIcon.setImage(startImages.get(startDeckCounter%(startImages.size()+INDEX_CONST)));
    }
    @FXML
    public void startBackward(ActionEvent event) {
        startDeckCounter--;
        startDeckIcon.setImage(startImages.get(startDeckCounter%(startImages.size()+INDEX_CONST)));
    }

    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        startDeckIcon = new ImageView();
        startDeckIcon.setImage(startImages.get(0));

    }
}
