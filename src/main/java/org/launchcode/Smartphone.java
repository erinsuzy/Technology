package org.launchcode;

public class Smartphone extends Computer  {

    private double passcode;


    public Smartphone(String aUserName) {
        super(aUserName);
    }

    @Override
    public String operatingSystem() {
        return "Android";
    }
}
