package de.prog2.uwupatch1.Model.Collectables;

import de.prog2.uwupatch1.Model.Items.Cards.SummonedWarriorCard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * @author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ WarriorCard
 * vor der Serialisierung.
 */
@SuppressWarnings("ALL")
public class WarriorCards {
    private static ObservableList<SummonedWarriorCard> warriorCards = FXCollections.observableArrayList();

    public WarriorCards() {
    }

    /**
     * Getter Methode fuer eine ObservableList mit Objekten vom Typ SummonedWarriorCard
     * @return eine ObservableList mit den SummonedWarriorCards
     */
    public static ObservableList<SummonedWarriorCard> warriorCards() {
        return warriorCards;
    }

    /**
     * Methode gibt ein spezifisches Objekt vom Typ SummonedWarriorCard aus der ObservableList zurueck.
     * @param i Indexposition in der ObservableList der SummonedWarriorCard Objekte.
     * @return PersonalityTypeCast Objekt aus der Liste an spezifischer Indexposition.
     */
    public static SummonedWarriorCard get(int i){
        return WarriorCards.warriorCards().get(i);
    }

    /**
     * Setter Methode fuer die ObservableList der SummonedWarriorCard Objekte.
     * @param armors eine Liste mit SummonedWarriorCard Objekten
     */
    public static void setWarriorCards(ObservableList<SummonedWarriorCard> warriorCards) {
        WarriorCards.warriorCards = warriorCards;
    }
    /**
     * Methode fuer das Hinzufuegen eines SummonedWarriorCard Objektes zu der ObservableList.
     * @param artifact Das SummonedWarriorCard-Objekt, welches der Liste hinzugefuegt werden soll.
     */
    public static void add(SummonedWarriorCard summonedWarriorCard){
        warriorCards.add(summonedWarriorCard);
    }
}
