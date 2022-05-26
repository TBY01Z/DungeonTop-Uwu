package com.prog2.uwupatch1.Model.Database;

import com.prog2.uwupatch1.Model.PlayerAttachment.Armor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * @author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ Armor
 * vor der Serialisierung.
 */
@SuppressWarnings("SameReturnValue")
public class Armors {
    private static ObservableList<Armor> armors = FXCollections.observableArrayList();


    public static ObservableList<Armor> armors() {
        return armors;
    }

    public static Armor get(int i) {
        return Armors.armors().get(i);
    }

    @SuppressWarnings("SameReturnValue")
    public static Armors setArmors(ObservableList<Armor> armors) {
        Armors.armors = armors;
        return null;
    }

    public static void add(Armor armor) {
        armors().add(armor);
    }
}