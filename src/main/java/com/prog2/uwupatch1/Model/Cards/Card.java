package com.prog2.uwupatch1.Model.Cards;

import com.prog2.uwupatch1.Model.PlayerAttachment.Usable;

public class Card extends Usable {
    /**
     * Hier wird der Mana Aufbrauch pro Beschwoerung referenziert.TODO: Check Grammatical
     */
    private int summonCost;
    private int level;

    public Card(int ID, String objName, String iconPath, int summonCost, int level) {
        super(ID, objName, iconPath);
        this.summonCost = summonCost;
        this.level = level;
    }

    /**
     * Getter für die Manakosten für die Benutzung der Karte auf dem Spielfeld
     * @return int
     * Es wird der Preis der fuer eine Beschwoerung benoetigt wird zurueck gegeben.
     */
    public int summonCost() {
        return summonCost;
    }

    /**
     * Setter für die Manakosten für die Benutzung der Karte auf dem Spielfeld
     * @param summonCost
     * Es wird der Preis der fuer eine Beschwoerung benoetigt wird gesetzt.
     * @return Card
     * Es wird eine neue Instanz von Karte zuruek gegeben.
     */
    public Card setSummonCost(int summonCost) {
        this.summonCost = summonCost;
        return this;
    }
    /**
     * Getter für das Level der Karte
     * @return int
     * Es wird das Level der Karte zuruek gegeben.
     */
    public int level() {
        return level;
    }
    /**
     * Setter für das Level der Karte auf dem Spielfeld
     * @param level
     * Es wird das Level gesetzt.
     * @return Card
     * Es wird eine neue Instanz von Karte zuruek gegeben.
     */
    public Card setLevel(int level) {
        this.level = level;
        return this;
    }
}
