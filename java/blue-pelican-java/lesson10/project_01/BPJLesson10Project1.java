//Program Name: Blue Pelican Java Lesson 10 (Project #1)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class BPJLesson10Project1
{
	public static void main (String[] args) throws java.lang.Exception
	{
        System.out.println("****************************");
        System.out.println("** Please Select Function **");
        System.out.println("****************************");
        System.out.println("** Add                    **");
        System.out.println("** Subtract               **");
        System.out.println("** Multiply               **");
        System.out.println("** Divide                 **");
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println("Your Choice?_");
 
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
 
        System.out.print("\nEnter First Operand._");
        double op3 = input.nextDouble();
        System.out.print("\nEnter Second Operand._");
        double op4 = input.nextDouble();
 
        System.out.println("");
 
        switch (choice){
            case "Add":
            case "add":
                System.out.println(op3 + " plus " + op4 + " = " + (op3 + op4));
                break;
            case "Subtract":
            case "subtract":
                System.out.println(op3 + " minus " + op4 + " = " + (op3 - op4));
                break;
            case "Multiply":
            case "multiply":
                System.out.println(op3 + " times " + op4 + " = " + (op3 * op4));
                break;
            case "Divide":
            case "divide":
                System.out.println(op3 + " divided by " + op4 + " = " + (op3 / op4));
                break;
            default:
                System.out.println("Please Check Your Selection Again");
        }
    }
}
