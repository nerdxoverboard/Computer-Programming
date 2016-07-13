//Program Name: Blue Pelican Java Lesson 11 (Project)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016
 
import java.io.*;
import java.util.*;
 
public class BPJLesson11Project
{
	public static void main (String[] args) throws java.lang.Exception
	{
        System.out.println("Please Enter Your Name: _");
        Scanner nameInput = new Scanner(System.in);
        String nameForward = nameInput.nextLine();
        String nameLowerCase = nameForward.toLowerCase();
        int nameCharCount = nameForward.length(); 
        for (int nameChars = nameCharCount; nameChars > 0; nameChars--)
        {
            String letter = nameLowerCase.substring(nameChars-1, nameChars);
            System.out.print(letter);
        }
    System.out.println("");
    }
}
