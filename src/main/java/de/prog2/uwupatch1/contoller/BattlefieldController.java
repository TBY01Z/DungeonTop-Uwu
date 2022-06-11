package de.prog2.uwupatch1.contoller;

import de.prog2.uwupatch1.Model.Items.Cards.Card;
import de.prog2.uwupatch1.Model.Items.Cards.EffectCard;
import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Deck;
import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Usable;
import de.prog2.uwupatch1.Model.PlayerSelf.Player;
import de.prog2.uwupatch1.util.MyIO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.MediaView;

import java.net.URISyntaxException;
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
    @FXML
    private ImageView deckSlot1 = new ImageView();

    ObservableList<Card> tmpDeckList = FXCollections.observableArrayList();

    @FXML
    private MediaView mediaView;
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
    private ToggleGroup deckSelector;



    private Image newCard = loadIcon("testImg1.png");
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
        tile1.setImage(loadIcon("testImg2.jpg"));
        tile2.setImage(loadIcon("testImg2.jpg"));
        tile3.setImage(loadIcon("testImg2.jpg"));
        tile4.setImage(loadIcon("testImg2.jpg"));
        tile5.setImage(loadIcon("testImg2.jpg"));
        tile6.setImage(loadIcon("testImg2.jpg"));
        tile7.setImage(loadIcon("testImg2.jpg"));
        tile8.setImage(loadIcon("testImg2.jpg"));
        tile9.setImage(loadIcon("testImg2.jpg"));
        tile10.setImage(loadIcon("testImg2.jpg"));
        tile11.setImage(loadIcon("testImg2.jpg"));
        tile12.setImage(loadIcon("testImg2.jpg"));
        tile13.setImage(loadIcon("testImg2.jpg"));
        tile14.setImage(loadIcon("testImg2.jpg"));
        tile15.setImage(loadIcon("testImg2.jpg"));
        tile16.setImage(loadIcon("testImg2.jpg"));
//        effectView.setImage(loadIcon(EffectCard.icon().toString()));
        deckSlot1.setImage(loadIcon("testImg2.jpg"));
        manaBar.setStyle("-fx-accent: blue;");
//        card1.setStyle("-fx-graphic: testImg1;");     //TODO: alle toggle buttons mit den karten versehen usw usw
    }

    public void getLabelFeedback(ActionEvent event){
        gegnerLabel.setText("reagiert button? updated mana? spielt sound?");
        increaseMana(0.2);
        new AudioController("menuClick");
    }

    @FXML
    protected void onMainMenuChange(ActionEvent event) {
        MyIO.loadXML(event, "StartStage.fxml");
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
        gegnerLabel.setText("Zug wurde beendet!");
        increaseMana(0.2);
    }

    public void deckList(){
        while(tmpDeckList.size() != 6) {
            tmpDeckList.add(Deck.draw());
            System.out.println(tmpDeckList);
        }

    }

    public void cardSelector(ImageView tile){

        deckList();     //something something make it work aaaaa

        card1.setToggleGroup(deckSelector);
        card2.setToggleGroup(deckSelector);
        card3.setToggleGroup(deckSelector);
        card4.setToggleGroup(deckSelector);
        card5.setToggleGroup(deckSelector);

        if(card1.isSelected() == true){
//            Image newCard = loadIcon("testImg1.png");
//            tile.setImage();
            System.out.print("card1");
            decreaseMana(0.3);
            card1.setSelected(false);
            card1.setVisible(false);
        }
        if(card2.isSelected() == true){
//            Image newCard = loadIcon("testImg1.png");
//            tile.setImage();
            System.out.print("card2");
            decreaseMana(0.3);
            card2.setSelected(false);
            card2.setVisible(false);
        }
        if(card3.isSelected() == true){
//            Image newCard = loadIcon("testImg1.png");
//            tile.setImage();
            System.out.print("card3");
            decreaseMana(0.3);
            card3.setSelected(false);
            card3.setVisible(false);
        }
        if(card4.isSelected() == true){
//            Image newCard = loadIcon("testImg1.png");
//            tile.setImage();
            System.out.print("card4");
            decreaseMana(0.3);
            card4.setSelected(false);
            card4.setVisible(false);
        }
        if(card5.isSelected() == true){
//            Image newCard = loadIcon("testImg1.png");
//            tile.setImage();
            System.out.print("card5");
            decreaseMana(0.3);
            card5.setSelected(false);
            card5.setVisible(false);
        }
    }
}
