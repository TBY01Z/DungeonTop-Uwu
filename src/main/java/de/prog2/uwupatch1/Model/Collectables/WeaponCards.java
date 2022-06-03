package de.prog2.uwupatch1.Model.Collectables;

import de.prog2.uwupatch1.Model.Items.Cards.WeaponCard;
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
