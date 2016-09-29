//Program Name: Skipping Breaks
//Programmer Name: Your Name
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.util.*;
import java.lang.*;
import java.io.*;

public class breaks{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner menuChoice = new Scanner(System.in);
        System.out.println("Letter Generator");
        System.out.println("1 - Option 1");
        System.out.println("2 - Option 2");
        System.out.println("3 - Option 3");
        System.out.println("4 - Option 4");
        System.out.println("5 - Option 5");
        System.out.println("");
        System.out.print("Which Group of Letters Do You Want? ");
        int menu = menuChoice.nextInt();
        
        switch (menu) {
            case 1:
                {
                    System.out.print(" A ");
                    System.out.print(" B ");
                    System.out.print(" C ");
                    System.out.print(" D ");
                    System.out.print(" E ");
                    break;
                }
            case 2:
                {
                    System.out.print(" F ");
                    System.out.print(" G ");
                    System.out.print(" H ");
                }
            case 3:
                {
                    System.out.print(" I ");
                    System.out.print(" J ");
                    System.out.print(" K ");
                    System.out.print(" L ");
                    System.out.print(" M ");
                    break;
                }
            case 4:
                {
                    System.out.print(" N ");
                }
            case 5:
                {
                    System.out.print(" O ");
                    System.out.print(" P ");
                    System.out.print(" Q ");
                    System.out.print(" R ");
                    System.out.print(" S ");
                    break;
                }
            default:
                System.out.print(" T ");
                System.out.print(" U ");
                System.out.print(" V ");
                System.out.print(" W ");
                System.out.print(" X ");
                System.out.print(" Y ");
                System.out.print(" Z ");
                break;
        }
    }
}
