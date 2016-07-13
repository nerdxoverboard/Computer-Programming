//Program Name: Blue Pelican Java Lesson 07 (Project #1)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.util.*;
import java.lang.*;
import java.io.*;

public class BPJLesson07Project1
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner input = new Scanner(System.in);
        System.out.print("What is the area? _");
        double a = input.nextDouble();
        double area = a;
        double radius;
        radius = Math.sqrt(area/Math.PI);
        System.out.println("Radius of your circle is " + radius);
    }
}
