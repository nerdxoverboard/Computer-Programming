//Program Name: Blue Pelican Java Lesson 12 (Lesson)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016
 
public class BPJLesson12Lesson
{
	public static void main (String[] args) throws java.lang.Exception
	{
    // ***** WHILE LOOPS *****
	int sum1 = 0; // Declares the variable "sum1" as an integer with the initial value of 0.
	int j1 = 3; // Declares the variable "j1" as an integer with the initial value of 3.
	while (j1 <= 79) // Control expression that runs while boolean expression remains true.
	{
            sum1 = sum1 + j1; // Initializes the variable "sum1" with the value of adding itself to the variable to "j1".
            j1++; // Increments the value of "j1" on each loop iteration.
	}
	System.out.println(sum1); // Outputs the value of the variable "sum1".
 
	// ***** DO WHILE LOOPS *****
        int sum2 = 0; // Declares the variable "sum2" as an integer with the initial value of 0.
	int j2 = 3; // Declares the variable "j2" as an integer with the initial value of 3.
	do
	{
            sum2 = sum2 + j2; // Initializes the variable "sum2" with the value of adding itself to the variable to "j2".
            j2++; // Increments the value of "j2" on each loop iteration.
	} while (j2 <= 79); // Control expression that runs while boolean expression remains true.
	System.out.println(sum2); // Outputs the value of the variable "sum2".
 
	// ***** CONTINUE STATEMENTS *****
	int j3 = 0; // Declares the variable "j3" as an integer with the initial value of 0.
	int boxer = 11; // Declares the variable "boxer" as an integer with the initial value of 11.
	while (j3 < 10) // Control expression that runs while boolean expression remains true.
	{
            j3++; // Increments the value of "j3" on each loop iteration.
            if(j3 != 5) // Conditional boolean statement that executes if "j3" does not equal 5.
            {
                continue; // Skips the rest of the statements in the while loop for this iteration only.
            }
            boxer = boxer + j3; // Initilizes the variable "boxer" with the value of adding itself to the variable "j3".
        }
	System.out.println(boxer); // Outputs the value of the variable "boxer".
    }
}
