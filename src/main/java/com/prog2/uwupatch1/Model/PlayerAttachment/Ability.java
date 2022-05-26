package com.prog2.uwupatch1.Model.PlayerAttachment;

/**
 * @author Niclas Rieckers
 * Klasse Ability, erbt von Superklasse Usable. Wird gebraucht, um Spiel-Objekte "Abilities"
 * erzeugen zu können.
 * TODO: Check Grammatical
 */
public class Ability extends Usable {


    private int timer;//roundTimer
    private String name;
    private String iconPath;
    //increase in percent 0.XX
    private double increaseHealth;
    private double increaseMana;
    private double increaseDamage;
    private double increaseArmor;
    private int increaseDrawLimit;
    public Ability(int ID, int timer, String name, String iconPath, double increaseHealth, double increaseMana, double increaseDamage, double increaseArmor, int increaseDrawLimit) {
        super(ID,name,iconPath);
        this.timer = timer;
        this.name = name;
        this.iconPath = iconPath;
        this.increaseHealth = increaseHealth;
        this.increaseMana = increaseMana;
        this.increaseDamage = increaseDamage;
        this.increaseArmor = increaseArmor;
        this.increaseDrawLimit = increaseDrawLimit;
    }

    public int timer() {
        return timer;
    }

    public Ability setTimer(int timer) {
        this.timer = timer;
        return this;
    }
    public Ability countAbility(){
        this.timer--;
        return this;
    }

    public String name() {
        return name;
    }

    public Ability setName(String name) {
        this.name = name;
        return this;
    }

    public String iconPath() {
        return iconPath;
    }

    public Ability setIconPath(String iconPath) {
        this.iconPath = iconPath;
        return this;
    }

    public double increaseHealth() {
        return increaseHealth;
    }

    public Ability setIncreaseHealth(double increaseHealth) {
        this.increaseHealth = increaseHealth;
        return this;
    }

    public double increaseMana() {
        return increaseMana;
    }

    public Ability setIncreaseMana(double increaseMana) {
        this.increaseMana = increaseMana;
        return this;
    }

    public double increaseDamage() {
        return increaseDamage;
    }

    public Ability setIncreaseDamage(double increaseDamage) {
        this.increaseDamage = increaseDamage;
        return this;
    }

    public double increaseArmor() {
        return increaseArmor;
    }

    public Ability setIncreaseArmor(double increaseArmor) {
        this.increaseArmor = increaseArmor;
        return this;
    }

    public int increaseDrawLimit() {
        return increaseDrawLimit;
    }

    public Ability setIncreaseDrawLimit(int increaseDrawLimit) {
        this.increaseDrawLimit = increaseDrawLimit;
        return this;
    }
    /**
     * toString() Rueckgabe von den Attributen
     * @return String
     * Hier werden die Attribute von der Warrior Karte zuruek gegeben.
     */
    @Override
    public String toString() {
        return "Ability{" +super.toString()+
                ", increaseHealth=" + increaseHealth +
                ", increaseMana=" + increaseMana +
                ", increaseDamage=" + increaseDamage +
                ", increaseArmor=" + increaseArmor +
                ", increaseDrawLimit=" + increaseDrawLimit +
                '}';
    }
}
