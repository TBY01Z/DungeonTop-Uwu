package de.prog2.uwupatch1.Model.Items.Cards;

import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Usable;

/**
 * @author Niclas Rieckers
 *  Diese Klasse ist die Basis von allen Karten, jede Karte erbt von dieser Klasse.
 *  Damit spaeter von dem Deck gecastet werden zu koennen, um so die Karten auch in der Gui gecastet werden zu koennen.
 */
public class Card extends Usable {
    /**
     * Hier wird der Mana Aufbrauch pro Beschwoerung referenziert.
     */
    private int summonCost;
    /**
     * Hier wird das Level der Karte referenziert.
     *
     */
    private int level;

    public Card(int ID, String objName, String iconPath, int summonCost, int level) {
        super(ID, objName, iconPath);
        this.summonCost = summonCost;
        this.level = level;
    }

    /**
     * Getter für die Manakosten der Beschwoerung der jeweiligen Karte
     * @return Beschwoerungskosten int
     */
    public int summonCost() {
        return summonCost;
    }

    /**
     * Setter für die Manakosten der Beschwoerung der jeweiligen Karte
     * @param summonCost
     * Es wird ein fuer die Beschwoerung benoetigte Preis gesetzt.
     * @return neue Instanz von Card
     */
    public Card setSummonCost(int summonCost) {
        this.summonCost = summonCost;
        return this;
    }
    /**
     * Getter für das Level der Karte
     * @return int Level
     */
    public int level() {
        return level;
    }
    /**
     * Setter für das Level der Karte auf dem Spielfeld
     * @param level Das zu setzende Level als int.
     * @return neue Instanz von Card
     */
    public Card setLevel(int level) {
        this.level = level;
        return this;
    }

    @Override
    public String toString() {
        return "Card{" + super.toString() +
                "summonCost=" + summonCost +
                ", level=" + level +
                '}';
    }
}
