//Program Name: 4-Function Calculator
//Programmer Name: Your Name
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.util.*;
import java.lang.*;
import java.io.*;

public class calculator{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner menuChoice = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("");
        System.out.print("Enter Your Selection_");
        int menu = menuChoice.nextInt();
        
        if (menu == 1){
            //Code for Menu Option 1
        }else if (menu == 2){
            //Code for Menu Option 2
        }else if (menu == 3){
            //Code for Menu Option 3
        }else if (menu == 4){
            //Code for Menu Option 4
        }else{
           //Code if Other Integer Option is Selected
        }
    }
}
