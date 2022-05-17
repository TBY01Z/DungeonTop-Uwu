package com.PROG2.Model.Events;

import com.PROG2.util.MyIO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;

/**
 * @author Mark Fisher
 * Klasse GameEvent für das generieren eines zufällig auftretenden Events im Spiel.
 */
public class GameEvent {

    private Trader trader;
    private ObservableList<Trader> traderlist = FXCollections.observableArrayList(); //ObservableList Instanz wird erzeugt
    private final int maxEventAmount = 3; //maximale Anzahl von möglichen Events

    /**
     * GameEvent konstruktor
     * @param trader ObservableList
     */
    public GameEvent(Trader trader) {
        this.trader = trader;
    }

    /**
     * Methode für das erzeugen eines von drei zufälligen GameEvents.
     */
    public void randomEvent(){
        int randy = (MyIO.random(0, 999999999)% maxEventAmount) + 1 ;   //feld "randy" bekommt zufälligen int
        //switch bekommt feld "randy" übergeben, um je nach case ein anderes GameEvent zu erzeugen
        switch(randy){
            case 1: System.out.println("event 1");
            case 2: System.out.println("event 2");
            case 3: System.out.println("Trader Event");
            default: ;
        }
    }
}
