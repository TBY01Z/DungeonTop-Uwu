package com.prog2.uwupatch1;

import com.prog2.uwupatch1.Model.Database.InputClass;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Objects;

public class Start extends Application {

    private final Pane pane = new Pane();
    private final Sprite playerInDungeon = new Sprite();

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Start.class.getResource("StartStage.fxml")));
        Scene scene = new Scene(root);
        pane.getChildren().add(playerInDungeon);
        stage.setResizable(false);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("");
        stage.setTitle("DungeonTop UWU");
        stage.setScene(scene);
        stage.show();

        scene.setOnKeyPressed( e -> {
            switch (e.getCode()) {
                case W -> playerInDungeon.moveUp();
                case A -> playerInDungeon.moveLeft();
                case S -> playerInDungeon.moveDown();
                case D -> playerInDungeon.moveRight();
            }
        });
    }

    public static void main(String[] args) {
        if(InputClass.inputFill()){
            launch();
        }
    }

    /**
     * Klasse Sprite erzeugt ein grafisches Viereck, beinhaltet ebenso die Methoden für die Bewegung von Objekten.
     */
    private static class Sprite extends Rectangle{
        final String type;

        Sprite(){
            super(40, 40, Color.GREEN);
            this.type = "playerInDungeon";
            setTranslateX(300);
            setTranslateY(750);
        }

        //movement
        void moveLeft(){
            setTranslateX(getTranslateX() - 5);
        }
        void moveRight(){
            setTranslateX(getTranslateX() + 5);
        }
        void moveUp(){
            setTranslateY(getTranslateY() + 5);
        }
        void moveDown(){
            setTranslateY(getTranslateY() - 5);
        }
    }



}