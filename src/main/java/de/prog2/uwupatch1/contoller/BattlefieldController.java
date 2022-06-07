package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.Model.Items.Cards.EffectCard;
import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Usable;
import de.prog2.uwupatch1.Model.PlayerSelf.Player;
import de.prog2.uwupatch1.util.MyIO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static de.prog2.uwupatch1.util.MyIO.loadIcon;
//v1
public class BattlefieldController implements Initializable {

    @FXML
    Label gegnerLabel;  //verwendet fuer die anzeige der gegnernamen.
    @FXML
    private ImageView tile1 = new ImageView();
    @FXML
    private ImageView tile2 = new ImageView();
    @FXML
    private ImageView tile3 = new ImageView();
    @FXML
    private ImageView tile4 = new ImageView();
    @FXML
    private ImageView tile5 = new ImageView();
    @FXML
    private ImageView tile6 = new ImageView();
    @FXML
    private ImageView tile7 = new ImageView();
    @FXML
    private ImageView tile8 = new ImageView();
    @FXML
    private ImageView tile9 = new ImageView();
    @FXML
    private ImageView tile10 = new ImageView();
    @FXML
    private ImageView tile11 = new ImageView();
    @FXML
    private ImageView tile12 = new ImageView();
    @FXML
    private ImageView tile13 = new ImageView();
    @FXML
    private ImageView tile14 = new ImageView();
    @FXML
    private ImageView tile15 = new ImageView();
    @FXML
    private ImageView tile16 = new ImageView();
    @FXML
    private ProgressBar manaBar = new ProgressBar();
    private double manaBarProgress; //wertebereich: darf nur zwischen 0 und 1 liegen.
    @FXML
    private ImageView effectView = new ImageView();


    private final Image newCard = loadIcon("hello.png");
    private final Image showEffect = loadIcon(EffectCard.icon().toString());

    public void onTile1Place(){
        tile1.setImage(newCard);
    }

    public void onTile2Place(){
        tile2.setImage(newCard);
    }

    public void onTile3Place(){
        tile3.setImage(newCard);
    }

    public void onTile4Place(){
        tile4.setImage(newCard);
    }

    public void onTile5Place(){
        tile5.setImage(newCard);
    }

    public void onTile6Place(){
        tile6.setImage(newCard);
    }

    public void onTile7Place(){
        tile7.setImage(newCard);
    }

    public void onTile8Place(){
        tile8.setImage(newCard);
    }

    public void onTile9Place(){
        tile9.setImage(newCard);
    }

    public void onTile10Place(){
        tile10.setImage(newCard);
    }

    public void onTile11Place(){
        tile11.setImage(newCard);
    }

    public void onTile12Place(){
        tile12.setImage(newCard);
    }

    public void onTile13Place(){
        tile13.setImage(newCard);
    }

    public void onTile14Place(){
        tile14.setImage(newCard);
    }

    public void onTile15Place(){
        tile15.setImage(newCard);
    }

    public void onTile16Place(){
        tile16.setImage(newCard);
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
        tile2.setImage(loadIcon("penis.jpg"));
        tile3.setImage(loadIcon("penis.jpg"));
        tile4.setImage(loadIcon("penis.jpg"));
        tile5.setImage(loadIcon("penis.jpg"));
        tile6.setImage(loadIcon("penis.jpg"));
        tile7.setImage(loadIcon("penis.jpg"));
        tile8.setImage(loadIcon("penis.jpg"));
        tile9.setImage(loadIcon("penis.jpg"));
        tile10.setImage(loadIcon("penis.jpg"));
        tile11.setImage(loadIcon("penis.jpg"));
        tile12.setImage(loadIcon("penis.jpg"));
        tile13.setImage(loadIcon("penis.jpg"));
        tile14.setImage(loadIcon("penis.jpg"));
        tile15.setImage(loadIcon("penis.jpg"));
        tile16.setImage(loadIcon("penis.jpg"));
//        effectView.setImage(loadIcon(EffectCard.icon()));     //TODO: standard image muss provided werden.
        manaBar.setStyle("-fx-accent: blue;");
    }

    public void getLabelFeedback(ActionEvent event){
        gegnerLabel.setText("Das war der bisher nutzlose Button :)");
        updateMana();
    }

    @FXML
    protected void onMainMenuChange(ActionEvent event) {
        MyIO.loadXML(event, "StartStage.fxml");
    }

    public void updateMana(){
        setManaBarProgress(getManaBarProgress() + 0.1);
        manaBar.setProgress(getManaBarProgress());
        //TODO: vielleicht noch ein art "prestige-system" entwerfen, damit mana val nicht immer 0-1 sein muss...?
    }
    public double getManaBarProgress() {
        return manaBarProgress;
    }

    public void setManaBarProgress(double manaBarProgress) {
        this.manaBarProgress = manaBarProgress;
    }

    public void onEndTurn(ActionEvent event){
        gegnerLabel.setText("Zug wurde beendet!");
        setManaBarProgress(getManaBarProgress() - 0.8); //weil wieso auch nicht?
    }

    public void onShowDeck(ActionEvent event){
        gegnerLabel.setText("Deck wird gezeigt! jk funktioniert noch nicht");
        setManaBarProgress(getManaBarProgress() - 0.2); //weil wieso auch nicht?
    }

    public void updateEffectIcon(){
        effectView.setImage(EffectCard.icon());
    }
}
