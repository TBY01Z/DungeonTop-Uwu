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

    private static final ObservableList<PersonalityTypeCast> PERSONALITY_TYPE_CASTS = FXCollections.observableArrayList();
    public PersonalityTypeCasts(){

    }
    public static ObservableList<PersonalityTypeCast> getClassTypes() {
        return PERSONALITY_TYPE_CASTS;
    }

    public static void get(int i){
        PERSONALITY_TYPE_CASTS.get(i);
    }

    public static void add(PersonalityTypeCast personalityTypeCast){
        PERSONALITY_TYPE_CASTS.add(personalityTypeCast);

    }
}
