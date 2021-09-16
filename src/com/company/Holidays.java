package com.company;

public class Holidays {
    public String nameOfHoliday;
    public int dateOfHoliday;
    public String celebrateHow;


    //Constructors
    public Holidays(String nameOfHoliday, int dateOfHoliday, String celebrateHow) {
        this.nameOfHoliday = nameOfHoliday;
        this.dateOfHoliday = dateOfHoliday;
        this.celebrateHow = celebrateHow;
    }

    public String toString() {
        return nameOfHoliday + " on the " + dateOfHoliday + " means " + celebrateHow + " !!";

        if (celebrateHow == "Presents") {
            System.out.println("Santa is coming!");
        } else {
                System.out.println("Santa will be here soon!");
            }
        }
    }




