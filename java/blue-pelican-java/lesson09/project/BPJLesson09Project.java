//Program Name: Blue Pelican Java Lesson 09 (Project)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class BPJLesson09Project
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner numberInput = new Scanner(System.in);
        System.out.print("Enter an integer: _");
        int numberOddEven = numberInput.nextInt();
        double check = numberOddEven % 2;
        if (check == 0){
            System.out.println("The integer " + numberOddEven + " is even");
        }else{
            System.out.println("The integer " + numberOddEven + " is odd");
        }
    }
}
