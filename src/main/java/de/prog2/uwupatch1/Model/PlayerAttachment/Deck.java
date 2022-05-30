package de.prog2.uwupatch1.Model.PlayerAttachment;


import de.prog2.uwupatch1.Model.Cards.Card;
import de.prog2.uwupatch1.Model.Cards.EffectCard;
import de.prog2.uwupatch1.Model.Cards.SummonedWarriorCard;
import de.prog2.uwupatch1.Model.Cards.WeaponCard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import static de.prog2.uwupatch1.util.MyIO.random;

/**
 * @author Niclas Rieckers
 * Klasse Deck, mit der ein Kartendeck erzeugt werden kann.
 * TODO: Check Grammatical
 */
public class Deck {
    private final int INDEX_CONST=-1;

    private final ObservableList<Card> cardDeck = FXCollections.observableArrayList();

    public void add(EffectCard addedCard){cardDeck.add(addedCard);}

    public void add(SummonedWarriorCard addedCard){cardDeck.add(addedCard);}

    public void add(WeaponCard addedCard){cardDeck.add(addedCard);}

    public Card draw(){return cardDeck.get((random()%cardDeck.size()+INDEX_CONST));}
    /**
     * toString() Rueckgabe von den Attributen
     * @return String
     * Hier werden die Attribute vom Deck zuruek gegeben.
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Card e : cardDeck){
            stringBuilder.append(e.toString());
        }


        return "Deck{"+ stringBuilder +"};";
    }


}
