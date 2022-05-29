package com.prog2.uwupatch1.View;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author Mark Fischer
 * @Info Vielleicht der neue ViewManager? Diese Klasse soll alle Views managen (wie der Name es schon verrät).
 * Wird Grafikeinstellungen möglich machen.
 */
public class ViewManager {
    private static int WIDTH;
    private static int HEIGHT;
    private static boolean fullscreen;
    private AnchorPane mainPane;
    private Scene mainScene;
    private Stage mainStage;

    /**
     * Konstruktor für ViewManager. Hier werden Objekte wie AnchorPane, Scene und Stage initialisiert.
     * Außerdem wird standardmäßig die Szene auf der mainStage auf mainScene gesetzt.
     */
    public ViewManager(){
        mainPane = new AnchorPane();    //initialisierung von dem ganzen shit hier
        mainScene = new Scene(mainPane, WIDTH, HEIGHT); //An Konstruktor wird Hintergrund AnchorPane mit der Größe als
        mainStage = new Stage();                        //int übergeben (mit Größe ist die Bildschirmauflösung gemeint).
        mainStage.setFullScreen(fullscreen);    //fullscreen? yes? no? how much is the fish?
        mainStage.setScene(mainScene);  //Standardwert
    }

    /**
     * Getter für mainStage.
     * @return die Stage mainStage, auf der die Szene (standardmäßig mainScene) liegt.
     */
    public Stage getMainStage(){
        return mainStage;
    }

    //generierte Getter und Setter Methoden für die Variablen
    public static int getWIDTH() {
        return WIDTH;
    }

    public static void setWIDTH(int WIDTH) {
        ViewManager.WIDTH = WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static void setHEIGHT(int HEIGHT) {
        ViewManager.HEIGHT = HEIGHT;
    }

    public static boolean isFullscreen() {
        return fullscreen;
    }

    public static void setFullscreen(boolean fullscreen) {
        ViewManager.fullscreen = fullscreen;
    }
}
