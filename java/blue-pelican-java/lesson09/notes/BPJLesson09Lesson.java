//Program Name: Blue Pelican Java Lesson 09 (Lesson)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class BPJLesson09Lesson
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // ***** IF - THEN STATEMENTS *****
        Scanner gradeInput = new Scanner(System.in); // Creates a new scanner object attached to the declared variable "gradeInput1". The initial value of the variable "gradeInput1" will be input from the keyboard.
        System.out.print("What is your grade? _"); // Outputs instruction for the user to enter a value for the variable "gradeInput1".
        int myGrade1 = gradeInput.nextInt(); // Declares the variable "myGrade1" as an integer with an initial value of the next integer that was entered using the nextInt method of the Scanner class.
 
        if (myGrade1 >= 70){ // Establishes the first conditional statement of an if/then statement. If "myGrade1" is greater than or equal to 70, the statement is true.
            System.out.println("Congratulations, you passed"); // Outputs the statement "Congratulations, you passed". Is only run if the above condition is met (true).
        } // Ends the action executed by the first conditional statement.
        else{ // Establishes the "default" option if none of the prior conditional statements can be satisfied.
            System.out.println("Better Luck Next Time"); // Outputs the statement, "Better Luck Next Time". It is only run if none of the above conditional statements are met (true).
        } // Ends the action executed by the final conditional statement.
 
        // ***** IF - THEN - ELSE STATEMENTS *****
        System.out.print("What is your grade? _"); // Outputs instruction for the user to enter a value for the variable "gradeInput2".
        int myGrade2 = gradeInput.nextInt(); // Declares the variable "myGrade2" as an integer with an initial value of the next integer that was entered using the nextInt method of the Scanner class.
 
        if (myGrade2 >= 90){ // Establishes the first conditional statement of an if/then/else statement. If "myGrade2" is greater than or equal to 90, the statement is true.
            System.out.println("You made an A"); // Outputs the statement, "You made an A". It is only run if the first conditional statement is true.
        }else if (myGrade2 >= 80){ // Establishes the second conditional statement of an if/then/else statement. If "myGrade2" is greater than or equal to 80, the statement is true.
            System.out.println("You made a B"); // Outputs the statement, "You made a B". It is only run if the second conditional statement is true.
        }else if (myGrade2 >=70){ // Establishes the third conditional statement of an if/then/else statement. If "myGrade2" is greater than or equal to 70, the statement is true.
            System.out.println("You made a C"); // Outputs the statement, "You made a C". It is only run if the third conditional statement is true.
        }else if (myGrade2 >=60){ // Establishes the fourth conditional statement of an if/then/else statement. If "myGrade2" is greater than or equal to 60, the statement is true.
            System.out.println("You made a D"); // Outputs the statement, "You made a D". It is only run if the fourth conditional statement is true.
        }else{ // Establishes the "default" options if none of the prior conditional statements can be satisfied.
            System.out.println("Sorry, you failed."); // Outputs the statement, "Sorry, you failed.". It is only run if none of the above conditional statements are met (true).
        }
    }
}
