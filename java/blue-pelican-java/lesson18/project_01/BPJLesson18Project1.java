//Program Name: Blue Pelican Java Lesson 18 (Project 1)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.io.*;
import java.util.*;

public class BPJLesson18Project1 {
    public static void main(String args[]){
        String exitCheck = "" ,allCaps, noWhiteSpace;
        
        while (!"EXIT".equals(exitCheck))
        {            
            Scanner sentenceIntake = new Scanner(System.in);
            System.out.print("Type a sentence and press ENTER. ");
            String sntnc = sentenceIntake.nextLine();
            
            allCaps = sntnc.toUpperCase();
            exitCheck = allCaps;
            noWhiteSpace = allCaps.replaceAll("\\s+", "");
            noWhiteSpace = noWhiteSpace + "onetwothree";
            
            String a[];
            a = noWhiteSpace.split("SA");
            
            int lngth = a.length - 1;
            System.out.println("There are "+ lngth + " occurrences.");
        }
    System.out.println("You have exited the program. Thank you.");
    }
}
