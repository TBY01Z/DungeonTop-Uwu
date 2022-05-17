package com.prog2.uwupatch1.Model.Cards;

import com.prog2.uwupatch1.Model.PlayerAttachment.Usable;
import com.prog2.uwupatch1.Model.PlayerAttachment.Ability;

/**
 * @author Niclas Rieckers
 * Klasse für die erzeugung eines "EffectCard" Objektes. Erbt von Klasse Usable, da EffectCard zu den vom
 * Spieler nutzbaren Items gehört.
 */
public class EffectCard extends Usable {
    //Hier wird die cardAbility referenciert.
    private Ability cardAbility;
    //Hier wird der Kaufwert referenciert.
    private int buyCost;
    //Hier wird der Mana Aufbrauch pro Beschwoerung referenciert.
    private int summonCost;


    /**
     * Konstruktor für EffectCard
     * @param ID
     * Initialiesierung von ID zur abrufung der Effekt Karte
     * @param objName
     * Initialiesierung vom Objekt Namen.
     * @param iconPath
     * Initialiesierung vom Pfad zum Icon.
     * @param cardAbility
     * Initialiesierung von CardAbility um einen Effekt zu erzielen.
     * @param buyCost
     * Initialiesierung vom Kaufwert um Kauf&Verkauf zu regeln.
     * @param summonCost
     * Initialiesierung vom Mana Aufbrauch der bei Beschwoerung benoetigt wird.
     */
    public EffectCard(int ID, String objName, String iconPath, Ability cardAbility, int buyCost, int summonCost) {
        super(ID, objName, iconPath);
        this.cardAbility = cardAbility;
        this.buyCost = buyCost;
        this.summonCost = summonCost;
    }

    /**
     * Getter für cardAbility
     * @return cardAbility
     * Es wird der Effekt von der Karte zurueck gegeben.
     */
    public Ability cardAbility() {
        return cardAbility;
    }

    /**
     * Setter für cardAbility
     * @param cardAbility
     * Es wird der Effekt von Karte gesetzt.
     * @return EffectCard
     * Es wird eine neue Instanz von Effekt Karte zuruek gegeben
     */
    public EffectCard setCardAbility(Ability cardAbility) {
        this.cardAbility = cardAbility;
        return this;
    }

    /**
     * Getter für den Preis der Effekt Karten
     * @return int
     * Es wird der Preis fuer die Effekt Karte zurueck gegeben.
     */
    public int buyCost() {
        return buyCost;
    }

    /**
     * Setter für den Preis der Effekt Karten
     * @param buyCost
     * Es wird der Preis fuer die Effekt Karte gesetzt.
     * @return buyCost
     * Es wird eine neue Instanz von Effekt Karte zuruek gegeben.
     */
    public EffectCard setBuyCost(int buyCost) {
        this.buyCost = buyCost;
        return this;
    }

    /**
     * Getter für die Manakosten für die Benutzung der Effekt Karten auf dem Spielfeld
     * @return int
     * Es wird der Preis der fuer eine Beschwoerung benoetigt wird zurueck gegeben.
     */
    public int summonCost() {
        return summonCost;
    }

    /**
     * Setter für die Manakosten für die Benutzung der Effekt Karten auf dem Spielfeld
     * @param summonCost
     * Es wird der Preis der fuer eine Beschwoerung benoetigt wird gesetzt.
     * @return EffectCard
     * Es wird eine neue Instanz von Effekt Karte zuruek gegeben.
     */
    public EffectCard setSummonCost(int summonCost) {
        this.summonCost = summonCost;
        return this;
    }

    /**
     * toString() Rueckgabe von den Attributen
     * @return String
     * Hier werden die Attribute von der Effekt Karte zuruek gegeben.
     */
    @Override
    public String toString() {
        return "EffectCard{" +super.toString()+
                "cardAbility=" + cardAbility.toString() +
                ", buyCost=" + buyCost +
                ", summonCost=" + summonCost +
                '}';
    }
}
