//Program Name: Blue Pelican Java Lesson 18 (Project 2)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.io.*;
import java.util.*;

public class BPJLesson18Project2 {
    public static void main(String args[]){
        char a[] = new char [26];
        int c = 65;
        while (c <= 90)
        {
            a[c - 65] = (char)c;
            c++;
        }
        int e = 0;
        while (e < a.length)
        {
            if ( e != a.length - 1)
            {
                System.out.print(a[e] + ", ");
                e++;
            }else
            {
                System.out.print(a[e]);
                e++;
            }
        }
    }
}
