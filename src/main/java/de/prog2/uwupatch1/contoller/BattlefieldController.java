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
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
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


    private final Image newCard = loadIcon("testImg1.png");
//    private final Image showEffect = loadIcon(EffectCard.icon().toString());

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
    }

    public void getLabelFeedback(ActionEvent event){
        gegnerLabel.setText("UI test: sound played? mana increased? button responsive?");
        increaseMana(0.2);
        AudioController audio = new AudioController("menuClick");
//        if(mediaView.getMediaPlayer() == null){     //FIXME: sound wird nicht abgespielt...
//            try {                                   //TODO: Ali's klasse ausprobieren!
//                String fileName = getClass().getResource("/menuClick.wav").toURI().toString();
//            } catch (URISyntaxException e) {
//                e.printStackTrace();
//            }
//        }
//        mediaView.getMediaPlayer().seek(mediaView.getMediaPlayer().getStartTime());
//        mediaView.getMediaPlayer().play();
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
        decreaseMana(0.1);
    }

    public void updateEffectIcon(){
        //effectView.setImage(EffectCard.icon()); //currently not in use.
    }

    public void onShowOptions(ActionEvent event){
        System.out.print("settings lol ");
    }

    public void deckList(ActionEvent event){
        while(tmpDeckList.size() != 6) {
            tmpDeckList.add(Deck.draw());
            System.out.println(tmpDeckList);
        }

    }
}
