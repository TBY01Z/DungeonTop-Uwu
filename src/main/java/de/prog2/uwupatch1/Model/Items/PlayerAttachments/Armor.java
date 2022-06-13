package de.prog2.uwupatch1.Model.Items.PlayerAttachments;

/**
 * @author Niclas Rieckers
 * Klasse Armor, erbt von Superklasse Usable. Wird gebraucht, um Spiel-Objekte "Armor"
 * erzeugen zu können.
 */
public class Armor extends Usable {
    private double health;
    private double addHealth = 0;

    public Armor(int ID, String objName, String iconPath, double health) {
        super(ID, objName, iconPath);
        this.health = health;
    }

    public double health() {
        return health+this.addHealth();
    }

    public Armor setHealth(double health) {
        this.health = health;
        return this;
    }

    public double addHealth() {
        return addHealth;
    }

    public void setAddHealth(double addHealth) {
        this.addHealth = addHealth;
    }
    /**
     * toString() Rueckgabe von den Attributen
     * @return String
     * Hier werden die Attribute von der Warrior Karte zuruek gegeben.
     */
    @Override
    public String toString() {
        return "Armor{" +super.toString()+
                "health=" + health +
                ", addHealth=" + addHealth +
                '}';
    }
}
