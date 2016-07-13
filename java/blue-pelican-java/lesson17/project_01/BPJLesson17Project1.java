//Program Name: Blue Pelican Java Lesson 17 Project 1
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.io.*;
import java.util.*;

public class BPJLesson17Project1 {
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter something like 8 + 33 + 1,345 - 137 : ");
        String equation = kb.nextLine();
        
        Scanner sc1 = new Scanner(equation);
        String s = "";
        while (sc1.hasNext()){ 
            while (sc1.hasNext("\\s")){ 
                sc1.skip("\\s*"); 
            }
            if (sc1.hasNext()) { 
                s = s + sc1.next(); 
            } 
        } 
        
        Scanner sc2 = new Scanner(s);
        sc2.useDelimiter("\\+|\\-");
        
        int sumdiff = 0;
        if (s.startsWith("-")){
            sumdiff -= sc2.nextInt();
        }else{
            sumdiff += sc2.nextInt();
        }
        while (sc2.hasNextDouble()){
            String operation = sc2.findInLine("\\+|\\-");
            if (operation.equals("+")){
                sumdiff += sc2.nextInt();
            }
            if (operation.equals("-")){
                sumdiff -= sc2.nextInt();
            }
        }
        System.out.println(equation + " = " + sumdiff);
    }
}
