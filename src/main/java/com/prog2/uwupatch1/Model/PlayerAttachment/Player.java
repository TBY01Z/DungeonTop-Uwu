package com.prog2.uwupatch1.Model.PlayerAttachment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.Serializable;

/**
 * @author Niclas Rieckers
 * Superklasse für alle im Spiel vorhandenen spielbaren Charakter.
 * TODO: Check Grammatical
 */
@SuppressWarnings("ALL")
public class Player implements Serializable {
    private double level;
    private double mana;
    private final double addMana = 0;
    private double health;
    private double addHealth = 0;
    private double hitDamage;
    private final double addHitDamage = 0;
    private Weapon weapon;
    private Armor armor;
    private Artifact artifact01;
    private Artifact artifact02;
    private CharacterType classesType;
    private int drawLimit;
    private int addDrawLimit = 0;
    private Deck cards;
    private ObservableList<Ability> abilities = FXCollections.observableArrayList();
    private int zen;
    private ObservableList<Usable> intventory = FXCollections.observableArrayList();


    public Player(double level, double mana, double health, double hitDamage, CharacterType classesType, int drawLimit, int zen) {
        this.level = level;
        this.mana = mana;
        this.health = health;
        this.hitDamage = hitDamage;
        this.classesType = classesType;
        this.drawLimit = drawLimit;
        this.zen = zen;
    }

    /**
     * Methode für das hinzufügen eines Effektes zum Spieler.
     */
    public Player addEffect(Ability ability){
        abilities.add(ability);
        return this;
    }

    /**
     * Methode für das Entfernen von Effekten vom Spieler.
     *
     */
    private void delEffect(Ability ability){
        this.addHealth -= (this.health() * ability.increaseHealth());
        this.hitDamage -= (this.hitDamage() * ability.increaseDamage());
        this.mana -= (this.mana() * ability.increaseMana());
        this.armor.setAddHealth(this.armor.addHealth()-(this.armor.health()*ability.increaseArmor()));
        this.addDrawLimit -= ability.increaseDrawLimit();
    }

    public ObservableList<Usable> inventory() {
        return intventory;
    }

    public Player setIntventory(ObservableList<Usable> intventory) {
        this.intventory = intventory;
        return this;
    }
    public Player addInventory(Usable e){
        this.inventory().add(e);
        return this;
    }

    /**
     * hilfe man was????????????
     */
    private Player addingEffect(Ability ability){
        this.addHealth += (this.health() * ability.increaseHealth());
        this.hitDamage += (this.hitDamage() * ability.increaseDamage());
        this.mana += (this.mana() * ability.increaseMana());
        this.armor.setAddHealth((this.armor.health()*ability.increaseArmor()));
        this.addDrawLimit += ability.increaseDrawLimit();
        return this;
    }
    public Player checkEffects(){   //keine ahnung was diese Methode genau macht
        for (Ability ability:
                abilities) {
            if(ability.timer()==0){
                this.abilities.remove(ability);
                this.delEffect(ability);

            }else {
                ability = ability.countAbility();
            }
        }
        return this;
    }

    /**
     * Getter für Level.
     * @return level
     */
    public double level() {
        return level;
    }

    /**
     * Setter für Level
     * @return level
     */
    public Player setLevel(double level) {
        this.level = level;
        return this;
    }

    /**
     * Getter für Mana
     * @return mana
     */
    public double mana() {
        return mana+addMana;
    }

    /**
     * Setter für mana
     * @return mana
     */
    public Player setMana(double mana) {
        this.mana = mana;
        return this;
    }

    /**
     * Getter für Lebenspunkte
     * @return health
     */
    public double health() {
        return health+addHealth;
    }

    /**
     * Setter für Lebenspunkte
     * @return health
     */
    public Player setHealth(double health) {
        this.health = health;
        return this;
    }

    /**
     * Getter für Hit Damage
     * @return hitDamage
     */
    public double hitDamage() {
        return hitDamage+addHitDamage;
    }

    /**
     * Setter für Hit Damage
     * @return hitDamage
     */
    public Player setHitDamage(double hitDamage) {
        this.hitDamage = hitDamage;
        return this;
    }

    /**
     * Getter für Weapon
     * @return weapon
     */
    public Weapon weapon() {
        return weapon;
    }

    /**
     * Setter für Weapon
     * @return weapon
     */
    public Player setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    /**
     * Getter für Armor
     * @return armor
     */
    public Armor armor() {
        return armor;
    }

    /**
     * Setter für Armor
     * @return armor
     */
    public Player setArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    /**
     * Getter für das erste Artefakt
     * @return artifact01
     */
    public Artifact artifact01() {
        return artifact01;
    }

    /**
     * Setter für das erste Artefakt
     * @return artifact01
     */
    public Player setArtifact01(Artifact artifact01) {
        this.artifact01 = artifact01;
        return this;
    }

    /**
     * Getter für das zweite Artefakt
     * @return artifact02
     */
    public Artifact artifact02() {
        return artifact02;
    }

    /**
     * Setter für das zweite Artefakt
     * @return artifact02
     */
    public Player setArtifact02(Artifact artifact02) {
        this.artifact02 = artifact02;
        return this;
    }

    public CharacterType getClassesType() {
        return classesType;
    }

    public Player setClassesType(CharacterType classesType) {
        this.classesType = classesType;
        return this;
    }

    public int drawLimit() {
        return drawLimit + addDrawLimit;
    }
    public int addDrawLimit(){
        return addDrawLimit;
    }

    public Player setDrawLimit(int drawLimit) {
        this.drawLimit = drawLimit;
        return this;
    }

    public Deck cards() {
        return cards;
    }

    public void setCards(Deck cards) {
        this.cards = cards;
    }

    public ObservableList<Ability> abilities() {
        return abilities;
    }

    public Player setAbilities(ObservableList<Ability> abilities) {
        this.abilities = abilities;
        return this;
    }

    public int zen() {
        return zen;
    }

    public void setZen(int zen) {
        this.zen = zen;
    }
    /**
     * toString() Rueckgabe von den Attributen
     * @return String
     * Hier werden die Attribute von der Warrior Karte zuruek gegeben.
     */
    @Override
    public String toString() {
        return "Player{" +
                "level=" + level +
                ", mana=" + mana +
                ", addMana=" + addMana +
                ", health=" + health +
                ", addHealth=" + addHealth +
                ", hitDamage=" + hitDamage +
                ", addHitDamage=" + addHitDamage +
                ", weapon=" + weapon +
                ", armor=" + armor +
                ", artifact01=" + artifact01 +
                ", artifact02=" + artifact02 +
                ", classesType=" + classesType +
                ", drawLimit=" + drawLimit +
                ", addDrawLimit=" + addDrawLimit +
                ", cards=" + cards +
                ", abilities=" + abilities +
                ", zen=" + zen +
                ", intventory=" + intventory +
                '}';
    }
}
