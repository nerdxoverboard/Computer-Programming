//Program Name: Blue Pelican Java Lesson 13 (Lesson)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016
 
public class BPJLesson13Lesson
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // ***** ASCII VALUES *****
        int x = 1; // Declares variable "x" as an integer with an initial value of 1.
        char upperCaseA = 'A'; // Declares variable "upperCaseA" as a character with an initial value of A. 
        int y = x + upperCaseA; // Declares variable "y" as an integer with the initial value of variable "x" added to the ASCII value of variable "upperCaseA".
        System.out.println(y); // Outputs the value of variable "y".
 
        // ***** CONVERT STRING TO A CHARACTER *****
        String s = "W"; // Declares variable "s" as a string with an initial value of W.
        char a  = s.charAt(0); // Declares variable "a" as a character with an initial value of the character value of the first letter (index 0) of variable "s".
        System.out.println("String s = " + s); // Outputs the value of variable "s".
        System.out.println("Char a = " + a); // Outputs the value of variable "a".
 
        // ***** CONVERT A CHARACTER TO STRING *****
        char b = 'X'; // Declares variable "b" as a character with an initial value of X.
        String c = "" + b; // Declares variable "c" as a string with an initial value of an empty string concatenated with variable "b".
        System.out.println("Char b = " + b); // Outputs the value of variable "b".
        System.out.println("String c = " + c); // Outputs the value of variable "c".
 
        // ***** CONVERT LETTER *****
        char bigLetter = 'H'; // Declares variable "bigLetter" as a character with an initial value of H.
        char smallLetter = (char)(bigLetter + 32); // Declares variable "smallLetter" as a character with an initial value of the ASCII value of variable "bigLetter" plus 32.
        System.out.println(bigLetter + " = " + smallLetter); // Outputs the value of variables "bigLetter" and "smallLetter".
 
        // ***** DETERMINE CHARACTER TYPE *****
        System.out.println(""); // Outputs a blank line.
        char determineTypeA = 'a'; // Declares variable "determineTypeA" as a character with an initial value of A.
        System.out.println("Digit = " + Character.isDigit(determineTypeA) ); // Outputs whether variable "determineTypeA" is a digit using the isDigit method of the character class.
        System.out.println("Letter = " + Character.isLetter(determineTypeA) ); // Outputs whether variable "determineTypeA" is a letter using the isLetter method of the character class.
        System.out.println("Character was " + determineTypeA); // Outputs the value of variable "determineTypeA".
 
        System.out.println(""); // Outputs a blank line.
        char determineTypeB = '3'; // Declares variable "determineTypeB" as a character with an initial value of 3.
        System.out.println("Digit = " + Character.isDigit(determineTypeB) ); // Outputs whether variable "determineTypeB" is a digit using the isDigit method of the character class.
        System.out.println("Letter = " + Character.isLetter(determineTypeB) ); // Outputs whether variable "determineTypeB" is a letter using the isLetter method of the character class.
        System.out.println("Character was " + determineTypeB); // Outputs the value of variable "determineTypeB".
 
        System.out.println(""); // Outputs a blank line.
        System.out.println("Digit = " + Character.isLetterOrDigit(determineTypeA) ); // Outputs whether variable "determineTypeA" is a digit OR letter using the isLetterOrDigit method of the character class.
        System.out.println("Letter = " + Character.isLetterOrDigit(determineTypeB) ); // Outputs whether variable "determineTypeB" is a digit OR letter using the isLetterOrDigit method of the character class.
        System.out.println("Character was " + determineTypeA + " and is a letter OR digit."); // Outputs the value of variable "determineTypeA".
        System.out.println("Character was " + determineTypeB + " and is a letter OR digit."); // Outputs the value of variable "determineTypeB".
 
        System.out.println(""); // Outputs a blank line.
        char determineTypeW1 = ' '; // Declares variable "determineTypeW1" as a character with an initial value of a blank space.
        System.out.println("Whitespace = " + Character.isWhitespace(determineTypeW1) ); // Outputs whether variable "determineTypeW1" is whitepace using the isWhitespace method of the character class.
        System.out.println("Character was " + determineTypeW1); // Outputs the value of variable "determineTypeW1".
        char determineTypeW2 = 'p'; // Declares variable "determineTypeW2" as a character with an initial value of p.
        System.out.println("Whitespace = " + Character.isWhitespace(determineTypeW2) ); // Outputs whether variable "determineTypeW2" is whitepace using the isWhitespace method of the character class.
        System.out.println("Character was " + determineTypeW2); // Outputs the value of variable "determineTypeW2".
 
        System.out.println(""); // Outputs a blank line.
        char determineTypeC = 'A'; // Declares variable "determineTypeC" as a character with an initial value of A.
        System.out.println("Upper-Case Letter = " + Character.isUpperCase(determineTypeC) ); // Outputs whether variable "determineTypeC" is an upper-case letter using the isUpperCase method of the character class.
        System.out.println("Lower-Case Letter = " + Character.isLowerCase(determineTypeC) ); // Outputs whether variable "determineTypeC" is an lower-case letter using the isLowerCase method of the character class.
        System.out.println("Character was " + determineTypeC); // Outputs the value of variable "determineTypeC".
 
        System.out.println(""); // Outputs a blank line.
        char determineTypeD = 'a'; // Declares variable "determineTypeD" as a character with an initial value of a.
        System.out.println("Upper-Case Letter = " + Character.isUpperCase(determineTypeD) ); // Outputs whether variable "determineTypeD" is an upper-case letter using the isUpperCase method of the character class.
        System.out.println("Lower-Case Letter = " + Character.isLowerCase(determineTypeD) ); // Outputs whether variable "determineTypeD" is an lower-case letter using the isLowerCase method of the character class.
        System.out.println("Character was " + determineTypeD); // Outputs the value of variable "determineTypeD".
    }
}
