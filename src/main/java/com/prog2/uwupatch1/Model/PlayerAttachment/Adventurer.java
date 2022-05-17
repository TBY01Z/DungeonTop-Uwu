package com.prog2.uwupatch1.Model.PlayerAttachment;

/**
 * @author Mark Fischer
 * Klasse für den Spielbaren Charakter "Adventurer". Erbt von Superklasse Player, genau wie der Spielbare
 * Chrakter "Dungeon Master". Adventurer unterscheidet sich von Dungeon Master in den Class Types.
 */
public class Adventurer extends Player{


    public Adventurer(double level, double mana, double health, double hitDamage, CharacterType classesType, int drawLimit, int zen) {
        super(level, mana, health, hitDamage, classesType, drawLimit, zen);
    }

    @Override
    public CharacterType getClassesType() {
        return getClassesType();
    }

    public Player setClassesType(CharacterType classesType) {
        this.setClassesType(classesType);
        return this;
    }
}
