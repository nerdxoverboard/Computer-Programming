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
            Scanner firstNumber = new Scanner(System.in);
            System.out.print("Enter the First Number in Your Addition Problem_ ");
            double firstNum = firstNumber.nextDouble();
            Scanner secondNumber = new Scanner(System.in);
            System.out.print("Enter the Second Number in Your Addition Problem_ ");
            double secondNum = secondNumber.nextDouble();
            double solution = firstNum + secondNum;
            System.out.println(firstNum + " plus " + secondNum + " equals " + solution);
        }else if (menu == 2){
            Scanner firstNumber = new Scanner(System.in);
            System.out.print("Enter the First Number in Your Subtraction Problem_ ");
            double firstNum = firstNumber.nextDouble();
            Scanner secondNumber = new Scanner(System.in);
            System.out.print("Enter the Second Number in Your Subtraction Problem_ ");
            double secondNum = secondNumber.nextDouble();
            double solution = firstNum - secondNum;
            System.out.println(firstNum + " minus " + secondNum + " equals " + solution);
        }else if (menu == 3){
            Scanner firstNumber = new Scanner(System.in);
            System.out.print("Enter the First Number in Your Multiplication Problem_ ");
            double firstNum = firstNumber.nextDouble();
            Scanner secondNumber = new Scanner(System.in);
            System.out.print("Enter the Second Number in Your Multiplication Problem_ ");
            double secondNum = secondNumber.nextDouble();
            double solution = firstNum * secondNum;
            System.out.println(firstNum + " times " + secondNum + " equals " + solution);
        }else if (menu == 4){
            Scanner firstNumber = new Scanner(System.in);
            System.out.print("Enter the Total Number of Items You Wish to Divide_ ");
            double firstNum = firstNumber.nextDouble();
            Scanner secondNumber = new Scanner(System.in);
            System.out.print("Enter the Total Number of Groups You Wish the Items Divided Into_ ");
            double secondNum = secondNumber.nextDouble();
            double solution = firstNum / secondNum;
            System.out.println(firstNum + " divided by " + secondNum + " equals " + solution);
        }else{
            System.out.println("Invalid Selection Made.");
            System.out.println("Please Re-Run Program.");
            System.out.println("Make Valid Selection.");
        }
    }
}
