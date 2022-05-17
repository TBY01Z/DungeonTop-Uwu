package com.prog2.uwupatch1.Model.Events;

import com.PROG2.Model.Database.*;
import com.prog2.uwupatch1.Model.PlayerAttachment.Adventurer;
import com.prog2.uwupatch1.Model.PlayerAttachment.Deck;
import com.prog2.uwupatch1.Model.PlayerAttachment.DungeonMaster;
import com.prog2.uwupatch1.Model.PlayerAttachment.Usable;
import javafx.collections.ObservableList;

import static com.PROG2.util.MyIO.print;
import static com.PROG2.util.MyIO.random;

/**
 * @author Niclas Rieckers
 */
public class Treasures {
    private Adventurer player01;
    private DungeonMaster player02;

    /**
     * Konstruktur der Klasse
     * @param player01
     * @param player02
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
     * @return
     */
    public Treasures luck(int player){
        if(player == 1){
            int zen = this.player01.zen();
            Deck deck = this.player01.cards();
            ObservableList<Usable> inv = this.player01.inventory();

            this.player01.setZen((zen + (random(0,100)*(int) this.player01.level())));
            deck.add(EffectCards.get(random(1, EffectCards.getEffectCards().size())-1));
            deck.add(WarriorCards.get(random(1, WarriorCards.warriorCards().size())-1));
            this.player01.setCards(deck);
            this.player01.inventory().add(Weapons.get(random(1, Weapons.weapons().size())));
            this.player01.inventory().add(Armors.get(random(1,Armors.armors().size())));
            this.player01.inventory().add(Artifacts.get(random(1,Artifacts.artifacts().size())));
        }else if(player == 2){
            int zen = this.player02.zen();
            Deck deck = this.player02.cards();
            ObservableList<Usable> inv = this.player02.inventory();

            this.player02.setZen((zen + (random(0,100)*(int) this.player02.level())));
            deck.add(EffectCards.get(random(1, EffectCards.getEffectCards().size())-1));
            deck.add(WarriorCards.get(random(1, WarriorCards.warriorCards().size())-1));
            this.player02.setCards(deck);
            this.player02.inventory().add(Weapons.get(random(1, Weapons.weapons().size())));
            this.player02.inventory().add(Armors.get(random(1,Armors.armors().size())));
            this.player02.inventory().add(Artifacts.get(random(1,Artifacts.artifacts().size())));
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
