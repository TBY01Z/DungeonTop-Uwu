package de.prog2.uwupatch1.Model.Database;


import de.prog2.uwupatch1.Model.Cards.EffectCard;
import de.prog2.uwupatch1.Model.Cards.SummonedWarriorCard;
import de.prog2.uwupatch1.Model.Cards.WeaponCard;
import de.prog2.uwupatch1.Model.PlayerAttachment.*;

import java.io.*;
import java.util.Scanner;

/**
 * @author Niclas Rieckers
 * Diese Klassebefuellt die DataBase Klassen.
 * TODO: Check Grammatical
 */

public class InputClass {
    /**
     *
     * @return true
     * if @return true fill is positiv
     */
    public static boolean inputFill(){
        boolean res = false;
        try{
            abilities();
            armors();
            artifacts();
            classTypes();
            effectCards();
            warriorCards();
            startDecks();
            weapons();
            weaponCards();
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
        Scanner scanner = new Scanner(new File((InputClass.class.getResource("Ability.txt").getFile())));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String [] activeLine = line.split("-");
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
        Scanner scanner = new Scanner(new File(InputClass.class.getResource("Armor.txt").getFile()));
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
        Scanner scanner = new Scanner(new File((InputClass.class.getResource("Artifact.txt")).getFile()));
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
     * Fuellt die Klasse CharacterTypes aus der CharType.txt
     */
    private static void classTypes() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File((InputClass.class.getResource( "CharacterType.txt")).getFile()));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            CharacterTypes.add(new CharacterType(
                    activeLine[0],
                    activeLine[1],
                    Abilities.get(Integer.parseInt(activeLine[2])%100).setTimer(-1)
            ));
        }

    }
    /***
     * Fuellt die Klasse EffectCards aus der EffectCard.txt
     */
    private static void effectCards() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(InputClass.class.getResource("EffectCard.txt").getFile()));
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
     * Fuellt die Klasse StartDecks aus der StartDeck.txt.txt
     */
    private static void startDecks() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File((InputClass.class.getResource("StartDeck.txt")).getFile()));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            Deck activeDeck = new Deck();
            for (String obj:
                 activeLine) {

                int id = Integer.parseInt(obj);
                if (id>=0 && id<=99){
                    activeDeck.add(WarriorCards.get(id));
                }else{
                    activeDeck.add(EffectCards.get((id % 100)));
                }
            }
            StartDecks.add(activeDeck);
        }
    }
    /***
     * Fuellt die Klasse WarriorCards aus der Warrior.txt
     */
    private static void warriorCards() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(InputClass.class.getResource( "WarriorCard.txt").getFile()));
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
        Scanner scanner = new Scanner(new File(InputClass.class.getResource( "Weapon.txt").getFile()));
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
    private static void weaponCards() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File(InputClass.class.getResource( "WeaponCard.txt").getFile()));
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
