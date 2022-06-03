package de.prog2.uwupatch1.Model.Collectables;

import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Ability;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *@author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ Ability
 * vor der Serialisierung.
 * TODO: Check Grammatical
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

    public static void setEffectList(ObservableList<Ability> effectList) {
        Abilities.effectList = effectList;
    }
}
