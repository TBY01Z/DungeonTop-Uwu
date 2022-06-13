package de.prog2.uwupatch1.Model.Items.PlayerAttachments;

import de.prog2.uwupatch1.Model.Icon.LoadIcons;
import javafx.scene.image.Image;

import static de.prog2.uwupatch1.util.MyIO.loadIcon;

/**
 * @author Niclas Rieckers
 * Superklasse für alle vom Spieler nutzbare Items.
 */
public class Usable {
    /**
     * @info Mit diesem Parameter wird das Benutzbare Objekt gefunden.
     */
    private int ID;
    /**
     * @info Hier wird der Name des Benutbaren Objektes deklariert.
     */
    private String objName;
    /**
     * @info Hier wird das Icon deklariert, welches benoetigt wird um ein Bild anzeigen zu lassen.
     */
    private Image icon;
    //Constructor
    public Usable(int ID, String objName, String iconPath) {
        this.ID = ID;
        this.objName = objName;
        icon = loadIcon(iconPath);
    }
    //Getter & Setter
    public int ID() {
        return ID;
    }

    public Usable setID(int ID) {
        this.ID = ID;
        return this;
    }

    public String objName() {
        return objName;
    }

    public Usable setObjName(String objName) {
        this.objName = objName;
        return this;
    }

    public Image icon() {
        return icon;
    }

    public Usable setIcon(Image icon) {
        this.icon = icon;
        return this;
    }

    @Override
    public String toString() {
        return
                "ID=" + ID +
                ", objName='" + objName + '\'' +
                ", iconPath='" + icon().getUrl()+ "',"
                ;
    }
}
