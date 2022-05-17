package com.prog2.uwupatch1.Model.Database;

import com.prog2.uwupatch1.Model.PlayerAttachment.Artifact;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
/**
 * @author Niclas Rieckers
 * Klasse für das zwischenspeichern der Objekte vom Typ Artifact
 * vor der Serialisierung.
 */
public class Artifacts {
    private static ObservableList<Artifact> artifacts = FXCollections.observableArrayList();

    public Artifacts() {
    }

    public static ObservableList<Artifact> artifacts() {
        return artifacts;
    }

    public static Artifact get(int i){
        return Artifacts.artifacts().get(i);
    }

    public static Artifacts setArtifacts(ObservableList<Artifact> artifacts) {
        Artifacts.artifacts = artifacts;
        return null;
    }
    public static Artifacts add(Artifact artifact){
        artifacts.add(artifact);
        return null;
    }
}
