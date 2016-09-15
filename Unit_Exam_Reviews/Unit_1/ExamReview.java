//Program Name: Exam Review
//Programmer Name: Eric Evans
//Program Date: September 15, 2016

import java.util.*; // Library import for keyboard input.
import java.lang.*; // Library import for keyboard input.
import java.io.*; // Library import for keyboard input.

public class ExamReview {
    public static void main(String args[]){
        System.out.println(19.0/4);
            // Answer would be 4.75
        
        String greetingMessage = "Welcome to Class";
            // Creates a string variable with the delcared value.
        System.out.println(greetingMessage);
            // Displays the value of variable greetingMessage
        
        String upperCaseConversion = "This is Homecoming Week!";
            // Creates a string variable with the declared value.
        System.out.println(upperCaseConversion.toUpperCase() );
            // Displays the value of variable upperCaseConversion in UC letters
        
        String declarationOfIndependence = "When in the course of human events";
            // Creates a string variable with the declared value.
        String cutDOI;
            // Creates a string variable with no initial value.
        cutDOI = declarationOfIndependence.substring(12);
            // Declares the value of cutDOI as variable declarationOfIndependence starting at index 12.
        System.out.println(cutDOI);
            // Displays the value of variable cutDOI
        String cutDOIEnd;
            // Creates a string variable with no initial value.
        cutDOIEnd = declarationOfIndependence.substring(12,27);
            // Declares the value of cutDOIEnd as variable declarationOfIndependence starting at index 12 and ending at index 27.
        System.out.println(cutDOIEnd);
            // Displays the value of variable cutDOIEnd
        
        int countByFive = 5;
            // Creates an integer variable with the declared value
        countByFive += 5;
            // Increases the current value of variable countByFive by 5
        System.out.println(countByFive);
            // Displays the value of variable countByFive
        
        final int studentStartCount = 716;
            // Creates a constant integer variable with the declared value
        System.out.println(studentStartCount);
            // Displays the value of variable studentStartCount
            
        double average = 79.9;
            // Creates a double variable with the declared value
        int finalAverage = (int)average;
            // Creates an integer variable with the value of variable average treated as an integer
        System.out.println(finalAverage);
        
        /*
        ***** START PROGRAM OUTPUT *****
            Line 11 Output - 4.75
            Line 16 Output - Welcome to Class
            Line 21 Output - THIS IS HOMECOMING WEEK!
            Line 30 Output - course of human events
            Line 36 Output - course of human
            Line 43 Output - 10
            Line 48 Output - 716
            Line 55 Output - 79
        ***** END PROGRAM OUTPUT *****
        */
    }
}
