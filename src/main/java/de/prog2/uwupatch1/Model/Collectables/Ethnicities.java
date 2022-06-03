package de.prog2.uwupatch1.Model.Collectables;

import de.prog2.uwupatch1.Model.PlayerSelf.Ethnicity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * @author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ StartDeck.txt
 * vor der Serialisierung.
 * TODO: Check Grammatical
 */
@SuppressWarnings("ALL")
public class Ethnicities {
    private static ObservableList<Ethnicity> ethnicities = FXCollections.observableArrayList();

    public static void add(Ethnicity ethnicity){
        ethnicities().add(ethnicity);
    }

    public static Ethnicity get(int i){
        return ethnicities().get(i);
    }

    public static ObservableList<Ethnicity> ethnicities() {
        return ethnicities;
    }

    public static void setEthnicities(ObservableList<Ethnicity> ethnicities) {
        Ethnicities.ethnicities = ethnicities;
    }
}
