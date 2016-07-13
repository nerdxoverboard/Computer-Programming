//Program Name: Blue Pelican Java Lesson 10 (Lesson)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class BPJLesson10Lesson
{
	public static void main (String[] args) throws java.lang.Exception
	{
        System.out.println("     1.  Addition"); // Outputs first line of user menu.
        System.out.println("     2.  Subtraction"); // Outputs second line of user menu.
        System.out.println("     3.  Multiplication"); // Outputs third line of user menu.
        System.out.println("     4.  Division\n"); // Outputs fourth line of user menu.
 
        System.out.println("     Your Choice:_"); // Outputs instruction for user to enter their selection from the menu.
 
        Scanner input1 = new Scanner(System.in); // Creates a new scanner item attached to the new declared variable "menuInput". The variable "menuInput" will receive its initial value from a keyboard input.
        int choice = input1.nextInt(); // Declares variable "choice" as an integer with an initial value of the first integer input for the scanner item "menuInput".
 
        System.out.print("\nEnter First Operand._"); // Outputs instruction for user to enter the first operand in the math problem.
        double op1 = input1.nextDouble(); // Declares variable "op1" as a double with an initial value of the second integer input for the scanner item "menuInput".
        System.out.print("\nEnter Second Operand._"); // Outputs instruction for user to enter the second operand in the math problem.
        double op2 = input1.nextDouble(); // Declares variable "op2" as a double with an intial value of the third integer input for the scanner item "menuInput".
 
        System.out.println(""); // Outputs a blank line.
 
        switch (choice){ // Opens the switch statements to be run for the value of the variable "choice".
            case 1: // Start of case for variable "choice" value of 1.
                System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2)); // Outputs variables "op1" and "op2" as an addition problem.
                break; // End of case for variable "choice" value of 1.
            case 2: // Start of case for variable "choice" value of 2.
                System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2)); // Outputs variables "op1" and "op2" as a subtraction problem.
                break; // End of case for variable "choice" value of 2.
            case 3: // Start of case for variable "choice" value of 3.
                System.out.println(op1 + " times " + op2 + " = " + (op1 * op2)); // Outputs variables "op1" and "op2" as a multiplication problem.
                break; // End of case for variable "choice" value of 3.
            case 4: // Start of case for variable "choice" value of 4.
                System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2)); // Outputs variables "op1" and "op2" as a division problem.
                break; // End of case for variable "choice" value of 4.
            default: // Start of case for variable "choice" value other than 1, 2, 3, or 4.
                System.out.println("Hey dummy, enter only 1, 2, 3, or 4!"); // Outputs error message to user concerning invalid menu selection.
        }
    // ***** OMITTING BREAK STATEMENTS ON PURPOSE *****
        System.out.print("Enter a Number Between 1 and 7_");
        int choice2 = input1.nextInt();
 
        System.out.println("");
 
        switch (choice2){
            case 1:
            case 2:
            case 3:
                System.out.println("Low");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("High");
                break;
            case 7:
                System.out.println("Lucky");
            default:
                System.out.println("Please Select a Number Between 1 and 7 Only");
        }
        // ***** CHARACTER SWITCHES *****
        System.out.println("     A.  Addition");
        System.out.println("     S.  Subtraction");
        System.out.println("     M.  Multiplication");
        System.out.println("     D.  Division\n");
 
        System.out.println("     Your Choice (A, S, M, or D:_");
 
        //Scanner menuInput2 = new Scanner(System.in);
        String choice3 = input1.next();
        char ch = choice3.charAt(0);
 
        System.out.print("\nEnter First Operand._");
        double op3 = input1.nextDouble();
        System.out.print("\nEnter Second Operand._");
        double op4 = input1.nextDouble();
 
        System.out.println("");
 
        switch (ch){
            case 'A':
            case 'a':
                System.out.println(op3 + " plus " + op4 + " = " + (op3 + op4));
                break;
            case 'S':
            case 's':
                System.out.println(op3 + " minus " + op4 + " = " + (op3 - op4));
                break;
            case 'M':
            case 'm':
                System.out.println(op3 + " times " + op4 + " = " + (op3 * op4));
                break;
            case 'D':
            case 'd':
                System.out.println(op3 + " divided by " + op4 + " = " + (op3 / op4));
                break;
            default:
                System.out.println("Hey dummy, enter only A, S, M, or D!");
        }
    // ***** STRING SWITCHES *****
        System.out.println("Enter some greeting (e.g. Hello, Good Bye, Gracias, etc...");
 
        input1.nextLine(); // Forces consuption of end of line for some IDE's.
        String greeting = input1.nextLine();
 
        switch (greeting){
            case "Good Bye":
                System.out.println("You Said Good Bye");
                break;
            case "Hello":
                System.out.println("You Said Hello");
                break;
            case "Auf wiedersehen":
                System.out.println("You Spoke in German!");
                break;
            default:
                System.out.println("What Did You Say?");
        }
    }
}
