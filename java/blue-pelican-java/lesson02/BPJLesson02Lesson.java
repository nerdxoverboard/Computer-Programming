//Program Name: Blue Pelican Java Lesson 02 (Lesson)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

public class BPJLesson02Lesson {
    public static void main(String args[]){
        // ***** DECLARING AND INITIALIZING A STRING VARIABLE *****
        String s = "Hello Cruel World"; // Declares variable "s" as a string with the initial value of Hello Cruel World.
        System.out.println(s); // Outputs value of variable "s".
        
        // ***** DECLARING AND INITIALIZING AN INT VARIABLE *****
        int age = 59; // Declares variable "age" as an integer with the initial value of 59.
        System.out.println(age); // Outputs value of variable "age".
        
        int bigNumberNoBreaks = 1029384756; // Declares variable "bigNumberNoBreaks" as an integer with the initial value of 1,029,384,756.
        System.out.println(bigNumberNoBreaks); // Outputs value of variable "bigNumberNoBreaks".
        
        // ***** USING UNDERSCORES TO VISUALLY OFFSET PERIODS IN LARGE NUMBERS *****
        int bigNumberWithBreaks = 1_029_384_756; // Declares variable "bitNumberWithBreaks" as an integer with the initial value of 1,029,384,756.
        System.out.println(bigNumberWithBreaks); // Outputs value of variable "bigNumberWithBreaks".
        
        // ***** DECLARING AND INITIALIZING A DOUBLE ACCURACY OR FLOATING POINT VARIABLE *****
        double x = 1.6; // Declares variable "x" as a double with the value of 1.6.
        System.out.println(x); // Outputs value of variable "x".
        
        // ***** DECLARING A VARIABLE SEPARATE FROM INITIALIZING A VARIABLE *****
        String funWords; // Declares variable "funWords as a string with no initial value.
        funWords = "Supercalifragilisticexpialidocious"; // Initializes the value of "Supercalifragilisticexpialidocious" to the variable "funWords".
        System.out.println(funWords); // Outputs value of variable "funWords".
        
        // ***** COMBINING AN INTEGER VARIABLE WITH A DOUBLE ACCURATE OR FLOATING POINT VARIABLE *****
        int addend1 = 41; // Declares variable "addend1" as an integer with an initial value of 41.
        double addend2 = 42.5; // Declares variable "addend2" as an integer with an initial value of 42.5.
        double summation = addend1 + addend2; // Declares variable "summation" as a double with an initial value of the sum of the values of variables addend1 and addend 2.
        System.out.println(summation); // Outputs value of variable "summation".
    }
}
