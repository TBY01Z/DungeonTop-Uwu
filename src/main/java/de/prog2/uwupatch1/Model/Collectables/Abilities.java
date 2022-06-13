package de.prog2.uwupatch1.Model.Collectables;

import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Ability;
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
    /**
     * Methode fuer das Hinzufuegen eines Effektes zu der ObservableList.
     */
    public static void addEffect(Ability ability){
        effectList.add(ability);
    }

    /**
     * Methode gibt einen spezifischen Effekt aus der ObservableList zurueck.
     * @param i Indexposition in der ObservableList der Effekte.
     * @return Effekt aus der Liste an spezifischer Indexposition.
     */
    public static Ability get(int i){
        return Abilities.effectList().get(i);
    }


    /**
     * Methode gibt ObservableList mit allen Effekten einer Ability zureuck.
     * @return alle Effekte der Ability
     */
    public static ObservableList<Ability> effectList() {
        return effectList;
    }

    /**
     * Setter Methode fuer die ObservableList der Effekte.
     * @param effectList eine Liste mit Effekten einer Ability
     */
    public static void setEffectList(ObservableList<Ability> effectList) {
        Abilities.effectList = effectList;
    }
}
