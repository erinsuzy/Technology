package org.launchcode;

public class Laptop extends Computer {
    private String profileName;
    public Laptop(String aUserName) {
        super(aUserName);
    }

    public boolean isReady() { return isPortable() && hasCharger();}

    @Override
    public String operatingSystem() {
        return "Windows 10";
    }
}
