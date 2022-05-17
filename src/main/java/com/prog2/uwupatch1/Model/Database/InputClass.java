package com.prog2.uwupatch1.Model.Database;

import com.prog2.uwupatch1.Model.Cards.*;
import com.prog2.uwupatch1.Model.PlayerAttachment.*;
import com.prog2.uwupatch1.Model.Database.*;

import java.io.*;
import java.util.Scanner;

/**
 * @author Niclas Rieckers
 * Diese Klassebefuellt die DataBase Klassen.
 *
 */

public class InputClass {
    private static String winResources = System.getProperty("user.dir") + "\\src\\com\\Prog2\\Model\\Database\\";
    private static String macResources = System.getProperty("user.dir") + "/src/com/Prog2/Model/Database/";
    private static String resourses;
    /**
     *
     * @return true
     * if @return true fill is positiv
     */
    public static boolean inputFill(){
        boolean res = false;
        fillRes();
        try{
            abilities();
            armors();
            artifacts();
            classTypes();
            effectCards();
            warriorCards();
            startDecks();
            weapons();
            res = true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return res;
    }

    private static void fillRes() {
        if (System.getProperty("os.name")=="Windows 10"){
            resourses = winResources;
        }else{
            resourses = macResources;
        }
    }

    /***
     * Fuellt die Klasse abilities aus der Ability.txt
     * @throws FileNotFoundException
     */
    public static void abilities() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(resourses + "Ability.txt"));
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
     * @throws FileNotFoundException
     */
    public static void armors() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(resourses + "Armor.txt"));
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
     * @throws FileNotFoundException
     */
    public static void artifacts() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(resourses + "Artifact.txt"));
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
     * @throws FileNotFoundException
     */
    public static void classTypes() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(resourses + "CharacterType.txt"));
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
     * @throws FileNotFoundException
     */
    public static void effectCards() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(resourses + "EffectCard.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] activeLine = line.split("-");
            EffectCards.add(new EffectCard(
                    Integer.parseInt(activeLine[0]),
                    activeLine[1],
                    activeLine[2],
                    Abilities.get(Integer.parseInt(activeLine[3])%100),
                    Integer.parseInt(activeLine[4]),
                    Integer.parseInt(activeLine[5])
            ));//EffectCard(int ID, String objName, String iconPath, Ability cardAbility, int buyCost, int summonCost)

        }


    }
    /***
     * Fuellt die Klasse StartDecks aus der StartDeck.txt.txt
     * @throws FileNotFoundException
     */
    public static void startDecks() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(resourses + "StartDeck.txt"));
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
     * @throws FileNotFoundException
     */
    public static void warriorCards() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(resourses + "WarriorCard.txt"));
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
                    Integer.parseInt(activeLine[9])
            ));//SummonedWarriorCard(int ID, String objName, String iconPath, double health, double hitDamage, double defense, int hitRange, int moveRange, boolean canSummon, int buyCost)

        }
    }
    /***
     * Fuellt die Klasse Weapons aus der Weapon.txt
     * @throws FileNotFoundException
     */
    public static void weapons() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(resourses + "Weapon.txt"));
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
}
