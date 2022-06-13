package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.Model.Audio.AudioController;
import de.prog2.uwupatch1.Model.Items.Cards.Card;
import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Deck;
import de.prog2.uwupatch1.Model.PlayerSelf.Player;
import de.prog2.uwupatch1.util.MyIO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

import static de.prog2.uwupatch1.util.MyIO.loadIcon;
//v1
public class BattlefieldController implements Initializable {
    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  {@code null} if the location is not known.
     * @param resources The resources used to localize the root object, or {@code null} if
     *                  the root object was not localized.
     *
     **/

    @FXML
    Label generalFeedbackLabel;
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
    private ImageView battlefieldBackgroundImg = new ImageView();
    @FXML
    private ProgressBar manaBar = new ProgressBar();
    private double manaBarProgress; //wertebereich: darf nur zwischen 0 und 1 liegen.

    ObservableList<Card> tmpDeckList = FXCollections.observableArrayList();
    ObservableList<Image> iconTmpDeck = FXCollections.observableArrayList();
    @FXML
    private ToggleButton card1;
    @FXML
    private ToggleButton card2;
    @FXML
    private ToggleButton card3;
    @FXML
    private ToggleButton card4;
    @FXML
    private ToggleButton card5;
    private ToggleGroup deckSelector = new ToggleGroup();

    @FXML
    private ImageView card1View = new ImageView();
    @FXML
    private ImageView card2View = new ImageView();
    @FXML
    private ImageView card3View = new ImageView();
    @FXML
    private ImageView card4View = new ImageView();
    @FXML
    private ImageView card5View = new ImageView();
    @FXML
    private Label redrawCounter;

    private int maxDraws = 3;

    private Player player = MadeCharacterStageController.player();

//    private Image newCard = loadIcon("testImg1.png");   //TODO: unterschiedliche icons laden
//    private final Image showEffect = loadIcon(EffectCard.icon().toString());

    public void onTile1Place(){
        cardSelector(tile1);
    }

    public void onTile2Place(){
        cardSelector(tile2);
    }

    public void onTile3Place(){
        cardSelector(tile3);
    }

    public void onTile4Place(){
        cardSelector(tile4);
    }

    public void onTile5Place(){
        cardSelector(tile5);
    }

    public void onTile6Place(){
        cardSelector(tile6);
    }

    public void onTile7Place(){
        cardSelector(tile7);
    }

    public void onTile8Place(){
        cardSelector(tile8);
    }

    public void onTile9Place(){
        cardSelector(tile9);
    }

    public void onTile10Place(){
        cardSelector(tile10);
    }

    public void onTile11Place(){
        cardSelector(tile11);
    }

    public void onTile12Place(){
        cardSelector(tile12);
    }

    public void onTile13Place(){
        cardSelector(tile13);
    }

    public void onTile14Place(){
        cardSelector(tile14);
    }

    public void onTile15Place(){
        cardSelector(tile15);
    }

    public void onTile16Place(){
        cardSelector(tile16);
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
        tile1.setImage(loadIcon("battlefieldTile.png"));
        tile2.setImage(loadIcon("battlefieldTile.png"));
        tile3.setImage(loadIcon("battlefieldTile.png"));
        tile4.setImage(loadIcon("battlefieldTile.png"));
        tile5.setImage(loadIcon("battlefieldTile.png"));
        tile6.setImage(loadIcon("battlefieldTile.png"));
        tile7.setImage(loadIcon("battlefieldTile.png"));
        tile8.setImage(loadIcon("battlefieldTile.png"));
        tile9.setImage(loadIcon("battlefieldTile.png"));
        tile10.setImage(loadIcon("battlefieldTile.png"));
        tile11.setImage(loadIcon("battlefieldTile.png"));
        tile12.setImage(loadIcon("battlefieldTile.png"));
        tile13.setImage(loadIcon("battlefieldTile.png"));
        tile14.setImage(loadIcon("battlefieldTile.png"));
        tile15.setImage(loadIcon("battlefieldTile.png"));
        tile16.setImage(loadIcon("battlefieldTile.png"));
        battlefieldBackgroundImg.setImage(loadIcon("battlefieldBackground.png"));
//        effectView.setImage(loadIcon(EffectCard.icon().toString()));
        manaBar.setStyle("-fx-accent: blue;");
//        card1.setStyle("-fx-background-image: url()");     //TODO: alle toggle buttons mit den karten versehen usw usw
        redrawCounter.setText("3");
        hand();
    }

    public void getLabelFeedback(ActionEvent event){
        generalFeedbackLabel.setText("reagiert button? updated mana? spielt sound?");
        increaseMana(0.2);
        new AudioController("menuClick");
    }

    @FXML
    protected void onMainMenuChange(ActionEvent event) {
        MyIO.loadXML(event, "StartStage.fxml");
        new AudioController("menuClick");
    }

    public double getManaBarProgress() {
        return manaBarProgress;
    }

    public void setManaBarProgress(double manaBarProgress) {
        this.manaBarProgress = manaBarProgress;
    }

    public void decreaseMana(double decrementVal){
        if(getManaBarProgress() != 0 && getManaBarProgress() >= decrementVal) {
            setManaBarProgress(getManaBarProgress() - decrementVal);
            manaBar.setProgress(getManaBarProgress());
        } else{
            System.out.print("decreaseMana() not possible - Mana is =0 and/or smaller than the decrementVal \n");
        }
    }

    public void increaseMana(double incrementVal){
        if(getManaBarProgress() < 1 && getManaBarProgress() < 1 + incrementVal) {
            setManaBarProgress(getManaBarProgress() + incrementVal);
            manaBar.setProgress(getManaBarProgress());
        } else{
            System.out.print("increaseMana() not possible - Mana is bigger than 1 and/or the incrementVal won't fit! \n");
        }
    }

    public void onEndTurn(ActionEvent event){
        generalFeedbackLabel.setText("Zug wurde beendet!");
        increaseMana(0.2);
        new AudioController("menuClick");
    }

    public void deckList(){
        while(tmpDeckList.size() != 20) {
            tmpDeckList.add(Deck.draw());
            System.out.println(tmpDeckList);
        }
    }

    public void redrawDeck(ActionEvent event){
        if(maxDraws != 0) {
            hand();
            maxDraws--;
        } else {
            generalFeedbackLabel.setText("Keine Karten mehr :(");
        }
        switch(maxDraws){
            case 0: redrawCounter.setText("0");
                break;
            case 1: redrawCounter.setText("1");
                break;
            case 2: redrawCounter.setText("2");
                break;
            case 3: redrawCounter.setText("3");
                break;
            default: redrawCounter.setText("");
        }
    }

    public void hand(){
        Image card1Drawn = Deck.draw().icon();
        Image card2Drawn = Deck.draw().icon();
        Image card3Drawn = Deck.draw().icon();
        Image card4Drawn = Deck.draw().icon();
        Image card5Drawn = Deck.draw().icon();
        card1View.setImage(Deck.draw().icon());
        card2View.setImage(Deck.draw().icon());
        card3View.setImage(Deck.draw().icon());
        card4View.setImage(Deck.draw().icon());
        card5View.setImage(Deck.draw().icon());
    }

    public void cardSelector(ImageView tile){

//        deckSelector.getToggles().addAll(card1, card2, card3, card4, card5);    //damit nur eine auf einmal gewaehlt werden kann

        if(card1.isSelected() == true && manaBarProgress >= 0.3){
//            Image newCard = loadIcon("testImg1.png");
//            tile.setImage();
            System.out.print("card1");
            decreaseMana(0.3);
            card1.setSelected(false);
            card1View.setVisible(false);
            new AudioController("menuClick");
        }
        if(card2.isSelected() == true && manaBarProgress >= 0.3){
//            Image newCard = loadIcon("testImg1.png");
//            tile.setImage();
            System.out.print("card2");
            decreaseMana(0.3);
            card2.setSelected(false);
            card2View.setVisible(false);
            new AudioController("menuClick");
        }
        if(card3.isSelected() == true && manaBarProgress >= 0.3){
//            Image newCard = loadIcon("testImg1.png");
//            tile.setImage();
            System.out.print("card3");
            decreaseMana(0.3);
            card3.setSelected(false);
            card3View.setVisible(false);
            new AudioController("menuClick");
        }
        if(card4.isSelected() == true && manaBarProgress >= 0.3){
//            Image newCard = loadIcon("testImg1.png");
//            tile.setImage();
            System.out.print("card4");
            decreaseMana(0.3);
            card4.setSelected(false);
            card4View.setVisible(false);
            new AudioController("menuClick");
        }
        if(card5.isSelected() == true && manaBarProgress >= 0.3){
//            Image newCard = loadIcon("testImg1.png");
//            tile.setImage();
            System.out.print("card5");
            decreaseMana(0.3);
            card5.setSelected(false);
            card5View.setVisible(false);
            new AudioController("menuClick");
        }
    }
}
