package de.prog2.uwupatch1.Model.PlayerSelf;

import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Ability;
import javafx.scene.image.Image;

import static de.prog2.uwupatch1.util.MyIO.loadIcon;

/**
 * @author Mark Fischer
 * Klasse PersonalityTypeCast, wird gebraucht, um Spiel-Objekte "PersonalityTypeCasts"
 * erzeugen zu können.
 * TODO: Check Grammatical
 */
public class PersonalityTypeCast {

    //Attribute
    private String personalityName;
    private String specification;
    private Image icon;
    private Ability ability;

    private double groundDamage;

    private double groundMana;

    private double groundHealth;

    private int groundDrawLimit;

    private int groundHandLimit;

    //Constructor
    public PersonalityTypeCast(String personalityName, String specification, String icon, Ability ability, double groundDamage, double groundMana, double groundHealth, int groundDrawLimit) {
        this.personalityName = personalityName;
        this.specification = specification;
        this.icon = loadIcon(icon);
        int ABILITY_TIMER_CONST = -1;
        this.ability = ability.setTimer(ABILITY_TIMER_CONST);
        this.groundDamage = groundDamage;
        this.groundMana = groundMana;
        this.groundHealth = groundHealth;
        this.groundDrawLimit = groundDrawLimit;
    }
    //Own methods

    //Getter & Setter
    public String personalityName() {
        return personalityName;
    }

    public PersonalityTypeCast setPersonalityName(String personalityName) {
        this.personalityName = personalityName;
        return this;
    }

    public String specification() {
        return specification;
    }

    public PersonalityTypeCast setSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    public Image icon() {
        return icon;
    }

    public PersonalityTypeCast setIcon(Image icon) {
        this.icon = icon;
        return this;
    }

    public Ability ability() {
        return ability;
    }

    public PersonalityTypeCast setAbility(Ability ability) {
        this.ability = ability;
        return this;
    }

    public double groundDamage() {
        return groundDamage;
    }

    public PersonalityTypeCast setGroundDamage(double groundDamage) {
        this.groundDamage = groundDamage;
        return this;
    }

    public double groundMana() {
        return groundMana;
    }

    public PersonalityTypeCast setGroundMana(double groundMana) {
        this.groundMana = groundMana;
        return this;
    }

    public double groundHealth() {
        return groundHealth;
    }

    public PersonalityTypeCast setGroundHealth(double groundHealth) {
        this.groundHealth = groundHealth;
        return this;
    }

    public int groundDrawLimit() {
        return groundDrawLimit;
    }

    public PersonalityTypeCast setGroundDrawLimit(int groundDrawLimit) {
        this.groundDrawLimit = groundDrawLimit;
        return this;
    }

    public int groundHandLimit() {
        return groundHandLimit;
    }

    public PersonalityTypeCast setGroundHandLimit(int groundHandLimit) {
        this.groundHandLimit = groundHandLimit;
        return this;
    }
}
