package com.company;

import java.util.Scanner;

public class Holidays {
    Scanner scanner = new Scanner(System.in);
    public String nameOfHoliday;
    public int dateOfHoliday;
    public String celebrateHow;
    public String isItTime;
    public String printHolidays;

//    public Holidays(String nameOfHoliday, int dateOfHoliday, String celebrateHow, String isItTime) {
//        this.dateOfHoliday = dateOfHoliday;
//        this.nameOfHoliday = nameOfHoliday;
//        this.celebrateHow = celebrateHow;
//        this.isItTime = isItTime;
//        return ;
//    }

    public Holidays(String nameOfHoliday, int dateOfHoliday, String celebrateHow) {
        this.nameOfHoliday = nameOfHoliday;
        this.dateOfHoliday = dateOfHoliday;
        this.celebrateHow = celebrateHow;
        ;

    }


    public String toString() {
        String H = nameOfHoliday + " on the " + dateOfHoliday + " means " + celebrateHow + " !!";
        return H;
    }
//Tried this to return just one holiday message. I cant figure out what Im doing wrong on it.
// Plan was to ask the user what theyre anticipating (presents, trick or treating, or candy/flowers) and then have
// it say whether it was close to Christmas time or not.
    public String printHolidays(String isItTime) {
        switch ("Christmas") {
            case "Presents":
                isItTime = "Santa was here!";
                break;
            case "Trick or treating":
                isItTime = "Its almost time to pick out our tree!";
                break;
            case "Flowers and chocolates":
                isItTime = "No, Christmas is over. Its almost spring!";
                break;
            default:
                isItTime = "Im not sure- lets check the calendar";
                break;

        }
        System.out.println("What are you looking forward to?");
        String printHolidays = scanner.nextLine();
        return isItTime;
    }
}







