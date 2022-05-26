package com.prog2.uwupatch1.Model.Database;

import com.prog2.uwupatch1.Model.PlayerAttachment.Weapon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * @author Niclas Rieckers
 * Klasse für den Zwischenspeicher der Objekte vom Typ Weapon
 * vor der Serialisierung.
 * TODO: Check Grammatical
 */
@SuppressWarnings("ALL")
public class Weapons {
    private static ObservableList<Weapon> weapons = FXCollections.observableArrayList();

    public static ObservableList<Weapon> weapons() {
        return weapons;
    }

    public static Weapon get(int i){
        return Weapons.weapons().get(i);
    }

    public static void setWeapons(ObservableList<Weapon> weapons) {
        Weapons.weapons = weapons;
    }

    /**
     * add() Methode speichert die Waffen, die in Attribute deklariert und initialisiert wurden.
     */
    public static void add(Weapon e){
        Weapons.weapons.add(e);
    }
}
