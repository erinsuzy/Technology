package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Computer {

    public ArrayList<String> programs;

    public String userName;

    public HashMap<String, String> files;




    public Computer (String aUserName) { userName = aUserName; }

    public ArrayList<String> getPrograms() {
        return programs;
    }
    public void setPrograms(ArrayList<String> programs) {
        this.programs = programs;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public HashMap<String, String> getFiles() {
        return files;
    }

    public void setFiles(HashMap<String, String> files) {
        this.files = files;
    }

    public String userInfo () {
        return (userName + " is signed in.");
    }

    public ArrayList<String> addProgram () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the program name: ");
        String newProgram;

        do {
            newProgram = input.nextLine();

            if (!newProgram.isEmpty()) ;
            {
                programs.add(newProgram);
            }
        } while (!newProgram.isEmpty());

        return programs;
    }
}

