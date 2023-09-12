package org.launchcode;
import org.launchcode.Computer;
import org.launchcode.Laptop;
import org.launchcode.Smartphone;

import java.util.ArrayList;
import java.util.Scanner;

public class Tech {

    public static void main (String[] args){
        Computer erinGaming = new Computer("Erin");
        Smartphone galaxy = new Smartphone("moozie", 1234);
        Laptop lenovo = new Laptop("Schneider");

        Smartphone.isCharged();
        System.out.println(Smartphone.isCharged());





    }
}
