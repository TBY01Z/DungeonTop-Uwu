package de.prog2.uwupatch1.Model.InGameEvents;


import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Deck;
import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Usable;
import de.prog2.uwupatch1.Model.Collectables.*;
import de.prog2.uwupatch1.Model.PlayerSelf.Player;
import javafx.collections.ObservableList;

import static de.prog2.uwupatch1.util.MyIO.print;
import static de.prog2.uwupatch1.util.MyIO.random;

/**
 * @author Niclas Rieckers
 * TODO: Modulariesieren
 */
public class Treasures {
    private Player player01;
    private Player player02;

    /**
     * Konstruktor der Klasse
     */
    public Treasures(Player player01, Player player02) {
        this.player01 = player01;
        this.player02 = player02;
    }

    public Player player01() {
        return player01;
    }

    public Treasures setPlayer01(Player player01) {
        this.player01 = player01;
        return this;
    }

    /**
     * Diese Methode befuellt den Player mit zufaelligen Items
     * @param player
     * 1=Adventurer
     * 2=DungeonMaster
     */
    public Treasures luck(int player){
        int CONST_OF_RANDOM = -1;
        int ID_PARAMETER = 100;
        if(player == 1){
            int zen = this.player01.zen();
            Deck deck = this.player01.cards();
            ObservableList<Usable> inv = this.player01.inventory();

            this.player01.setZen((zen + (random()% ID_PARAMETER *(int) this.player01.playerLevel())));
            deck.add(EffectCards.get((random()% ID_PARAMETER)+ CONST_OF_RANDOM));
            deck.add(WarriorCards.get((random()% ID_PARAMETER)+ CONST_OF_RANDOM));
            this.player01.setCards(deck);
            this.player01.inventory().add(Weapons.get(random() % Weapons.weapons().size()));
            this.player01.inventory().add(Armors.get(random() % Armors.armors().size()));
            this.player01.inventory().add(Artifacts.get(random() % Artifacts.artifacts().size()));
        }else if(player == 2){
            int zen = this.player02.zen();
            Deck deck = this.player02.cards();
            ObservableList<Usable> inv = this.player02.inventory();

            this.player02.setZen((zen + (random()% ID_PARAMETER *(int) this.player01.playerLevel())));
            deck.add(EffectCards.get((random()% ID_PARAMETER)+ CONST_OF_RANDOM));
            deck.add(WarriorCards.get((random()% ID_PARAMETER)+ CONST_OF_RANDOM));
            this.player02.setCards(deck);
            this.player02.inventory().add(Weapons.get(random() % Weapons.weapons().size()));
            this.player02.inventory().add(Armors.get(random() % Armors.armors().size()));
            this.player02.inventory().add(Artifacts.get(random() % Artifacts.artifacts().size()));
        }else{
            print("Wrong Input");
        }
        return this;
    }




    /**
     * Getter Methode fuer den zweiten Player aka. DungeonMaster
     * @return DungeonMaster
     */
    public Player player02() {
        return player02;
    }

    /**
     * TODO: nicht sicher was hier passieren soll...?
     * @param player02
     * @return
     */
    public Treasures setPlayer02(Player player02) {
        this.player02 = player02;
        return this;
    }
}
