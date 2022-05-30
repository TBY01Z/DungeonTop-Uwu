package de.prog2.uwupatch1.Model.PlayerAttachment;

/**
 * @author Niclas Rieckers
 * @Info
 * Klasse Artifact, erbt von Superklasse Ability. Wird gebraucht, um Spiel-Objekte "Artifacts"
 * erzeugen zu können. Da Atrifact quasie wie Ability ist nur der Timer ist auf -1 um denn Effekt unendlich zu taetigen.
 * TODO: Check Grammatical
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
                ", iconPath='" + super.iconPath() + '\'' +
                ", increaseHealth=" + super.increaseHealth() +
                ", increaseMana=" + super.increaseMana() +
                ", increaseDamage=" + super.increaseDamage() +
                ", increaseArmor=" + super.increaseArmor() +
                ", increaseDrawLimit=" + super.increaseDrawLimit() +
                '}';
    }
}
