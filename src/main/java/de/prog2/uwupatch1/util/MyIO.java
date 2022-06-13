/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.prog2.uwupatch1.util;
import de.prog2.uwupatch1.Model.Icon.LoadIcons;
import de.prog2.uwupatch1.View.FirstStage;
import de.prog2.uwupatch1.contoller.SettingStageControl;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author rieck
 * TODO: Check Grammatical
 */
public class MyIO {
    private static boolean ONLINE_MODE;
    private static final int MIN_RANDOM_VALUE = 0;
    private static final int MAX_RANDOM_VALUE = 999999999;


    private static Character getResourceSlasch() {
        if (Objects.equals(System.getProperty("os.name"), "Windows 10")){
            return '\\';
        }else{
            return '/';
        }
    }
    /**
     *
     * @param arg ausgabe des Strings "arg" in der Console.
     */
    public static void print(String arg){
        System.out.println(arg);
       
    }

    public static boolean ONLINE_MODE() {
        return ONLINE_MODE;
    }

    public static void setOnlineMode(boolean onlineMode) {
        ONLINE_MODE = onlineMode;
    }

    public static void loadXML(ActionEvent event, String source) {
        Parent root;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(FirstStage.class.getResource(source));
            root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.getScene().setRoot(root);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static Image loadIcon(String path){
        return new Image(String.valueOf(LoadIcons.class.getResource(path)));
    }
    public static int random(){
        Random rn = new Random();
        return rn.nextInt(MAX_RANDOM_VALUE-MIN_RANDOM_VALUE+1)+MIN_RANDOM_VALUE;
    }

}