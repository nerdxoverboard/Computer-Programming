//Program Name: Blue Pelican Java Lesson 06 (Lesson)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

public class BPJLesson06Lesson {
    public static void main(String args[]){
        // ***** ABSOLUTE VALUE CALCULATIONS *****
        double a1 = -379.22; // Declares the variable "a1" as a double with the initial value of -379.22.
        double a2 = Math.abs(a1); // Declares the variable "a2" as a double with the initial value of the absolute value of variable "a1" using the abs method of the math class.
        System.out.println("The Absolute Value of " + a1 + " is " + a2); // Outputs the values of variables "a1" and "a2".
        // ***** EXPONENTIAL CALCULATIONS *****
        double b = 42.01; // Declares the variable "b" as a double with the initial value of 42.01.
        double c = 3.728; // Declares the variable "c" as a double with the initial value of 3.728.
        double d = Math.pow(b,c); // Declares the variable "d" as a double with the initial value of the variable "b" rasied the power of variable "c" using the pow method of the math class.
        System.out.println(b + " raised to the " + c + " power is " + d); // Outputs the values of variables "b", "c", and "d".
        // ***** SQUARE ROOT CALCULATIONS *****
        double e1 = 2034.56; // Declares the variable "e1" as a double with the initial value of 2034.56.
        double e2 = Math.sqrt(e1); // Declares the variable "e2" as a double with the initial value of the square root of variable "e1" using the sqrt method of the math class.
        System.out.println("The Square Root of " + e1 + " is " + e2); // Outputs the values of variables "e1" and "e2".
        // ***** FLOOR & CEILING CALCULATIONS *****
        double f1 = 1.4; // Declares the variable "f1" as a double with the initial value of 1.4.
        double f2 = Math.ceil(f1); // Declares the variable "f2" as a double with the initial value of the ceiling of variable "f1" using the ceil method of the math class.
        System.out.println("The ceiling of " + f1 + " is " + f2); // Outputs the values of variables "f1" and "f2".
        double g1 = -1.6; // Declares the variable "g1" as a double with the initial value of -1.6.
        double g2 = Math.ceil(g1); // Declares the variable "g2" as a double with the initial value of the ceiling of variable "g1" using the ceil method of the math class.
        System.out.println("The ceiling of " + g1 + " is " + g2); // Outputs the values of variables "g1" and "g2".
        double h1 = 1.4; // Declares the variable "h1" as a double with the initial value of 1.4.
        double h2 = Math.floor(h1); // Declares the variable "h2" as a double with the initial value of the floor of variable "h1" using the floor method of the math class.
        System.out.println("The floor of " + h1 + " is " + h2); // Outputs the values of variables "h1" and "h2".
        double i1 = -1.6; // Declares the variable "g1" as a double with the initial value of -1.6.
        double i2 = Math.floor(i1); // Declares the variable "i2" as a double with the initial value of the floor of variable "i1" using the floor method of the math class.
        System.out.println("The floor of " + i1 + " is " + i2); // Outputs the values of variables "i1" and "i2".
        // ***** LOGRITHMIC CALCULATIONS *****
        double j1 = 7.89; // Declares the variable "j1" as a double with the initial value of 7.89.
        double j2 = Math.log(j1); // Declares the variable "j2" as a double with the initial value of the log of variable "j2" using the log method of the math class.
        System.out.println("The LOG of " + j1 + " is " + j2); // Outputs the values of variables "j1" and "j2".
        // ***** MAX & MIN *****
        double k1 = 2038.5; // Declares the variable "k1" as a double with the initial value of 2038.5.
        double k2 = -8999.0; // Declares the variable "k2" as a double with the initial value of -8999.0.
        double k3 = Math.min(k1,k2); // Declares the variable "k3" as a double with the initial value of the minimum of variables "k1" and "k2" using the min method of the math class.
        System.out.println("The minimum of " + k1 + " and " + k2 + " is " + k3);
        double k4 = Math.max(k1,k2); // Declares the variable "k4" as a double with the initial value of the maximum of variables "k1" and "k2" using the max method of the math class.
        System.out.println("The maximum of " + k1 + " and " + k2 + " is " + k4);
        // ***** ROUNDING *****
        double l1 = 148.2; // Declares the variable "l1" as a double with the initial value of 148.2.
        double l1r = Math.round(l1); // Declares the variable "l1r" as a double with the initial value as the rounded value of variable "l1" using the round method of the math class.
        System.out.println(l1 + " rounded is " + l1r); // Outputs the values of variables "l1" and "l1r".
        double l2 = 148.7; // Declares the variable "l2" as a double with the initial value of 148.7.
        double l2r = Math.round(l2); // Declares the variable "l2r" as a double with the initial value as the rounded value of variable "l2" using the round method of the math class.
        System.out.println(l2 + " rounded is " + l2r); // Outputs the values of variables "l2" and "l2r".
        double l3 = -148.2; // Declares the variable "l3" as a double with the initial value of -148.2.
        double l3r = Math.round(l3); // Declares the variable "l3r" as a double with the initial value as the rounded value of variable "l3" using the round method of the math class.
        System.out.println(l3 + " rounded is " + l3r); // Outputs the values of variables "l3" and "l3r".
        double l4 = -148.7; // Declares the variable "l4" as a double with the initial value of -148.7.
        double l4r = Math.round(l4); // Declares the variable "l4r" as a double with the initial value as the rounded value of variable "l4" using the round method of the math class.
        System.out.println(l4 + " rounded is " + l4r); // Outputs the values of variables "l4" and "l4r".
        double l5 = 199.45918; // Declares the variable "l5" as a double with the initial value of 199.45918.
        double l5r = Math.round(l5); // Declares the variable "l5r" as a double with the initial value as the rounded value of variable "l5" using the round method of the math class.
        System.out.println(l5 + " rounded is " + l5r); // Outputs the values of variables "l5" and "l5r".
        // ***** RANDOM NUMBER GENERATORS *****
        double m1 = Math.random(); // Declares the variable "m1" as a double with the initial value that is randomly asisgned using the random method of the math class.
        System.out.println("Variable m1 has been randomly assigned the value of " + m1); // Outputs the value of variable "m1".
        double m1a = m1 * 100; // Declares the variable "m1a" as a double with the initial value of variable "m1" multplied by 100.
        int m1b = (int)m1a; // Declares the variable "m1b" as an integer with the initial value of variable "m1a" cast as an integer.
        System.out.println("A nice random generated whole number would be " + m1b); // Outputs the value of variable "m1b".
        double m2 = Math.random(); // Declares the variable "m2" as a double with the initial value that is randomly asisgned using the random method of the math class.
        System.out.println("Variable m2 has been randomly assigned the value of " + m2); // Outputs the value of variable "m2".
        double m2a = m2 * 100; // Declares the variable "m2a" as a double with the initial value of variable "m2" multplied by 100.
        int m2b = (int)m2a; // Declares the variable "m2b" as an integer with the initial value of variable "m2a" cast as an integer.
        System.out.println("A nice random generated whole number would be " + m2b); // Outputs the value of variable "m1b".
        // ***** MATHEMATICAL CONSTANTS *****
        System.out.println("pi = " + Math.PI); // Outputs the value of PI using the PI method of the math class.
    }
}
