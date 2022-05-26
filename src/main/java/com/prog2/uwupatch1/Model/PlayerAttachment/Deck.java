package com.prog2.uwupatch1.Model.PlayerAttachment;


import com.prog2.uwupatch1.Model.Cards.EffectCard;
import com.prog2.uwupatch1.Model.Cards.SummonedWarriorCard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import static com.prog2.uwupatch1.util.MyIO.random;

/**
 * @author Niclas Rieckers
 * Klasse Deck, mit der ein Kartendeck erzeugt werden kann.
 * TODO: Check Grammatical
 */
public class Deck {
    private final ObservableList<EffectCard> effectCards = FXCollections.observableArrayList();
    private final ObservableList<SummonedWarriorCard> summonedWarriorCards = FXCollections.observableArrayList();


    public EffectCard draweffect(){
        return effectCards.get((random(0,99999999)%(effectCards.size()-1)));
    }
    public SummonedWarriorCard drawSummon(){
        return summonedWarriorCards.get((random(0,99999999)%(summonedWarriorCards.size()-1)));
    }

    public void add(EffectCard addedCard){
        effectCards.add(addedCard);
    }
    public void add(SummonedWarriorCard addedCard){
        summonedWarriorCards.add(addedCard);
    }

    public ObservableList<EffectCard> getEffectCards() {
        return effectCards;
    }

    public ObservableList<SummonedWarriorCard> getSummonedWarriorCards() {
        return summonedWarriorCards;
    }

    public void removeEffect(EffectCard e){
        effectCards.remove(e);
    }
    /**
     * toString() Rueckgabe von den Attributen
     * @return String
     * Hier werden die Attribute von der Warrior Karte zuruek gegeben.
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (EffectCard e:
             effectCards) {
            stringBuilder.append(e.toString());
        }
        for (SummonedWarriorCard e:
             summonedWarriorCards) {
            stringBuilder.append(e.toString());
        }

        return "Deck{"+ stringBuilder +"};";
    }
}
