package com.prog2.uwupatch1.Model.Database;

import com.prog2.uwupatch1.Model.PlayerAttachment.Ability;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *@author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ Ability
 * vor der Serialisierung.
 */
@SuppressWarnings("ALL")
public class Abilities {
    private static ObservableList<Ability> effectList = FXCollections.observableArrayList();

    public Abilities() {
    }

    @SuppressWarnings("SameReturnValue")
    public static void addEffect(Ability ability){
        effectList.add(ability);
    }
    public static Ability get(int i){
        return Abilities.effectList().get(i);
    }


    public static ObservableList<Ability> effectList() {
        return effectList;
    }

    public static Abilities setEffectList(ObservableList<Ability> effectList) {
        Abilities.effectList = effectList;
        return null;
    }
}
