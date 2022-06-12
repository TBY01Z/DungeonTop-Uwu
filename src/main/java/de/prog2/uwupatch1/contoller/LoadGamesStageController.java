package de.prog2.uwupatch1.contoller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LoadGamesStageController implements Initializable {
    @FXML
    private Button save00 = new Button();
    @FXML
    private Button save01 = new Button();
    @FXML
    private Button save02 = new Button();
    @FXML
    private Button save03 = new Button();
    @FXML
    private Button save04 = new Button();
    @FXML
    private Button save05 = new Button();
    @FXML
    private Button save06 = new Button();
    @FXML
    private Button save07 = new Button();
    @FXML
    private Button save08 = new Button();
    @FXML
    private Button save09 = new Button();
    @FXML
    private Button save10 = new Button();
    @FXML
    private Button save11 = new Button();
    @FXML
    private Button save12 = new Button();
    private final ArrayList<Button> savesButton = new ArrayList<Button>();




    private void fillSaves() {
        savesButton.add(save00);
        savesButton.add(save01);
        savesButton.add(save02);
        savesButton.add(save03);
        savesButton.add(save04);
        savesButton.add(save05);
        savesButton.add(save06);
        savesButton.add(save07);
        savesButton.add(save08);
        savesButton.add(save09);
        savesButton.add(save10);
        savesButton.add(save11);
        savesButton.add(save12);
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
        fillSaves();
    }


}
