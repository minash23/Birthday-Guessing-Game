/*
*Mina
*08/29/22
*CSC 1120
*Birthday Guessing Game
* */

//dependent library
import java.util.Scanner;

public class Bday {
    //main method
    public static void main (String arg[]){

        //creating scanner to access user input
        Scanner scan = new Scanner(System.in);

        //creating variables
        String value;
        int total = 0;


        //present the card 0
        System.out.println("Card 0: " + "\n" + "1 3 5 7" + "\n" + "9 11 13 15" + "\n" + "17 19 21 23" + "\n" + "25 27 29 31");
        //asking user if birthday is in card and getting user input
        System.out.println("If your birthday is in this card, enter yes, if not enter no.");
        value = scan.next();
        System.out.println("User input: " + value);
        //if user input is yes, add to birthday total
        if(value.equals("yes")) {
            total = total + 1;
        }


        //present the card 1
        System.out.println("Card 1: " + "\n" + "2 3 6 7" + "\n" + "10 11 14 15" + "\n" + "18 19 22 23" + "\n" + "26 27 30 31");
        //asking user if birthday is in card and getting user input
        System.out.println("If your birthday is in this card, enter yes, if not enter no.");
        value = scan.next();
        System.out.println("User input: " + value);
        //if user input is yes, add to birthday total
        if(value.equals("yes")) {
            total = total + 2;
        }

        //present the card 2
        System.out.println ("Card 2: " + "\n" + "4 5 6 7" + "\n" + "12 13 14 15" + "\n" + "20 21 22 23" + "\n" + "28 29 30 31");
        //asking user if birthday is in card and getting user input
        System.out.println("If your birthday is in this card, enter yes, if not enter no.");
        value = scan.next();
        System.out.println("User input: " + value);
        //if user input is yes, add to birthday total
        if(value.equals("yes")) {
            total = total + 4;
        }

        //present the card 3
        System.out.println ("Card 3: " + "\n" + "8 9 10 11" + "\n" + "12 13 14 15" + "\n" + "24 25 26 27" + "\n" + "28 29 30 31");
        //asking user if birthday is in card and getting user input
        System.out.println("If your birthday is in this card, enter yes, if not enter no.");
        value = scan.next();
        System.out.println("User input: " + value);
        //if user input is yes, add to birthday total
        if(value.equals("yes")) {
            total = total + 8;
        }

        //present the card 4
        System.out.println ("Card 4: " + "\n" + "16 17 18 19" + "\n" + "20 21 22 23" + "\n" + "24 25 26 27" + "\n" + "28 29 30 31");
        //asking user if birthday is in card and getting user input
        System.out.println("If your birthday is in this card, enter yes, if not enter no.");
        value = scan.next();
        System.out.println("User input: " + value);
        //if user input is yes, add to birthday total
        if(value.equals("yes")) {
            total = total + 16;
        }
        System.out.println("Your Birthday is: " + total);
    }
}

