//Program Name: Blue Pelican Java Lesson 11 (Lesson)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016
 
public class BPJLesson11Lesson
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // ***** FOR LOOP *****
        int j = 0, sum = 0; // Declares the variables "j" and "sum" as integers with the initial values of 0.
        for (j = 3; j <=79; j++) // Starts a for loop that (1) initializes the variable "j" with a value of 3, (2) controls the iterations of the loop as long as the boolean statement of variable "j" is less than or equal to 79, and (3) expresses that variable "j" is incremented each loop.
        {
            sum = sum + j; // Initializes the variable "sum" as the value of itself plus the value of variable "j".
            System.out.println(sum); // Outputs the value of the variable "sum".
        }
        System.out.println("The final sum is " + sum); // Outputs the final value of the variable "sum".
 
        // ***** NESTED FOR LOOP *****
        for (int k = 0; k < 5; k++) // Starts a for loop that (1) declares variable "k" as an integer with an initial value of 0, (2) controls the iterations of the loop as lon as the boolean statement of variable "k" is less than 5, and (3) expresses that variable "k" is incremented each loop.
        {
            System.out.println("Outer Loop"); // Outputs the statement "Outer Loop" on the screen during each iteration. Should appear 5 times total.
            for (int l = 0; l < 8; l++) // Starts a for loop that (1) declares variable "l" as an integer with an initial value of 0, (2) controls the iterations of the loop as lon as the boolean statement of variable "l" is less than 8, and (3) expresses that variable "l" is incremented each loop.
                System.out.println("Inner Loop"); // Outputs the statement "Inner Loop" on the screen during each iterations. Should appear 8 times under each "Outer Loop" statement. Will appear a total of 40 times.
        }
    }
}
