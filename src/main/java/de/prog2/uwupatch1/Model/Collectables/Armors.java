package de.prog2.uwupatch1.Model.Collectables;

import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Armor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * @author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ Armor
 * vor der Serialisierung.
 */
public class Armors {
    private static ObservableList<Armor> armors = FXCollections.observableArrayList();

    /**
     * Methode gibt ObservableList mit Armor-Objekten zureuck.
     * @return alle Armor Objekte
     */
    public static ObservableList<Armor> armors() {
        return armors;
    }

    /**
     * Methode gibt ein spezifisches Objekt Armor aus der ObservableList zurueck.
     * @param i Indexposition in der ObservableList der Armor Objekte.
     * @return Armor aus der Liste an spezifischer Indexposition.
     */
    public static Armor get(int i) {
        return Armors.armors().get(i);
    }

    /**
     * Setter Methode fuer die ObservableList der Armor Objekte.
     * @param armors eine Liste mit Armor Objekten
     */
    public static void setArmors(ObservableList<Armor> armors) {
        Armors.armors = armors;
    }

    /**
     * Methode fuer das Hinzufuegen eines Armor Objektes zu der ObservableList.
     */
    public static void add(Armor armor) {
        armors().add(armor);
    }
}