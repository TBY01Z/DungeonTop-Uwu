package de.prog2.uwupatch1.Model.InGameEvents;

import de.prog2.uwupatch1.util.MyIO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Mark Fisher
 * Klasse GameEvent für das generieren eines zufällig auftretenden Events im Spiel.
 */
public class GameEvent {
    private final ObservableList<Trader> traderlist = FXCollections.observableArrayList(); //ObservableList Instanz wird erzeugt

    private static String currentEvent;
    /**
     * GameEvent konstruktor
     * @param trader ObservableList
     */
    public GameEvent(Trader trader) {
    }

    /**
     * Methode für das erzeugen eines von drei zufälligen GameEvents.
     */
    public void randomEvent(){
        //maximale Anzahl von möglichen Events


        int MAX_EVENT_VALUE = 3;
        int randy = (MyIO.random()% MAX_EVENT_VALUE) + 1 ;   //feld "randy" bekommt zufälligen int
        //switch bekommt feld "randy" übergeben, um je nach case ein anderes GameEvent zu erzeugen
        switch (randy) {
            case 1 -> currentEvent = "event 1";
            case 2 -> currentEvent = "Treasures";
            case 3 -> currentEvent = "Trader Event";
            default -> currentEvent = "kein Event :((";
        }
    }

    /**
     * Getter Methode fuer ein aktuell Laufendes GameEvent
     * @return aktuelles GameEvent
     */
    public static String getCurrentEvent() {
        return currentEvent;
    }

}
