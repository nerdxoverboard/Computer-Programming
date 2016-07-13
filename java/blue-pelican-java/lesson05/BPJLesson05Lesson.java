//Program Name: Blue Pelican Java Lesson 05 (Lesson)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

public class BPJLesson05Lesson {
    public static void main(String args[]){
        // ***** CASTING VARIABLES *****
        double d1 = 29.78; // Declares the variable "d1" as a double with the initial value of 29.78.
        System.out.println("Variable D1 has a value of " + d1); // Outputs the value of variable "d1".
        int i1 = (int)d1; // Declares the variable "i1" as an integer with the initial value of the integer component of the variable "d".
        System.out.println("Variable I1 has a value of " + i1); // Outputs the value of variable "i1". Note that the .78 has been lost in the conversion to an integer.
        
        // ***** MOST PRECISE CALCULATIONS *****
        int i2 = 4; // Declares the variable "i2" as an integer with the initial value of 4.
        int d2 = 3; // Declares the variable "d2" as an integer with the initial value of 3.
        int answer2 = i2/d2; // Declares the variable "answer2" as an integer with the initial value of the variable "i2" devided by the value of variable "d2".
        System.out.println("Dividend, Divisor, and Quotient as integers = " + answer2);
        
        double i3 = 4; // Declares the variable "i3" as a double with the initial value of 4.
        double d3 = 3; // Declares the variable "d3" as a double with the initial value of 3.
        double answer3 = i3/d3; // Declares the variable "answer3" as an integer with the initial value of the variable "i3" devided by the value of variable "d3".
        System.out.println("Dividend, Divisor, and Quotient as doubles = " + answer3);
        
        int i4 = 4; // Declares the variable "i4" as an integer with the initial value of 4.
        double d4 = 3; // Declares the variable "d4" as a double with the initial value of 3.
        double answer4 = i4/d4; // Declares the variable "answer4" as an integer with the initial value of the variable "i4" devided by the value of variable "d4".
        System.out.println("Dividend and Quotient as doubles and Divisor as integer = " + answer4);
        
        int i5 = 4; // Declares the variable "i5" as an integer with the initial value of 4.
        int d5 = 3; // Declares the variable "d5" as an integer with the initial value of 3.
        double answer5 = i4/d4; // Declares the variable "answer5" as an integer with the initial value of the variable "i5" devided by the value of variable "d5".
        System.out.println("Dividend and Divisor as integers and Quotient as double = " + answer5);
        
        // ***** SOME CHALLENGING EXAMPLES *****
        double ex1 = 3 + 5.0 / 2 + 5 * 2 - 3; // Declares the variable "ex1" as a double with the initial value of the given problem outlined below.
        System.out.println("As a floating point / double-precision variable 3 + 5.0 / 2 + 5 * 2 - 3 = " + ex1); // Outputs the value of variable "ex1".
        //Using PEMDAS our operation is as follows:
        //1. ex1 = 3 + 5.0 / 2 + 5 * 2 - 3
        //2. ex1 = 3 + 5.0 / 2 + 10 - 3
        //3. ex1 = 3 + 2.5 + 10 - 3
        //4. ex1 = 15.5 - 3
        //5. ex1 = 12.5
        
        int ex2 = 3 + 5 / 2 + 5 * 2 - 3; // Declares the variable "ex2" as an integer with the initial value of the given problem outlined below.
        System.out.println("As an integer variable 3 + 5 / 2 + 5 * 2 - 3 = " + ex2); // Outputs the value of the variable "ex2".
        //Using PEMDAS our operation is as follows:
        //1. ex1 = 3 + 5 / 2 + 5 * 2 - 3
        //2. ex1 = 3 + 5 / 2 + 10 - 3
        //3. ex1 = 3 + 2 + 10 - 3
        //4. ex1 = 15 - 3
        //5. ex1 = 12
        
        double ex3 = (int)(3.0 + 4)/(1 + 4.0) * 2 - 3; // Declares the variable "ex3" as a double with the initial value of the given problem outlined below.
        System.out.println(ex3); // Outputs the value of the variable "ex3".
        // Using PEMDAS out operation is as follows:
        // 1. ex3 = (3.0 + 4)/(1 + 4.0) * 2 - 3
        // 2. ex3 = (7.0)/(5.0) * 2 - 3
        // 3. ex3 = 1.4 * 2 - 3
        // 4. ex3 = 2.8 - 3
        // 5. ex3 = -.2
        
        // ***** DON'T BE FOOLED *****
        double ex4a = (double)5/4; // Declares the variable "ex4a" as a double with the initial value of 5/4 with the 5 cast as a double.
        System.out.println("5 (cast as a double) / 4 = " + ex4a); // Outputs the value of the variable "ex4a".
        double ex4b = (double)5/4; // Declares the variable "ex4b" as a double with the initial value of 5.0/4.
        System.out.println("5.0 / 4 = " + ex4b); // Outputs the value of the variable "ex4b".
        double ex4c = 5/4; // Declares the variable "ex4c" as a double with the initial value of 5/4.
        System.out.println("5 / 4 = " + ex4c); // Outputs the value of the variable "ex4c".
        
        // ***** CONSTANTS *****
        final double PI = 3.14159265358979323846; // Declares a constant variable "PI" with the initial value of 3.14159265358979323846.
        System.out.println("Constant Variable PI = " + PI); // Outputs the value of the variable "PI".
    }
}
