package org.launchcode;

public class Smartphone extends Computer  {

    private double passcode;


    public Smartphone(String aUserName, double passcode) {
        super(aUserName);
        passcode = 1234;
    }

   public static boolean isCharged() {return hasCharger();}

    @Override
    public String operatingSystem() {
        return "Android";
    }
}
