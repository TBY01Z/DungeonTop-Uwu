package de.prog2.uwupatch1.Model.Events;


import de.prog2.uwupatch1.Model.PlayerAttachment.Adventurer;
import de.prog2.uwupatch1.Model.PlayerAttachment.Deck;
import de.prog2.uwupatch1.Model.PlayerAttachment.DungeonMaster;
import de.prog2.uwupatch1.Model.PlayerAttachment.Usable;
import de.prog2.uwupatch1.Model.Database.*;
import javafx.collections.ObservableList;

import static de.prog2.uwupatch1.util.MyIO.print;
import static de.prog2.uwupatch1.util.MyIO.random;

/**
 * @author Niclas Rieckers
 * TODO: Check Grammatical
 */
public class Treasures {
    private Adventurer player01;
    private DungeonMaster player02;

    /**
     * Konstruktur der Klasse
     */
    public Treasures(Adventurer player01, DungeonMaster player02) {
        this.player01 = player01;
        this.player02 = player02;
    }

    public Adventurer player01() {
        return player01;
    }

    public Treasures setPlayer01(Adventurer player01) {
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

            this.player01.setZen((zen + (random()% ID_PARAMETER *(int) this.player01.level())));
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

            this.player02.setZen((zen + (random()% ID_PARAMETER *(int) this.player01.level())));
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


    public DungeonMaster player02() {
        return player02;
    }

    public Treasures setPlayer02(DungeonMaster player02) {
        this.player02 = player02;
        return this;
    }
}