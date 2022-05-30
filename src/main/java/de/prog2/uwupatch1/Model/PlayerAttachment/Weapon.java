package de.prog2.uwupatch1.Model.PlayerAttachment;
/**
 * @author Ali Herz
 * TODO: Check Grammatical
 */
public class Weapon extends Usable {
    private final double DAMAGE_ADD_PER_LEVEL= 0.25;

    private int level;
    private double hit;
    private int range;
    private int cost;

    public Weapon(int ID, String objName, String iconPath, int level, double hit, int range, int cost) {
        super(ID, objName, iconPath);
        this.level = level;
        this.hit = hit;
        this.range = range;
        this.cost = cost;
    }

    public int level() {
        return level;
    }

    public Weapon setLevel(int level) {
        this.level = level;
        return this;
    }

    public double hit() {
        return hit+((hit*DAMAGE_ADD_PER_LEVEL)*(level()));
    }

    public Weapon setHit(double hit) {
        this.hit = hit;
        return this;
    }

    public int range() {
        return range;
    }

    public Weapon setRange(int range) {
        this.range = range;
        return this;
    }

    public int zen() {
        return cost;
    }

    public Weapon setCost(int cost) {
        this.cost = cost;
        return this;
    }
    /**
     * toString() Rueckgabe von den Attributen
     * @return String
     * Hier werden die Attribute von der Warrior Karte zuruek gegeben.
     */
    @Override
    public String toString() {
        return "Weapon{" + super.toString()+
                "level=" + level +
                ", hit=" + hit +
                ", range=" + range +
                ", cost=" + cost +
                '}';
    }
}
