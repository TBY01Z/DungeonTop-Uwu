package de.prog2.uwupatch1.Model.Collectables;

import de.prog2.uwupatch1.Model.Items.PlayerAttachments.Artifact;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * @author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ Artifact
 * vor der Serialisierung.
 */
@SuppressWarnings("ALL")
public class Artifacts {
    private static ObservableList<Artifact> artifacts = FXCollections.observableArrayList();

    public Artifacts() {
    }

    /**
     * Getter Methode fuer eine ObservableList mit Objekten vom Typ Artifact
     * @return eine ObservableList mit den Artefakten
     */
    public static ObservableList<Artifact> artifacts() {
        return artifacts;
    }

    /**
     * Methode gibt ein spezifisches Objekt Artifact aus der ObservableList zurueck.
     * @param i Indexposition in der ObservableList der Artifact Objekte.
     * @return Artifact Objekt aus der Liste an spezifischer Indexposition.
     */
    public static Artifact get(int i){
        return Artifacts.artifacts().get(i);
    }

    /**
     * Setter Methode fuer die ObservableList der Artifact Objekte.
     * @param armors eine Liste mit Artifact Objekten
     */
    public static void setArtifacts(ObservableList<Artifact> artifacts) {
        Artifacts.artifacts = artifacts;
    }

    /**
     * Methode fuer das Hinzufuegen eines Artifact Objektes zu der ObservableList.
     * @param artifact Das Artifact, welches der Liste hinzugefuegt werden soll.
     */
    public static void add(Artifact artifact){
        artifacts.add(artifact);
    }
}
