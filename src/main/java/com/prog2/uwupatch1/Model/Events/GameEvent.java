package com.prog2.uwupatch1.Model.Events;

import com.prog2.uwupatch1.util.MyIO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Mark Fisher
 * Klasse GameEvent für das generieren eines zufällig auftretenden Events im Spiel.
 */
public class GameEvent {

    private final ObservableList<Trader> traderlist = FXCollections.observableArrayList(); //ObservableList Instanz wird erzeugt

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
        int maxEventAmount = 3;
        int randy = (MyIO.random(0, 999999999)% maxEventAmount) + 1 ;   //feld "randy" bekommt zufälligen int
        //switch bekommt feld "randy" übergeben, um je nach case ein anderes GameEvent zu erzeugen
        switch(randy){
            case 1: System.out.println("event 1");
            case 2: System.out.println("event 2");
            case 3: System.out.println("Trader Event");
            default:
        }
    }
}
