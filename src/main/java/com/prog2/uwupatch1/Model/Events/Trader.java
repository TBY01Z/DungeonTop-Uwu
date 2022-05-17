package com.prog2.uwupatch1.Model.Events;

import com.prog2.uwupatch1.Model.Database.*;
import com.prog2.uwupatch1.Model.PlayerAttachment.Armor;
import com.prog2.uwupatch1.Model.PlayerAttachment.Artifact;
import com.prog2.uwupatch1.Model.PlayerAttachment.Deck;
import com.prog2.uwupatch1.Model.PlayerAttachment.Weapon;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Niclas Rieckers
 * Klasse für den im Spiel zufällig erscheinenden Händler mit zufälligen Items, die gekauft werden können.
 */
public class Trader {
    private int[] IDs; //int array mit IDs
    private Deck cardsForSale = new Deck(); //neues Deck wird erzeugt für den Verkauf von Karten
    //Instanzen von ObservableList werden erstellt
    private ObservableList<Artifact> artifactsForSale = FXCollections.observableArrayList();
    private ObservableList<Weapon> weaponsForSale = FXCollections.observableArrayList();
    private ObservableList<Armor> armorForSale = FXCollections.observableArrayList();


    /**
     * Konstruktor für Trader
     * @param IDs die Item IDs
     */
    public Trader(int[] IDs) {
        this.IDs = IDs;
        fillTrader();
    }

    /**
     * Methode für das befüllen des Shops des Händlers mit den ID's die vorher uebergeben wurden.
     * @return
     */
    private Trader fillTrader() {
        for (int i:
             this.IDs) {
            switch (i/100){
                case 0: cardsForSale.add(WarriorCards.get(i%100));
                case 1: cardsForSale.add(EffectCards.get(i%100));
                case 3: armorForSale.add(Armors.get(i%100));
                case 4: weaponsForSale.add(Weapons.get(i%100));
                case 5: artifactsForSale.add(Artifacts.get(i%100));
            }
        }
        return this;
    }

    /**
     * Getter Observable List Weapon
     * @return Liste mit weaponsForSale
     */
    public ObservableList<Weapon> getWeaponsForSale(){
        return weaponsForSale;
    }

    /**
     * Getter Observable List Artifacts
     * @return Liste mit artifactsForSale
     */
    public ObservableList<Artifact> getArtifactsForSale(){
        return artifactsForSale;
    }

    /**
     * Getter Observable List Armor
     * @return Liste mit armorForSale
     */
    public ObservableList<Armor> armorForSale() {
        return armorForSale;
    }

    /**
     * Getter Observable List Deck
     * @return Liste mit cardsForSale
     */
    public Deck getCardsForSale(){
        return cardsForSale;
    }
}
