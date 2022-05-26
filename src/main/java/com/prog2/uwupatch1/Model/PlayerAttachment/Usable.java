package com.prog2.uwupatch1.Model.PlayerAttachment;

/**
 * @author Niclas Rieckers
 * Superklasse für alle vom Spieler nutzbare Items.
 * TODO: Check Grammatical
 */
public class Usable {
    private int ID;
    private String objName;
    private String iconPath;


    public Usable(int ID, String objName, String iconPath) {
        this.ID = ID;
        this.objName = objName;
        this.iconPath = iconPath;
    }

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

    public String iconPath() {
        return iconPath;
    }

    public Usable setIconPath(String iconPath) {
        this.iconPath = iconPath;
        return this;
    }

    @Override
    public String toString() {
        return
                "ID=" + ID +
                ", objName='" + objName + '\'' +
                ", iconPath='" + iconPath + "',"
                ;
    }
}
