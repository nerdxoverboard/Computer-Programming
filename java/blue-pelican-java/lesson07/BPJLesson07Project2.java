//Program Name: Blue Pelican Java Lesson 07 (Project #2)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.util.*;
import java.lang.*;
import java.io.*;

public class BPJLesson07Project2
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner input = new Scanner(System.in);
        System.out.print("What is your first name? _");
        String firstName = input.next();
        System.out.print("What is your last name? _");
        String lastName = input.next();
        String fullName = firstName + " " + lastName;
        System.out.println("Your full name is " + fullName);
    }
}
