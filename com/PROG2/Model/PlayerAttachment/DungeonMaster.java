package com.PROG2.Model.PlayerAttachment;


/**
 * @author Mark Fischer
 * Klasse für den Spielbaren Charakter "Dungeon Master" (auch Spieler 2). Erbt von Superklasse Player, genau wie der
 * Spielbare Chrakter "Adventurer". Dungeon Master unterscheidet sich von Adventurer in den Class Types.
 */
public class DungeonMaster extends Player{
    /**
     * Konstruktor für DungeonMaster
     * @param level
     * @param mana
     * @param health
     * @param hitDamage
     * @param classesType
     * @param drawLimit
     * @param zen
     */
    public DungeonMaster(double level, double mana, double health, double hitDamage, CharacterType classesType, int drawLimit, int zen) {
        super(level, mana, health, hitDamage, classesType, drawLimit, zen);
    }

    /**
     * Getter für die Klassentypen
     * Wird hier überlagert, da DungeonMaster und Adventurer verschiedene Klassentypen haben sollen.
     * @return classesType
     */
    @Override
    public CharacterType getClassesType() {
        return getClassesType();
    }

    /**
     * Setter für Klassentypen des DungeonMaster
     * Wird hier überlagert, da DungeonMaster und Adventurer verschiedene Klassentypen haben sollen.
     * @param classesType
     * @return classesType
     */
    public Player setClassesType(CharacterType classesType) {
        this.setClassesType(classesType);
        return this;
    }
}