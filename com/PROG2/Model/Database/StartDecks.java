package com.PROG2.Model.Database;

import com.PROG2.Model.PlayerAttachment.Deck;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * @author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ StartDeck.txt
 * vor der Serialisierung.
 */
public class StartDecks {
    private static ObservableList<Deck> decks = FXCollections.observableArrayList();

    public StartDecks() {

    }

    public static ObservableList<Deck> decks() {
        return decks;
    }

    public static Deck get(int i){
        return StartDecks.decks().get(i);
    }
    public static StartDecks setDecks(ObservableList<Deck> decks) {
        StartDecks.decks = decks;
        return null;
    }

    public static StartDecks add(Deck deck){
        decks.add(deck);
        return null;
    }
}
