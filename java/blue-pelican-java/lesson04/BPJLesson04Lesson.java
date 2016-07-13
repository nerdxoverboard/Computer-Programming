//Program Name: Blue Pelican Java Lesson 04 (Lesson)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

public class BPJLesson04Lesson {
    public static void main(String args[]){
        // ***** ASSIGNING A VARIABLE AS A VALUE TO ANOTHER VARIABLE *****
        double p; // Declares variable "p" as a double accuracy with no initial value.
        double j = 47.2; // Declares variable "j" as a double accuracy with an initial value of 47.2.
        p = j; // Initializes the value of variable "p" as the value of variable "j".
        System.out.println(j + " = " + p);
        
        // ***** MULTIPLE DECLARATIONS *****
        double d, mud, puma; // Declares the variables "d", "mud", and "puma" as double accuracy with no initial value.
        double x = 31.2, m = 37.09, zu, p2 = 43.917; // Declares the variables "x", "m", and "p2" as double accuracy with the initial values of 31.2, 37.09, and 43.917 repsectively. Also, declares the variable "zu" as a doble accuracy with no initial value.
        System.out.println("x = " + x); // Outputs the value of variable "x".
        System.out.println("m = " + m); // Outputs the value of variable "m".
        System.out.println("p2 = " + p2); // Outputs the value of variable "p2".
        System.out.println("Variables d, mud, puma, and zu have not been initialized."); // Outputs a note concerning variables "d", "mud", "puma", and "zu".
        
        // ***** BASIC ARITHMATIC *****
        int addition = 5 + 10; // Declares the variable "addition" as an integer with the initial value to the solution of 5 + 10.
        System .out.println ("5 + 10 = " + addition); // Outputs the answer to the addition problem 5 + 10 using the variable "addition".
        
        int subtraction = 12 - 4; // Declares the variable "subtraction" as an integer with the initial value to the solution of 12 - 4.
        System.out.println("12 - 4 = " + subtraction); // Outputs the answer to the subtraction problem 12 - 4 using the variable "subtraction".
        
        int multiplication = 8 * 9; // Declares the variable "multiplication" as an integer with the initial value to the solution of 8 X 9.
        System.out.println("8 X 9 = " + multiplication); // Outputs the answer to the multiplication problem 8 X 9 using the variable "multipliction".
        
        int division = 59 / 3; // Declares the variable "division" as an integer with the initial value to the solution of 59 / 3.
        System.out.println("59 / 3 = " + division); // Outputs the answer to the division problem 59 / 3 using the variable "division".
        int divisionCheck1 = division * 3; // Declares the variable "divisionCheck1" as an integer with the initial value multiplying the value of the variable "division" times 3.
        int divisor = 59; // Declares the variable "divisor" as an integer with the initial value of 59.
        System.out.println("Does " + divisionCheck1 + " = " + divisor + "?"); // Asks if the standard division check = the divisor. In this case, it does not.
        
        int modulus = 59 % 3; // Declares the variable "modulus" as an integer with the initial value to the solution of 59 / 3.
        System.out.println("Remainder of 59 / 3 = " + modulus); // Outputs the answer remainder from the division problem 59 / 3 using the variable "modulus".
        
        System.out.println("59 / 3 = " + division + " with a remainder of " + modulus); // Outputs the complete answer with remainder to the division problem 59 / 3.
        int divisionCheck2 = division * 3 + modulus; // Declares the variable "divisionCheck2" as an integer with the initial value multiplying the variable "division" times 3 and then adding the variable "modulus". 
        System.out.println("Does " + divisionCheck1 + " + " + modulus + " = " + divisionCheck2 + " = " + divisor + "?"); // Asks if the standard division check = the divisor. In this case, it does.
        
        // ***** ADDING TO SELF *****
        int count = 0; // Declares the variable "count" as an integer with the initial value of 0.
        System.out.println("Variable count = " + count); // Outputs the value of the variable "count".
        count = count + 12; // Reinitializes the variable "count" with the new value of current value + 12. 
        System.out.println("Variable count = " + count); // Outputs the value of the variable "count".
        
        // ***** INCREMENT AND DECREMENT *****
        int count1 = 1; // Declares the variable "count1" as an integer with the initial value of 1.
        System.out.println("Variable count1 = " + count1); // Outputs the value of the variable "count1".
        int count2 = 2; // Declares the variable "count2" as an integer with the initial value of 2.
        System.out.println("Variable count2 = " + count2); // Outputs the value of the variable "count2".
        int count3 = 3; // Declares the variable "count3" as an integer with the initial value of 3.
        System.out.println("Variable count3 = " + count3); // Outputs the value of the variable "count3".
        int count4 = 4; // Declares the variable "count4" as an integer with the initial value of 4.
        System.out.println("Variable count4 = " + count4); // Outputs the value of the variable "count4".
        count1++; // Increments the value of the variable "count1" by 1.
        System.out.println("Variable count1 = " + count1); // Outputs the value of the variable "count1".
        count2--; // Decrements the value of the variable "count2" by 1.
        System.out.println("Variable count2 = " + count2); // Outputs the value of the variable "count2".
        ++count3; // Increments the value of the variable "count3" by 1.
        System.out.println("Variable count3 = " + count3); // Outputs the value of the variable "count3".
        --count4; // Decrements the value of the variable "count4" by 1.
        System.out.println("Variable count4 = " + count4); // Outputs the value of the variable "count4".
        
        // ***** COMPOUND OPERATORS *****
        int g = 409; // Declares the variable "g" as in ingeter with the initial value of 409.
        g += 5; // Assigns a new value to the variable "g" by adding 5 to the current value of the variable "g".
        System.out.println(g); // Outputs the value of the variable "g".
        
        double compound1 = 20.3; // Declares the variable "compound1" as a double with the initial value of 20.3.
        double compound2 = 10.0; // Declares the variable "compound2" as a double with the initial value of 10.0.
        compound2 *= compound1 - 1; // Assigns a new value to the variable "compound2" by multiplying the current value of variable "compound2" by "compound1" and then subtracting the variable "compound2" times 1.
        System.out.println(compound2); // Outputs the value of the variable "compound2".
        
        // ***** THE WHOLE TRUTH *****
        int y1 = 78; // Declares the variable y1 as an integer with the inital value of 78.
        System.out.println("Initial value of Variable Y = " + y1); // Outputs the value of the variable "y1".
        int z1 = 2 + y1++; // Declares the variable "z1" as an integer with the inital value as the solution to 2 + the value of the variable "y1" which is incremented AFTER the operation is completed. 
        System.out.println("Variable Y = " + y1 + " and Variable Z = " + z1); // Outputs the values of variables "y1" and z1".
        int y2 = 78; // Declares the variable y2 as an integer with the inital value of 78.
        System.out.println("Initial value of Variable Y = " + y2); // Outputs the value of the variable "y2".
        int z2 = 2 + ++y2; // Declares the variable "z2" as an integer with the initial value as the solution to 2 + the value of the variable "y2" which is incremented BEFORE the opration is started.
        System.out.println("Variable Y = " + y2 + " and Variable Z = " + z2); // Outputs the values of variables "y2" and z2".
    }
}
