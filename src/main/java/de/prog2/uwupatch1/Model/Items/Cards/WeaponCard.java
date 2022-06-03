package de.prog2.uwupatch1.Model.Items.Cards;

/**
 * @author Niclas Rieckers
 * Diese Klasse stellt eine Karte dar, die im Kampf fuer beide Charaktere spielbar sind. Somit kann diese Karte anderen
 * Spielern sowie den von dennen Beschworenen Karten Schaden hinzufuegen.
 */
public class WeaponCard extends Card {
    //Diese Variable stellt den Damage dar der von dieser Karte beim Beschwoeren einem anderem Spieler oder
    //einer anderen Karte hinzugefuegt wird.
    private double cardDamage;
    //Diese Variable wird verwendet um den Schadenszuwachs pro Level zu darzustellen.
    private final double CARD_DAMAGE_VALUE_PER_LEVEL = 0.25;

    /**
     * Hier wird das Objekt zu WeaponCard erstellt.
     * @param ID
     * Verwendet um das Objekt spaeter aufzurufen.
     * @param objName
     * Verwendet um spaeter den Namen des Objektes zu erhalten.
     * @param iconPath
     * Verwendet zur Angabe des Path zum Icon des Objektes.
     * @param summonCost
     * Verwendet als Angabe wie viel Mana beim Beschwoeren der Karte benoetigt wird.
     * @param level
     * Verwendet um dieser Karte ein Level zu geben welches Benoetigt wird um spaeter den Damage Prozentual zu steigern.
     * @param cardDamage
     * Verwendet als Grund Damage den diese Karte zufuegt.
     */
    public WeaponCard(int ID, String objName, String iconPath, int summonCost, int level,double cardDamage) {
        super(ID, objName, iconPath, summonCost, level);
        this.cardDamage = cardDamage;
    }

    /**
     * Diese Methode gibt den Damage an den
     * @return double
     */
    public double cardDamage() {
        return cardDamage+((cardDamage*CARD_DAMAGE_VALUE_PER_LEVEL)*level());
    }

    public WeaponCard setCardDamage(double cardDamage) {
        this.cardDamage = cardDamage;
        return this;
    }
}
