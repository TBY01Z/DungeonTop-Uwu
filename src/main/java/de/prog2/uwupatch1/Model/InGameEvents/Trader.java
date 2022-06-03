package de.prog2.uwupatch1.Model.InGameEvents;

import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Armor;
import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Artifact;
import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Deck;
import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Weapon;
import de.prog2.uwupatch1.Model.Collectables.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Niclas Rieckers
 * Klasse für den im Spiel zufällig erscheinenden Händler mit zufälligen Items, die gekauft werden können.
 * TODO: Check Grammatical Modulariesieren
 */
public class Trader {
    private final int ID_PARAMETER = 100;

    private final int[] IDs; //int array mit IDs
    private final Deck cardsForSale = new Deck(); //neues Deck wird erzeugt für den Verkauf von Karten

    //Instanzen von ObservableList werden erstellt um somit Artefakte, Waffen und Ruestungen zu verkaufen.
    private final ObservableList<Artifact> artifactsForSale = FXCollections.observableArrayList();
    private final ObservableList<Weapon> weaponsForSale = FXCollections.observableArrayList();
    private final ObservableList<Armor> armorForSale = FXCollections.observableArrayList();


    /**
     * Konstruktor für Trader
     * @param IDs die Item IDs die dem Trader zum verkauf zu Verfuegung stehen.
     */
    public Trader(int[] IDs) {
        this.IDs = IDs;
        fillTrader();
    }

    /**
     * Methode für das befüllen des Shops des Händlers mit den ID's die vorher uebergeben wurden.
     */
    private void fillTrader() {
        for (int i:
             this.IDs) {
            switch (i/ID_PARAMETER){
                case 0: cardsForSale.add(WarriorCards.get(i% ID_PARAMETER));
                case 1: cardsForSale.add(EffectCards.get(i% ID_PARAMETER));
                case 3: armorForSale.add(Armors.get(i% ID_PARAMETER));
                case 4: weaponsForSale.add(Weapons.get(i% ID_PARAMETER));
                case 5: artifactsForSale.add(Artifacts.get(i% ID_PARAMETER));
                case 6: cardsForSale.add(WeaponCards.get(i% ID_PARAMETER));
            }
        }
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
