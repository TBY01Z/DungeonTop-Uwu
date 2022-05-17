package com.prog2.uwupatch1.Model.Database;


import com.prog2.uwupatch1.Model.Cards.EffectCard;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ EffectCard
 * vor der Serialisierung.
 */
public class EffectCards {
    private static ObservableList<EffectCard> effectCards = FXCollections.observableArrayList();

    public EffectCards() {
    }

    public static ObservableList<EffectCard> getEffectCards() {
        return effectCards;
    }

    public static EffectCard get(int i){
        return EffectCards.getEffectCards().get(i);
    }

    public static EffectCards setEffectCards(ObservableList<EffectCard> effectCards) {
        EffectCards.effectCards = effectCards;
        return null;
    }

    public static EffectCards add(EffectCard effectCard){
        effectCards.add(effectCard);
        return null;
    }
}
