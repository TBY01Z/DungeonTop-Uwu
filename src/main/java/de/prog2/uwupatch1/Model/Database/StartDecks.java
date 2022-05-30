package de.prog2.uwupatch1.Model.Database;

import de.prog2.uwupatch1.Model.PlayerAttachment.Deck;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * @author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ StartDeck.txt
 * vor der Serialisierung.
 * TODO: Check Grammatical
 */
@SuppressWarnings("ALL")
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
    public static void setDecks(ObservableList<Deck> decks) {
        StartDecks.decks = decks;
    }

    public static void add(Deck deck){
        decks.add(deck);
    }
}
