//Program Name: Blue Pelican Java Lesson 18
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.io.*;
import java.util.*;

public class BPJLesson18Lesson {
    public static void main(String args[]){
        // *** DECLARING ARRAYS & CALCULATIONS WITH 1-DIMENSIONAL ARRAYS ***
        
        int a[] = new int[10]; // Declares variable "a" as an integer array with 10 indices that will hold integers
            a[0] = 95; // Declares value of index 0 in array a with a value of 95.
            a[1] = 85; // Declares value of index 1 in array a with a value of 85.
            a[2] = 97; // Declares value of index 2 in array a with a value of 97.
            a[3] = 83; // Declares value of index 3 in array a with a value of 83.
            a[4] = 80; // Declares value of index 4 in array a with a value of 80.
            a[5] = 100; // Declares value of index 5 in array a with a value of 100.
            a[6] = 99; // Declares value of index 6 in array a with a value of 99.
            a[7] = 81; // Declares value of index 7 in array a with a value of 81.
            a[8] = 95; // Declares value of index 8 in array a with a value of 95.
            a[9] = 85; // Declares value of index 9 in array a with a value of 85.
        double averageA1 = (a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9]) / a.length; // Declares variable "averageA1" as a double with the initial value of indices 0, 1, 2, 3, 4, 5, 6, 7, 8, and 9 added together and then divided by the total number if indices in array A.
        System.out.println("Average of Array A = " + averageA1); // Outputs the value of variable "averageA1" on the screen. Should be 90.0.
            
        int a2 = 0, sumA2 = 0; // Declares the variable "a2" and "sumA2" as integers with the initial values of 0.
        for (a2 = 0; a2 < a.length; a2++) // Establishes a for loop that will run through the full length of array A.
            {
                sumA2 = sumA2 + a[a2]; // Adds the value of each index in array A to the variable "sumA2".
            }
        double averageA2 = sumA2 / a.length; // Declares the variable "averageA2" as a double with the initial value of variable "sumA2" divided by the length of array A.
        System.out.println("Average of Array A using for Loop = " + averageA2); // Outputs the value of variable "averageA2" on the screen. Should be 90.0.
            
        int b[] = {95, 85, 97, 83, 80, 100, 99, 81, 95, 85}; // Declares variable "b" as an integer array with 10 indices with the values 95, 85, 97, 83, 80, 100, 99, 81, 95, and 85.
        double averageB1 = (b[0]+b[1]+b[2]+b[3]+b[4]+b[5]+b[6]+b[7]+b[8]+b[9]) / b.length; // Declares variable "averageB1" as a double with the initial value of indices 0, 1, 2, 3, 4, 5, 6, 7, 8, and 9 added together and then divided by the total number if indices in array B.
        System.out.println("Average of Array B = " + averageB1); // Outputs the value of variable "averageB1" on the screen. Should be 90.0.
        
        int b2 = 0, sumB2 = 0; // Declares the variable "b2" and "sumB2" as integers with the initial values of 0.
        for (b2 = 0; b2 < b.length; b2++) // Establishes a for loop that will run through the full length of array B.
            {
                sumB2 = sumB2 + b[b2]; // Adds the value of each index in array B to the variable "sumB2".
            }
        double averageB2 = sumB2 / b.length; // Declares the variable "averageB2" as a double with the initial value of variable "sumB2" divided by the length of array B.
        System.out.println("Average of Array B using for Loop = " + averageB2); // Outputs the value of variable "averageB2" on the screen. Should be 90.0.
        
        
        int c[] = new int[] {95, 85, 97, 83, 80, 100, 99, 81, 95, 85}; // Declares variable "c" as an integer array with a new array of 10 indices with the values 95, 85, 97, 83, 80, 100, 99, 81, 95, and 85.
        double averageC1 = (c[0]+c[1]+c[2]+c[3]+c[4]+c[5]+c[6]+c[7]+c[8]+c[9]) / c.length; // Declares variable "averageC1" as a double with the initial value of indices 0, 1, 2, 3, 4, 5, 6, 7, 8, and 9 added together and then divided by the total number if indices in array C.
        System.out.println("Average of Array C = " + averageC1); // Outputs the value of variable "averageC1" on the screen. Should be 90.0.
        
        int c2 = 0, sumC2 = 0; // Declares the variable "c2" and "sumC2" as integers with the initial values of 0.
        for (c2 = 0; c2 < c.length; c2++) // Establishes a for loop that will run through the full length of array C.
            {
                sumC2 = sumC2 + c[c2]; // Adds the value of each index in array C to the variable "sumC2".
            }
        double averageC2 = sumC2 / c.length; // Declares the variable "averageC2" as a double with the initial value of variable "sumC2" divided by the length of array C.
        System.out.println("Average of Array C using for Loop = " + averageC2); // Outputs the value of variable "averageC2" on the screen. Should be 90.0.
                
        // *** WORKING WITH PARALLEL ARRAYS ***
        
        String name[] = new String[5]; // Declares the variable "name" as a string array to hold 5 indices.
        int grade[] = new int[5]; // Declares the variable "grade" as an integer array to hold 5 indices.
        
        for(int d = 0; d < 5; d++) // Establishes a for loop that will run through the full length of array D.
        {
            Scanner kbReader1 = new Scanner(System.in); // Creates a new scanner object named "kbReader1".
                System.out.print("Enter the student name: "); // Outputs instructions for the user to enter the name of the student.
                name[d] = kbReader1.nextLine(); // Inputs the value entered into the kbReader1 scanner object into the name array.
            Scanner kbReader2 = new Scanner(System.in); // Creates a new scanner object named "kbReader2".
                System.out.print("Enter the student grade: "); // Outputs instructions for the user to enter the grade of the student.
                grade[d] = kbReader2.nextInt(); // Inputs the value entered into the kbReader2 scanner object into the grade array.
        }
        System.out.println("***Output via Individual Index Calls***"); // Outputs a placeholder on the screen.
        System.out.println(name[0] + " " + grade[0]); // Outputs the values of index 0 in the name and grade arrays.
        System.out.println(name[1] + " " + grade[1]); // Outputs the values of index 1 in the name and grade arrays.
        System.out.println(name[2] + " " + grade[2]); // Outputs the values of index 2 in the name and grade arrays.
        System.out.println(name[3] + " " + grade[3]); // Outputs the values of index 3 in the name and grade arrays.
        System.out.println(name[4] + " " + grade[4]); // Outputs the values of index 4 in the name and grade arrays.
        System.out.println(""); // Outputs a blank line on the screen.
        
        System.out.println("***Output via For Loop***"); // Outputs a placeholder on the screen.
        int d2 = 0; // Declares the variable "d2" as an integer with the initial value of 0.
        for (d2 = 0; d2 < grade.length; d2++) // Establishes a for loop that will run through the full length of array grade.
            {
                System.out.println("Student Name = " + name[d2] + "  /  Student Grade = " + grade[d2]); // Outputs the value of the index in the parallel arrays.
            }
        
        // *** AUTOMATIC INITIALIZATION OF ARRAYS ***
        
        int e[] = new int[1000]; // Declares variable "e" as an integer array with 1000 indices.
        System.out.println("Value of index 823 in Integer Array E is " + e[823]); // Outputs the value of index 823 in array e. Should be 0.
        
        double f[] = new double[1000]; // Declares variable "f" as a double array with 1000 indices.
        System.out.println("Value of index 517 in Double Array F is " + f[517]); // Outputs the value of index 517 in array f. Should be 0.0.
        
        String g[] = new String[10]; // Declares variable "g" as a string array with 10 indices.
        System.out.println("Value of index 8 in String Array G is " + g[8]); // Outputs the value of index 8 in array g. Should be null.
        
        char h[] = new char[100]; // Declares variable "h" as a character array with 100 indices.
        System.out.println("Value of index 72 in Character Array H is " + h[72]); // Outputs the value of index 72 of array h. Should be empty.
        
        System.out.println(""); // Outputs an empty line on the screen.
        
        // *** USING SPLIT METHOD TO PRODUCE ARRAYS ***
        
        String s = "Hello again"; // Declares variable "s" as a string with the initial value of Hello again.
        
        String i[]; // Declares variable "i" as a string array with no initial value.
        i = s.split("a"); // Inputs the characters delimited at the character a into each index of array i.
        
        int i2 = 0; // Declares the variable "i2" as an integer with the initial value of 0.
        for (i2 = 0; i2 < i.length; i2++) // Establishes a for loop that will run through the full length of array i.
            {
                System.out.println("Array i - Index #" + i2 + " = " + i[i2]); // Outputs the values of each index in array i.
            }
        System.out.println(""); // Outputs an empty line on the screen.
        
        String j[]; // Declares variable "j" as a string array with no initial value.
        j = s.split("\\s"); // Inputs the characters delimited at the white space into each index of array j.
        
        int j2 = 0; // Declares the variable "j2" as an integer with the initial value of 0.
        for (j2 = 0; j2 < j.length; j2++) // Establishes a for loop that will run through the full length of array j.
            {
                System.out.println("Array j - Index #" + j2 + " = " + j[j2]); // Outputs the values of each index in array j.
            }
        System.out.println(""); // Outputs an empty line on the screen.
        
        String k[]; // Declares variable "k" as a string array with no initial value.
        k = s.split("e|g"); // Inputs the characters delimited at either the letter e or letter g into each index of array k.
        
        int k2 = 0; // Declares the variable "k2" as an integer with the initial value of 0.
        for (k2 = 0; k2 < k.length; k2++) // Establishes a for loop that will run through the full length of array k.
            {
                System.out.println("Array k - Index #" + k2 + " = " + k[k2]); // Outputs the values of each index in array k.
            }
        System.out.println(""); // Outputs an empty line on the screen.
    }
}
