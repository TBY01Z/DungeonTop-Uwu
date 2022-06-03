package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.Icon.LoadIcons;
import de.prog2.uwupatch1.View.FirstStage;
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
    private int ID_PARAMETER = 1000;
    private int startDeckCounter = ID_PARAMETER;

    private static ObservableList<Image> startImages= FXCollections.observableArrayList();
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
        startDeckCounter--;
        startDeckIcon.setImage(startImages.get((startDeckCounter%startImages.size())));
    }

    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}
