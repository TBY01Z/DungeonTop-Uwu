package de.prog2.uwupatch1.Model.PlayerSelf;


import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Deck;
import javafx.scene.image.Image;

import static de.prog2.uwupatch1.util.MyIO.loadIcon;

public class Ethnicity {
    private String ethnicityName;
    private String ethnicitySpecification;
    private Image icon;
    private Deck ethnicityDeck;

    public Ethnicity(String ethnicityName, String ethnicitySpecification, String icon, Deck ethnicityDeck) {
        this.ethnicityName = ethnicityName;
        this.ethnicitySpecification = ethnicitySpecification;
        this.icon = loadIcon(icon);
        this.ethnicityDeck = ethnicityDeck;
    }

    public String ethnicityName() {
        return ethnicityName;
    }

    public Ethnicity setEthnicityName(String ethnicityName) {
        this.ethnicityName = ethnicityName;
        return this;
    }

    public String ethnicitySpecification() {
        return ethnicitySpecification;
    }

    public Ethnicity setEthnicitySpecification(String ethnicitySpecification) {
        this.ethnicitySpecification = ethnicitySpecification;
        return this;
    }

    public Image icon() {
        return icon;
    }

    public Ethnicity setIcon(Image icon) {
        this.icon = icon;
        return this;
    }

    public Deck ethnicityDeck() {
        return ethnicityDeck;
    }

    public Ethnicity setEthnicityDeck(Deck ethnicityDeck) {
        this.ethnicityDeck = ethnicityDeck;
        return this;
    }
}
