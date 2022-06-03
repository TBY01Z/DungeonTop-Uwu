package de.prog2.uwupatch1.Model.PlayerAttachment;

import de.prog2.uwupatch1.Model.Icon.LoadIcons;
import javafx.scene.image.Image;

/**
 * @author Mark Fischer
 * Klasse CharacterType, wird gebraucht, um Spiel-Objekte "CharacterTypes"
 * erzeugen zu können.
 * TODO: Check Grammatical
 */
public class CharacterType {
    private String name;

    public String name() {
        return name;
    }

    private Image icon;
    private Ability ability;

    public CharacterType(String name, String iconpath, Ability ability) {
        this.name = name;
        icon = new Image(String.valueOf(LoadIcons.class.getResource(iconpath)));
        this.ability = ability;
    }

    public Image icon() {
        return icon;
    }

    public CharacterType setIcon(Image icon) {
        this.icon = icon;
        return this;
    }

    public Ability ability() {
        return ability;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAbilityID(){
        return ability.ID();
    }
    public Ability getAbility(){
        return ability;
    }
    public void setAbility(Ability ability){
        this.ability = ability;
    }
    /**
     * toString() Rueckgabe von den Attributen
     * @return String
     * Hier werden die Attribute von der Warrior Karte zuruek gegeben.
     */
    @Override
    public String toString() {
        return "CharacterType{" +
                "name='" + name + '\'' +
                ", iconpath='" + icon.getUrl() + '\'' +
                ", ability=" + ability +
                '}';
    }
}
