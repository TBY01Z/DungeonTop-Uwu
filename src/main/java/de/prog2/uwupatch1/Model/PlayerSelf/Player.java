package de.prog2.uwupatch1.Model.PlayerSelf;

import de.prog2.uwupatch1.Model.Items.PlayerAttachments.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.Serializable;

/**
 * @author Niclas Rieckers
 * Superklasse für alle im Spiel vorhandenen spielbaren Charakter.
 * TODO: Check Grammatical & comments
 */

public class Player implements Serializable {
    //Attribute
    private PlayerType type;

    private PersonalityTypeCast personalityTypeCast;
    private Ethnicity ethnicity;

    private Weapon weapon;

    private Armor armor;

    private Artifact artifact01;

    private Artifact artifact02;

    private double playerLevel;

    private double groundDamage;

    private double groundMana;

    private double groundManaPerRound;

    private double groundHealth;

    private int groundDrawLimit;

    private double outComeDamage;

    private double outComeManaPerRound;

    private double outComeHealth;

    private int outComeDrawLimit;

    private Deck cards;

    private ObservableList<Ability> effect = FXCollections.observableArrayList();

    private ObservableList<Usable> inventory = FXCollections.observableArrayList();

    private int zen = 100;
    //Constructor


    public Player(PlayerType type, PersonalityTypeCast personalityTypeCast, Weapon weapon, Armor armor, Artifact artifact01, Artifact artifact02, double playerLevel, double groundDamage, double groundMana, double groundManaPerRound, double groundHealth, int groundDrawLimit, Ethnicity ethnicity) {
        this.type = type;
        this.personalityTypeCast = personalityTypeCast;
        this.weapon = weapon;
        this.armor = armor;
        this.artifact01 = artifact01;
        this.artifact02 = artifact02;
        this.playerLevel = playerLevel;
        this.groundDamage = groundDamage;
        this.groundMana = groundMana;
        this.groundManaPerRound = groundManaPerRound;
        this.groundHealth = groundHealth;
        this.groundDrawLimit = groundDrawLimit;
        this.setOutComeDamage(groundDamage);
        this.setOutComeManaPerRound(groundManaPerRound);
        this.setOutComeHealth(groundHealth);
        this.setOutComeDrawLimit(groundDrawLimit);
        this.ethnicity = ethnicity;
        this.cards = ethnicity.ethnicityDeck();
    }
    //Own Methods
    private void delEffect(Ability ability){
        this.outComeHealth -= (this.groundHealth() * ability.increaseHealth());
        this.outComeDamage -= (this.groundDamage() * ability.increaseDamage());
        this.outComeManaPerRound -= (this.groundManaPerRound() * ability.increaseMana());
        this.armor.setAddHealth(this.armor.addHealth()-(this.armor.health()*ability.increaseArmor()));
        this.outComeDrawLimit -= ability.increaseDrawLimit();
    }
    private Player addingEffect(Ability ability){
        this.outComeHealth += (this.groundHealth() * ability.increaseHealth());
        this.outComeDamage += (this.groundDamage() * ability.increaseDamage());
        this.outComeManaPerRound += (this.groundManaPerRound() * ability.increaseMana());
        this.armor.setAddHealth(this.armor.addHealth()+(this.armor.health()*ability.increaseArmor()));
        this.outComeDrawLimit += ability.increaseDrawLimit();
        effect().add(ability);
        return this;
    }
    @SuppressWarnings("UnusedAssignment")
    public Player checkEffects(){   //keine ahnung was diese Methode genau macht
        for (Ability ability:
                effect()) {
            if(ability.timer()==0){
                this.effect.remove(ability);
                this.delEffect(ability);

            }else {
                ability = ability.countAbility();
            }
        }
        return this;
    }
    private void levelUp(){
        // TODO: 03.06.2022
    }

    //Getter & Setter

    public PlayerType type() {
        return type;
    }

    public Player setType(PlayerType type) {
        this.type = type;
        return this;
    }

    public PersonalityTypeCast personalityTypeCast() {
        return personalityTypeCast;
    }

    public Player setPersonalityTypeCast(PersonalityTypeCast personalityTypeCast) {
        this.personalityTypeCast = personalityTypeCast;
        return this;
    }

    public Ethnicity ethnicity() {
        return ethnicity;
    }

    public Player setEthnicity(Ethnicity ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }

    public Weapon weapon() {
        return weapon;
    }

    public Player setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Armor armor() {
        return armor;
    }

    public Player setArmor(Armor armor) {
        this.armor = armor;
        return this;
    }

    public Artifact artifact01() {
        return artifact01;
    }

    public Player setArtifact01(Artifact artifact01) {
        this.artifact01 = artifact01;
        return this;
    }

    public Artifact artifact02() {
        return artifact02;
    }

    public Player setArtifact02(Artifact artifact02) {
        this.artifact02 = artifact02;
        return this;
    }

    public double playerLevel() {
        return playerLevel;
    }

    public Player setPlayerLevel(double playerLevel) {
        this.playerLevel = playerLevel;
        return this;
    }

    public double groundDamage() {
        return groundDamage;
    }

    public Player setGroundDamage(double groundDamage) {
        this.groundDamage = groundDamage;
        return this;
    }

    public double groundMana() {
        return groundMana;
    }

    public Player setGroundMana(double groundMana) {
        this.groundMana = groundMana;
        return this;
    }

    public double groundManaPerRound() {
        return groundManaPerRound;
    }

    public Player setGroundManaPerRound(double groundManaPerRound) {
        this.groundManaPerRound = groundManaPerRound;
        return this;
    }

    public double groundHealth() {
        return groundHealth;
    }

    public Player setGroundHealth(double groundHealth) {
        this.groundHealth = groundHealth;
        return this;
    }

    public int groundDrawLimit() {
        return groundDrawLimit;
    }

    public Player setGroundDrawLimit(int groundDrawLimit) {
        this.groundDrawLimit = groundDrawLimit;
        return this;
    }

    public double outComeDamage() {
        return outComeDamage;
    }

    public void setOutComeDamage(double outComeDamage) {
        this.outComeDamage = outComeDamage;
    }

    public double outComeManaPerRound() {
        return outComeManaPerRound;
    }

    public void setOutComeManaPerRound(double outComeManaPerRound) {
        this.outComeManaPerRound = outComeManaPerRound;
    }

    public double outComeHealth() {
        return outComeHealth;
    }

    public void setOutComeHealth(double outComeHealth) {
        this.outComeHealth = outComeHealth;
    }

    public int outComeDrawLimit() {
        return outComeDrawLimit;
    }

    public void setOutComeDrawLimit(int outComeDrawLimit) {
        this.outComeDrawLimit = outComeDrawLimit;
    }

    public Deck cards() {
        return cards;
    }

    public void setCards(Deck cards) {
        this.cards = cards;
    }

    public ObservableList<Ability> effect() {
        return effect;
    }

    public Player setEffect(ObservableList<Ability> effect) {
        this.effect = effect;
        return this;
    }

    public ObservableList<Usable> inventory() {
        return inventory;
    }

    public Player setInventory(ObservableList<Usable> inventory) {
        this.inventory = inventory;
        return this;
    }

    public int zen() {
        return zen;
    }

    public void setZen(int zen) {
        this.zen = zen;
    }
}
