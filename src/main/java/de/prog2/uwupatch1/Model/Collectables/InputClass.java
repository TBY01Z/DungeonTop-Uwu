package de.prog2.uwupatch1.Model.Collectables;


import de.prog2.uwupatch1.Model.Items.Cards.EffectCard;
import de.prog2.uwupatch1.Model.Items.Cards.SummonedWarriorCard;
import de.prog2.uwupatch1.Model.Items.Cards.WeaponCard;
import de.prog2.uwupatch1.Model.Items.PlayerAttachments.*;
import de.prog2.uwupatch1.Model.PlayerSelf.*;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author Niclas Rieckers
 * Diese Klassebefuellt die DataBase Klassen.
 */

public class InputClass {
    /**
     * TODO:check ob mans besser ausdruecken kann?
     *Methode prueft, ob alle Objekte mit Attributen befuellt wurden.
     * @return true
     * if @return true fill is positiv
     */
    public static boolean inputFill(){
        boolean res = false;
        try{
            abilities();
            armors();
            artifacts();
            personalityTypeCast();
            effectCards();
            warriorCards();
            weapons();
            weaponCards();
            startDecks();

            res = true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return res;
    }

    /***
     * Fuellt die Klasse abilities aus der Ability.txt
     */
    private static void abilities() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File((Objects.requireNonNull(InputClass.class.getResource("Ability.txt")).getFile())));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] activeLine = line.split("_");
            Abilities.addEffect(new Ability(
                    Integer.parseInt(activeLine[0]),
                    Integer.parseInt(activeLine[1]),
                    activeLine[2],
                    activeLine[3],
                    Double.parseDouble(activeLine[4]),
                    Double.parseDouble(activeLine[5]),
                    Double.parseDouble(activeLine[6]),
                    Double.parseDouble(activeLine[7]),
                    Integer.parseInt(activeLine[8])));
        }
    }
    /***
     * Fuellt die Klasse Armors aus der Armor.txt
     */
    private static void armors() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(Objects.requireNonNull(InputClass.class.getResource("Armor.txt")).getFile()));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] activeLine = line.split("-");
            Armors.add(new Armor(
                    Integer.parseInt(activeLine[0]),
                    activeLine[1],
                    activeLine[2],
                    Double.parseDouble(activeLine[3])
            ));//(int ID, String objName, String iconPath, double health, double addHealth)
        }

    }
    /***
     * Fuellt die Klasse Artifacts aus der Artifact.txt
     */
    private static void artifacts() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File((Objects.requireNonNull(InputClass.class.getResource("Artifact.txt"))).getFile()));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            Artifacts.add(new Artifact(
                    Integer.parseInt(activeLine[0]),
                    activeLine[1],
                    activeLine[2],
                    Double.parseDouble(activeLine[3]),
                    Double.parseDouble(activeLine[4]),
                    Double.parseDouble(activeLine[5]),
                    Double.parseDouble(activeLine[6]),
                    Integer.parseInt(activeLine[7])
            ));
        }

    }
    /***
     * Fuellt die Klasse PersonalityTypeCasts aus der CharType.txt
     */
    private static void personalityTypeCast() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File((Objects.requireNonNull(InputClass.class.getResource("PersonalityTypeCast.txt"))).getFile()));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            PersonalityTypeCasts.add(new PersonalityTypeCast(
                    activeLine[0],
                    activeLine[1],
                    activeLine[2],
                    Abilities.get(Integer.parseInt(activeLine[3])%100),
                    Double.parseDouble(activeLine[4]),
                    Double.parseDouble(activeLine[5]),
                    Double.parseDouble(activeLine[6]),
                    Integer.parseInt(activeLine[7])

            ));
        }

    }
    /***
     * Fuellt die Klasse EffectCards aus der EffectCard.txt
     */
    private static void effectCards() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(Objects.requireNonNull(InputClass.class.getResource("EffectCard.txt")).getFile()));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            EffectCards.add(new EffectCard(
                    Integer.parseInt(activeLine[0]),
                    activeLine[1],
                    activeLine[2],
                    Abilities.get(Integer.parseInt(activeLine[3])%100),
                    Integer.parseInt(activeLine[4]),
                    Integer.parseInt(activeLine[5]),1
            ));//EffectCard(int ID, String objName, String iconPath, Ability cardAbility, int buyCost, int summonCost)

        }


    }
    /***
     * Fuellt die Klasse Ethnicities aus der StartDeck.txt.txt
     */
    private static void startDecks() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File((Objects.requireNonNull(InputClass.class.getResource("StartDeck.txt"))).getFile()));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            Deck activeDeck = new Deck();
            int i = 0;
            String[] strings = {"","",""};
            for (String obj:
                 activeLine) {
                if(i>2){
                    int id = Integer.parseInt(obj);
                    int ID_PARAMETER = 100;
                    switch (id / ID_PARAMETER){
                        case 0:activeDeck.add(WarriorCards.get(id));
                        case 1:activeDeck.add(EffectCards.get(id % ID_PARAMETER));
                        case 6:activeDeck.add(WeaponCards.get(id % ID_PARAMETER));
                    }
                }else {
                    strings[i] = obj;
                    i++;
                }

            }
            Ethnicities.add(new Ethnicity(strings[0],strings[1],strings[2],activeDeck));
        }
    }
    /***
     * Fuellt die Klasse WarriorCards aus der Warrior.txt
     */
    private static void warriorCards() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(Objects.requireNonNull(InputClass.class.getResource("WarriorCard.txt")).getFile()));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            WarriorCards.add(new SummonedWarriorCard(
                    Integer.parseInt(activeLine[0]),
                    activeLine[1],
                    activeLine[2],
                    Double.parseDouble(activeLine[3]),
                    Double.parseDouble(activeLine[4]),
                    Double.parseDouble(activeLine[5]),
                    Integer.parseInt(activeLine[6]),
                    Integer.parseInt(activeLine[7]),
                    Integer.parseInt(activeLine[8]),
                    Integer.parseInt(activeLine[9]),1
            ));//SummonedWarriorCard(int ID, String objName, String iconPath, double health, double hitDamage, double defense, int hitRange, int moveRange, boolean canSummon, int buyCost)

        }
    }
    /***
     * Fuellt die Klasse Weapons aus der Weapon.txt
     */
    private static void weapons() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(Objects.requireNonNull(InputClass.class.getResource("Weapon.txt")).getFile()));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            Weapons.add(new Weapon(
                    Integer.parseInt(activeLine[0]),
                    activeLine[1],
                    activeLine[2],
                    Integer.parseInt(activeLine[3]),
                    Double.parseDouble(activeLine[4]),
                    Integer.parseInt(activeLine[5]),
                    Integer.parseInt(activeLine[6])
            ));
        }
    }
    //Weapon(int ID, String objName, String iconPath, int level, double hit, int range, int cost)
    /***
     * Fuellt die Klasse Weapons aus der WeaponCard.txt
     */
    private static void weaponCards() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File(Objects.requireNonNull(InputClass.class.getResource("WeaponCard.txt")).getFile()));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            WeaponCards.add(new WeaponCard(
                    Integer.parseInt(activeLine[0]),
                    activeLine[1],
                    activeLine[2],
                    Integer.parseInt(activeLine[3]),
                    Integer.parseInt(activeLine[4]),
                    Double.parseDouble(activeLine[5])));
        }
    }//public WeaponCard(int ID, String objName, String iconPath, int summonCost, int level,double cardDamage) {
}
