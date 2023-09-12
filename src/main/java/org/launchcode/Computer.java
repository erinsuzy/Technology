package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Computer {

    private boolean mouse = true;

    private String userName;

    private boolean portable = false;

    private boolean charger = false;


    public Computer (String aUserName) { userName = aUserName; }


    public boolean hasMouse() {
        return mouse;
    }

    public void setHasMouse(boolean aMouse) {
        this.mouse = aMouse;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String aUserName) {
        this.userName = aUserName;
    }

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean aPortable) {
        portable = aPortable;
    }

    public boolean hasCharger() {
        return charger;
    }

    public void setCharger(boolean charger) {
        this.charger = charger;
    }

    public String userInfo () {
        return (userName + " is signed in.");
    }


    public void accessories() {
        mouse = true;
        charger = false;
    }

    public String operatingSystem() { return ("Windows 11");}
}






