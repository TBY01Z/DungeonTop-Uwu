package com.prog2.uwupatch1.Model.Database;

import com.prog2.uwupatch1.Model.Cards.WeaponCard;
import com.prog2.uwupatch1.Model.PlayerAttachment.Weapon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class WeaponCards {
    private static ObservableList<WeaponCard> weaponCards = FXCollections.observableArrayList();

    public static ObservableList<WeaponCard> weaponCards() {
        return weaponCards;
    }

    public static WeaponCard get(int i){
        return weaponCards().get(i);
    }

    public static void setWeaponCards(ObservableList<WeaponCard> weapons) {
        weaponCards = weapons;
    }

    /**
     * add() Methode speichert die Waffen, die in Attribute deklariert und initialisiert wurden.
     */
    public static void add(WeaponCard e){
        weaponCards().add(e);
    }
}
