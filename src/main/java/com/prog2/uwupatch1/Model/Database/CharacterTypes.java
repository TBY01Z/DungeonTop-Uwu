package com.prog2.uwupatch1.Model.Database;

import com.prog2.uwupatch1.Model.PlayerAttachment.CharacterType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * @author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ CharacterType
 * vor der Serialisierung.
 */
public class CharacterTypes {

    private static ObservableList<CharacterType> characterTypes = FXCollections.observableArrayList();
    public CharacterTypes(){

    }
    public static ObservableList<CharacterType> getClassTypes() {
        return characterTypes;
    }

    public static void get(int i){
        characterTypes.get(i);
    }

    public static void add(CharacterType characterType){
        characterTypes.add(characterType);

    }
}
