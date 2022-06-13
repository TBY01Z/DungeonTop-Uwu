package de.prog2.uwupatch1.Model.Collectables;


import de.prog2.uwupatch1.Model.PlayerSelf.Player;

import java.io.*;

/**
 * @author Tom Grape
 * Klasse für das Speichern und Serialisieren des Zustands des Objekts "Player", sowie das
 * "Laden" eines Zustands aus persistentem Speicher.
 */
public class SaveData implements Serializable {

    /**
     * Methode zum Speichern des aktuellen Zustands von Player
     * @param player das zu speichernde Objekt
     */
    public void save(Player player) {
        File file = new File("C:\\spiel\\data.save"); //Instanz von File wird erzeugt, als Parameter wird
        //der Ziel-Dateipfad übergeben.
        try {
            FileOutputStream fos = new FileOutputStream(file); //Instanz von FileOutputStream, file wird übergeben
            ObjectOutputStream oos = new ObjectOutputStream(fos); //Instanz von ObjectOutputStream, FileOutputStream
            //wurde übergeben

            oos.writeObject(player); //Aktueller Zustand von Player wird von ObjectOutputStream in die Datei geschrieben

        } catch (IOException notfound) {
            notfound.printStackTrace();
        }
    }

    /**
     * Methode für das Laden eines zuvor persistent gespeicherten Zustands des Objekts Player.
     * @return Zustand von player
     */
    public Player load() {
        Player player = null;
        File file = new File("C:\\spiel\\data.save"); //Instanz von File, als Parameter Dateipfad
        try {
            FileInputStream fis = new FileInputStream(file); //FileInputStream Instanz bekommt Dateipfad übergeben
            ObjectInputStream ois = new ObjectInputStream(fis); //ObjectInputStream bekommt FileInputStream übergeben

            player = (Player) ois.readObject(); //ObjectInputStream wird mit player gleichgesetzt, Zustand "geladen"

        } catch (IOException notfound) {
            notfound.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return player;  //Geladener Zustand von player wird zurückgegeben.
    }

}
