package com.PROG2.Model.PlayerAttachment;
/**
 * @author Mark Fischer
 * Klasse CharacterType, wird gebraucht, um Spiel-Objekte "CharacterTypes"
 * erzeugen zu können.
 */
public class CharacterType {
    private String name;
    private String iconpath;
    private Ability ability;

    public CharacterType(String name, String iconpath, Ability ability) {
        this.name = name;
        this.iconpath = iconpath;
        this.ability = ability;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getIconpath(){
        return iconpath;
    }
    public void setIconpath(String iconpath){
        this.iconpath = iconpath;
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
                ", iconpath='" + iconpath + '\'' +
                ", ability=" + ability +
                '}';
    }
}
