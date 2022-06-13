package de.prog2.uwupatch1.Model.Collectables;

import de.prog2.uwupatch1.Model.PlayerSelf.PersonalityTypeCast;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * @author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ PersonalityTypeCast
 * vor der Serialisierung.
 */
@SuppressWarnings("ALL")
public class PersonalityTypeCasts {

    private static ObservableList<PersonalityTypeCast> personalityTypeCasts = FXCollections.observableArrayList();

    /**
     * Methode gibt ein spezifisches Objekt PersonalityTypeCast aus der ObservableList zurueck.
     * @param i Indexposition in der ObservableList der PersonalityTypeCast Objekte.
     * @return PersonalityTypeCast Objekt aus der Liste an spezifischer Indexposition.
     */
    public static PersonalityTypeCast get(int i){
        return personalityTypeCasts.get(i);
    }

    /**
     * Methode fuer das Hinzufuegen eines PersonalityTypeCast Objektes zu der ObservableList.
     * @param artifact Das PersonalityTypeCast-Objekt, welches der Liste hinzugefuegt werden soll.
     */
    public static void add(PersonalityTypeCast personalityTypeCast){
        personalityTypeCasts.add(personalityTypeCast);
    }

    /**
     * Getter Methode fuer eine ObservableList mit Objekten vom Typ PersonalityTypeCast
     * @return eine ObservableList mit den PersonalityTypeCasts
     */
    public static ObservableList<PersonalityTypeCast> personalityTypeCasts() {
        return personalityTypeCasts;
    }

    /**
     * Setter Methode fuer die ObservableList der PersonalityTypeCast Objekte.
     * @param armors eine Liste mit PersonalityTypeCast Objekten
     */
    public static void setPersonalityTypeCasts(ObservableList<PersonalityTypeCast> personalityTypeCasts) {
        PersonalityTypeCasts.personalityTypeCasts = personalityTypeCasts;
    }
}
