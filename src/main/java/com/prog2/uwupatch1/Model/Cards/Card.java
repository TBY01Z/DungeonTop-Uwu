package com.prog2.uwupatch1.Model.Cards;

import com.prog2.uwupatch1.Model.PlayerAttachment.Usable;

public class Card extends Usable {
    /**
     * Hier wird der Mana Aufbrauch pro Beschwoerung referenziert.
     */
    private int summonCost;

    public Card(int ID, String objName, String iconPath, int summonCost) {
        super(ID, objName, iconPath);
        this.summonCost = summonCost;
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
    public Card setSummonCost(int summonCost) {
        this.summonCost = summonCost;
        return this;
    }
}
