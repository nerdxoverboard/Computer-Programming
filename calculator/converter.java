//Program Name: Number Converter
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.util.*;
import java.lang.*;
import java.io.*;

public class converver{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner menuChoice = new Scanner(System.in);
        System.out.println("Number Converter");
        System.out.println("");
        System.out.println("Which number system are you converting from?");
        System.out.println("1 - Decimal - Base 10");
        System.out.println("2 - Binary - Base 2");
        System.out.println("3 - Octal - Base 8");
        System.out.println("4 - Hexadecimal - Base 16");
        System.out.println("");
        System.out.print("Enter Your Selection_");
        int menu = menuChoice.nextInt();
        
        switch (menu) {
            case 1:
                {
                    Scanner myNumber = new Scanner(System.in);
                    System.out.println("Enter Your Decimal - Base 10 Number_ ");
                    int myDecimalNumber = myNumber.nextInt();
                    String myDecimalNumberBin = (Integer.toString(myDecimalNumber, 2));
                    String myDecimalNumberOct = (Integer.toString(myDecimalNumber, 8));
                    String myDecimalNumberHex = (Integer.toString(myDecimalNumber, 16));
                    System.out.println("The Decimal Number " + myDecimalNumber " is equal to the following:");
                    System.out.println("");
                    System.out.println("Binary - Base 2 = " + myDecimalNumberBin);
                    System.out.println("Octal - Base 8 = " + myDecimalNumberOct);
                    System.out.println("Hexadecimal - Base 16 = " + myDecimalNumberHex);
                    break;
                }
            case 2:
                {
                    //Code for Menu Option 2
                    break;
                }
            case 3:
                {
                    //Code for Menu Option 3
                    break;
                }
            case 4:
                {
                    //Code for Menu Option 4
                    break;
                }
            default:
                System.out.println("Invalid Selection");
                break;
        }
    }
}
