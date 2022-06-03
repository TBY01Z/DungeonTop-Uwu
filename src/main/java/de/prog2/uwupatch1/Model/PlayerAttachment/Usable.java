package de.prog2.uwupatch1.Model.PlayerAttachment;

import de.prog2.uwupatch1.Model.Icon.LoadIcons;
import javafx.scene.image.Image;

/**
 * @author Niclas Rieckers
 * Superklasse für alle vom Spieler nutzbare Items.
 * TODO: Check Grammatical
 */
public class Usable {
    private int ID;
    private String objName;
    private Image icon;


    public Usable(int ID, String objName, String iconPath) {
        this.ID = ID;
        this.objName = objName;
        icon = new Image(String.valueOf(LoadIcons.class.getResource(iconPath)));
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
