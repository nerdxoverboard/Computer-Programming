//Program Name: Blue Pelican Java Lesson 07 (Lesson)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.util.*;
import java.lang.*;
import java.io.*;

public class BPJLesson07Lesson
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // ***** INPUTTING AN INTEGER *****
        Scanner input = new Scanner(System.in); // Creates a new scanner object attached to the declared variable "inputInteger". The initial value of the variable "inputInteger" will be input from the keyboard.
        System.out.print("Enter Your Integer Here: "); // Outputs instruction for the user to enter a value for the variable "inputInteger".
        int i = input.nextInt(); // Declares the variable "i" as an integer with an initial value of the next integer that was entered using the nextInt method of the Scanner class.
        System.out.println(3 * i); // Outputs the variable "i" multiplied by 3.
        // ***** INPUTTING A DOUBLE *****
        System.out.print("Enter Your Floating Point (Decimal) Number Here: "); // Outputs instruction for the user to enter the value of the variable "inputDouble".
        double d = input.nextDouble(); // Declares the variable "d" as an integer with an initial value of the next integer that was entered using the nextDouble method of the Scanner class.
        System.out.println(3 * d); // Outputs the variable "d" multiplied by 3.
        // ***** INPUTTING A STRING ONE WORD AT A TIME *****
        System.out.print("Enter Your Two-Word String of Text Here: "); // Outputs instruction for the user to enter the value of the variable "inputString".
        String s = input.next(); // Declares the variable "s" as a string with an initial value of next string up to the space that was entered using the nextString method of the Scanner class.
        System.out.println("This is the first part of the string - " + s); // Outputs the current value of variable "s".
        s = input.next(); // Redefines the variable "s" as the next string up to the next space using the nextString method of the Scanner class.
        System.out.println("This is the second part of the string - " + s); // Outputs the current value of variable "s".
        // ***** MULTIPLE INTEGER INPUTS *****
        System.out.print("Enter 5 Different Integers Separated by a Space: "); // Outputs instruction for the user to enter the values to be assigned to the variable "inputIntegers".
        int li = input.nextInt(); // Declares the variable "li" as an integer with an initial value of the next integer up to the space that was entered using the nextInt method of the Scanner class. 
        System.out.println("First Integer = " + li); // Outputs the current value of the variable "li".
        li = input.nextInt(); // Redefines the variable "li" as the next integer up to the next space using the nextInt method of the Scanner class.
        System.out.println("Second Integer = " + li); // Outputs the current value of the variable "li".
        li = input.nextInt(); // Redefines the variable "li" as the next integer up to the next space using the nextInt method of the Scanner class.
        System.out.println("Third Integer = " + li); // Outputs the current value of the variable "li".
        li = input.nextInt(); // Redefines the variable "li" as the next integer up to the next space using the nextInt method of the Scanner class.
        System.out.println("Fourth Integer = " + li); // Outputs the current value of the variable "li".
        li = input.nextInt(); // Redefines the variable "li" as the next integer up to the next space using the nextInt method of the Scanner class.
        System.out.println("Fifth Integer = " + li); // Outputs the current value of the variable "li".
        // ***** INPUTTING A STRING ONE LINE AT A TIME *****
        System.out.print("Enter Your String of Text Here: "); // Outputs instruction for the user to enter the value of the variable "inputStringLine".
        input.nextLine();
        String stringLine = input.nextLine(); // Declares the variable "stringLine" as a string with an initial value of the next line up to the line break using the nextLine method of the Scanner class.
        System.out.println("Your Line of Text Was: " + stringLine); // Outputs the value of the variable "stringLine".
    }
}
