package de.prog2.uwupatch1.Model.Items.PlayerAttachments;

/**
 * @author Niclas Rieckers
 * {@code @Info}
 * Klasse Artifact wird gebraucht um Spiel-Objekte "Artifacts" erzeugen zu koennen. Erbt von Superklasse Ability,
 * da Artifact die gleiche Funktion wie Ability hat, der Unterschied liegt lediglich beim Timer.
 * Dieser ist auf -1 gesetzt, damit der Effekt endlos andauern kann.
 */
public class Artifact extends Ability {

    public Artifact(int ID, String name, String iconPath, double increaseHealth, double increaseMana, double increaseDamage, double increaseArmor, int increaseDrawLimit) {
        super(ID,
                -1,
                name,
                iconPath,
                increaseHealth,
                increaseMana,
                increaseDamage,
                increaseArmor,
                increaseDrawLimit);
    }
    /**
     * toString() Rueckgabe von den Attributen
     * @return String
     * Hier werden die Attribute von der Warrior Karte zuruek gegeben.
     */
    @Override
    public String toString() {
        return "Artifact{" +
                "timer=" + super.timer() +
                ", name='" + super.name() + '\'' +
                ", iconPath='" + super.icon().getUrl() + '\'' +
                ", increaseHealth=" + super.increaseHealth() +
                ", increaseMana=" + super.increaseMana() +
                ", increaseDamage=" + super.increaseDamage() +
                ", increaseArmor=" + super.increaseArmor() +
                ", increaseDrawLimit=" + super.increaseDrawLimit() +
                '}';
    }
}
