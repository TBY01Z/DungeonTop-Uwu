package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.Model.Collectables.Ethnicities;
import de.prog2.uwupatch1.Model.Collectables.PersonalityTypeCasts;
import de.prog2.uwupatch1.Model.PlayerSelf.Ethnicity;
import de.prog2.uwupatch1.Model.PlayerSelf.PersonalityTypeCast;
import de.prog2.uwupatch1.util.MyIO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class MadeCharacterStageController implements Initializable {
    @FXML
    private ImageView startDeckIcon = new ImageView();
    @FXML
    private ImageView charDeckIcon = new ImageView();
    @FXML
    private Label ethnicityLabel = new Label();
    @FXML
    private Label personalityLabel = new Label();
    @FXML
    private ImageView deckIcon01 = new ImageView(Ethnicities.ethnicities().get(0).icon());
    @FXML
    private ImageView deckIcon02 = new ImageView(Ethnicities.ethnicities().get(1).icon());
    @FXML
    private ImageView deckIcon03 = new ImageView(Ethnicities.ethnicities().get(2).icon());
    private final int ID_PARAMETER = 100000;
    private int startDeckCounter = ID_PARAMETER;
    private int charDeckCounter = ID_PARAMETER;

    @FXML
    public void toMainMenu(ActionEvent event) {
        MyIO.loadXML(event, "StartStage.fxml");
    }

    @FXML
    public void startForward() {
        startDeckCounter++;
        loadDeckOnScreen();
    }

    @FXML
    public void startBackward() {
        startDeckCounter--;
        loadDeckOnScreen();
    }

    private void loadDeckOnScreen() {
        Ethnicity active = Ethnicities.get(startDeckCounter%Ethnicities.ethnicities().size());
        startDeckIcon.setImage(active.icon());
        ethnicityLabel.setText(active.ethnicityName());
        deckIcon01.setImage(null);
        deckIcon02.setImage(null);
        deckIcon03.setImage(null);
        deckIcon01.setImage(new Image(active.ethnicityDeck().get(0).icon().getUrl()));
        deckIcon02.setImage(new Image(active.ethnicityDeck().get(1).icon().getUrl()));
        deckIcon03.setImage(new Image(active.ethnicityDeck().get(2).icon().getUrl()));
    }
    @FXML
    public void charForward() {
        charDeckCounter++;
        PersonalityTypeCast active = PersonalityTypeCasts.get(charDeckCounter%PersonalityTypeCasts.personalityTypeCasts().size());
        charDeckIcon.setImage(active.icon());
        personalityLabel.setText(active.personalityName());
    }
    @FXML
    public void charBackward() {
        charDeckCounter--;
        PersonalityTypeCast active = PersonalityTypeCasts.get(charDeckCounter%PersonalityTypeCasts.personalityTypeCasts().size());
        charDeckIcon.setImage(active.icon());
        personalityLabel.setText(active.personalityName());
    }

    /**
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        startBackward();
        charBackward();


    }
}
