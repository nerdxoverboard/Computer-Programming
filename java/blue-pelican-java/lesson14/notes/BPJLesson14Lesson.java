//Program Name: Blue Pelican Java Lesson 14 (Lesson)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016
 
public class BPJLesson14Lesson
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // ***** STORING A HEX VALUE *****
        int hex = 0x4CB3; // Declares variable "hex" as an integer with an initial value of 4CB3 in hex. The leading 0x declares the value as hex.
        System.out.println("The value of 4CB3hex in decimal is " + hex); // Outputs the value of the variable "hex" in decimal (base 10).
        System.out.println(""); // Outputs a blank line.
 
        // ***** STORING A BINARY VALUE *****
        int biny = 0b1000101; // Declares variable "biny" as an integer with an initial value of 1000101 in binary. The leading 0b declares the value as binary.
        System.out.println("The value of 1000101bin in decimal is " + biny); // Outputs the value of the variable "biny" in decimal (base 10).
        System.out.println(""); // Outputs a blank line.
 
        // ***** STORING AN OCTAL VALUE *****
        int octy = 0734; // Declares variable "octy" as an integer with an initial value of 734 in octal. The leading 0 declares the value as binary.
        System.out.println("The value of 734oct in decimal is " + octy); // Outputs the value of the variable "octy" in decimal (base 10).
        System.out.println(""); // Outputs a blank line.
 
        // ***** CONVERTING NUMBERS *****
        int start = 3901; // Declares variable "start" as an integer with an initial value of 3901.
        System.out.println("3901 in BASE 10 is " + (Integer.toString(start, 10))); // Outputs the value of variable "start" in decimal using the toString method of the integer class.
        System.out.println("3901 in binary is " + (Integer.toBinaryString(start))); // Outputs the value of variable "start" in binary using the toBinaryString method of the integer class.
        System.out.println("3901 in BASE 2 is " + (Integer.toString(start, 2))); // Outputs the value of variable "start" in base 2 using the toString method of the integer class.
        System.out.println("3901 in hex is " + (Integer.toHexString(start))); // Outputs the value of variable "start" in hex using the toHexString method of the integer class.
        System.out.println("3901 in BASE 16 is " + (Integer.toString(start, 16))); // Outputs the value of variable "start" in base 16 using the toString method of the integer class.
        System.out.println("3901 in octal is " + (Integer.toOctalString(start))); // Outputs the value of variable "start" in octal using the toOctalString method of the integer class.
        System.out.println("3901 in BASE 8 is " + (Integer.toString(start, 8))); // Outputs the value of variable "start" in base 8 using the toString method of the integer class.
 
        // ***** CONVERTING CHARACTERS *****
        char testChar = 'A'; // Declares variable "testChar" as a character with an initial value of A.
        int base10Convert = 0 + testChar; // Declares variable "base10Convert" as an integer with the initial value of 0 added to the decimal value of the variable "testChar".
        System.out.println("The Letter A in BASE 10 is " + base10Convert); // Outputs the value of variable "testChar" in decimal.
        System.out.println("The Letter A in BASE 2 is " + Integer.toBinaryString(base10Convert)); // Outputs value of variable "testChar" in binary using the toBinaryString method of the integer class.
        System.out.println("The Letter A in BASE 8 is " + Integer.toOctalString(base10Convert)); // Outputs value of variable "testChar" in octal using the toOctalString method of the integer class.
        System.out.println("The Letter A in BASE 16 is " + Integer.toHexString(base10Convert)); // Outputs value of variable "testChar" in hex using the toHexString method of the integer class.
        System.out.println("The Letter A as a character is " + testChar); // Outputs the value of the variable "testChar".
    }
}
