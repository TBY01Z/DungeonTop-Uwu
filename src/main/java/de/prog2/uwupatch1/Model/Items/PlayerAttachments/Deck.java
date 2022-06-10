package de.prog2.uwupatch1.Model.Items.PlayerAttachments;


import de.prog2.uwupatch1.Model.Items.Cards.Card;
import de.prog2.uwupatch1.Model.Items.Cards.EffectCard;
import de.prog2.uwupatch1.Model.Items.Cards.SummonedWarriorCard;
import de.prog2.uwupatch1.Model.Items.Cards.WeaponCard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import static de.prog2.uwupatch1.util.MyIO.random;

/**
 * @author Niclas Rieckers
 * Klasse Deck, mit der ein Kartendeck erzeugt werden kann.
 * TODO: Check Grammatical
 */
public class Deck {


    private static final ObservableList<Card> cardDeck = FXCollections.observableArrayList();

    public void add(EffectCard addedCard){cardDeck.add(addedCard);}

    public void add(SummonedWarriorCard addedCard){cardDeck.add(addedCard);}

    public void add(WeaponCard addedCard){cardDeck.add(addedCard);}
    public Card get(int i){
        return cardDeck.get(i);
    }
    public Card getByID(int ID){
        for (Card e:
             cardDeck) {
            if (e.ID() == ID){
                return e;
            }
        }

        return null;
    }

    public static Card draw(){return cardDeck.get((random()%cardDeck.size()));}
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
