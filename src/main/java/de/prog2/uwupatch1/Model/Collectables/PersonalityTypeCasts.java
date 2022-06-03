package de.prog2.uwupatch1.Model.Collectables;

import de.prog2.uwupatch1.Model.PlayerSelf.PersonalityTypeCast;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * @author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ PersonalityTypeCast
 * vor der Serialisierung.
 * TODO: Check Grammatical
 */
@SuppressWarnings("ALL")
public class PersonalityTypeCasts {

    private static ObservableList<PersonalityTypeCast> personalityTypeCasts = FXCollections.observableArrayList();

    public static PersonalityTypeCast get(int i){
        return personalityTypeCasts.get(i);
    }

    public static void add(PersonalityTypeCast personalityTypeCast){
        personalityTypeCasts.add(personalityTypeCast);
    }

    public static ObservableList<PersonalityTypeCast> personalityTypeCasts() {
        return personalityTypeCasts;
    }

    public static void setPersonalityTypeCasts(ObservableList<PersonalityTypeCast> personalityTypeCasts) {
        PersonalityTypeCasts.personalityTypeCasts = personalityTypeCasts;
    }
}
