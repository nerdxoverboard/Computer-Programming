//Program Name: Blue Pelican Java Lesson 17
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.io.*;
import java.util.*;

public class BPJLesson17Lesson {
    public static void main(String args[]){
        String s = "The Dukes of Hazzard"; // Declares variable "s" as a String with the initial value of Dukes of Hazzard.
        String s_space = "T  h  e     D  u  k  e  s     o  f     H  a  z  z  a  r  d";
        String s_indexed = "00 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19";
        System.out.println(s_space);
        System.out.println(s_indexed);
        int ja = s.compareTo("coat room"); // Declares varialbe "ja" as an Integer with the initial value to compare variable "s" to the value of "coat room".
        System.out.println("String ja = " + ja); // Outputs the value of variable "ja".
        
        int jb = s.indexOf("Hazzard"); // Declares variable "jb" as an Integer with the initial value starting index value of the word Hazzard in variable "s" as calculated by the indexOf method of the String class.
        System.out.println("String jb = " + jb); // Outputs the value of the variable "jb". Answer should be 13.
        
        int jc = s.indexOf("Hazzard", 15); //Declares variable "jc" as an Integer with the initial value starting at index value 15 for the word Hazzard in variable "s" as calculated by the indexOf method of the String class. 
        System.out.println("String jc = " + jc); // Outputs the value of the variable "jc". Answer should be -1.

        int jd = s.indexOf("e", 4); // Declares variable "jd" as an Integer with the initial value of the index of the first letter e encountered following the index value of 4 in variable "s" as calculated by the indexOf method of the String class.
        System.out.println("String jd = " + jd); // Outputs the value of variable "jd". Answer should be 7.

        int je = s.indexOf('D'); // Declares variable "je" as an Integer with the initial value of the index of the first letter D encountered in variable "s" using the indexOf method of the Char class.
        System.out.println("String je = " + je); // Outputs the value of variable "je". Answer should be 4.
        
        int jf = s.indexOf(68); // Declares variable "jf" as an Integer with the initial value of the index of the first character of ASCII code 68 in varible "s" using the indexOf method of the Char class.
        System.out.println("String jf = " + jf); // Outputs the value of variable "jf". Answer should be 4.

        int jg = s.indexOf(101, 4); // Declares variable "jg" as an Integer with the initial value of the index of ASCII code 101 (lower-case e) in variable "s" using the indexOf method of the Char class.
        System.out.println("String jg = " + jg); // Outputs the value of variable "jg". Answer should be 7.
        
        int jh = s.lastIndexOf("Haz"); // Declares variable "jh" as an Integer with the initial value of the index of where Haz starts in variable "s" using the lastIndexOf method of the String class.
        System.out.println("String jh = " + jh); // Outputs the value of variable "jh". Answer should be 13.
        
        int ji = s.lastIndexOf("Haz", 11); // Declares variable "ji" as an Integer with the initial value of the index of where Haz starts after the 11th index using the lastIndexOf method of the String class.
        System.out.println("String ji = " + ji); // Outputs the value of variable "ji". Answer should be -1.
        
        char myChar = s.charAt(6); // Declares variable "myChar" as as a Character with the initial value of the character located at the 6th index.
        System.out.println("String myChar = " + myChar); // Outputs the value of variable "myChar". Answer should be k.

        String myStringA = s.replace('z', 'L'); // Declares variable "myStringA" as a String with the initial value of variable "s" with the character z replaced with the character L using the replace method of the String class.
        System.out.println("myStringA = " + myStringA); // Outputs the value of variable "myStringA". Answer should be The Dukes of HaLLard.

        String myStringB = s.replace("Dukes", "Nerds"); // Declares variable "myStringB" as a String with the initial value of variable "s" with the string Dukes replaced with the string Nerds using the replace method of the String class.
        System.out.println("myStringB = " + myStringB); // Outputs the value of variable "myStringB". Answer should be The Nerds of Hazzard.

        String a1 = "\t Ding Dong \t \n" ; // Declares variable "a1" as a String with the initial value TAB Ding Dong TAB NEW_LINE.
        System.out.println("String a1 = " + a1); // Outputs the value of variable "a1". Answer should be a tab followed by Ding Dong followed by a tab and then a line break.
        String a2 = a1.trim( ); // Declares variable "a2" as a String with the initial value of variable "a1" with the leading and trailing white space removed using the trim function of the String class.
        System.out.println("String a2 = " + a2); // Outputs the value of variable "a2". Answer should be Ding Dong.
        String a3 = "X" + a2 + "X"; // Declares variable "a3" as a String with the initial value of variable "a2" flanked with a leading and trailing upper-case X.
        System.out.println("String a3 = " + a3); // Outputs the value of variable "a3". Answer should be XDing DongX. 

        boolean b1 = "Sticks and Stones".contains("tic"); // Declares variable "b1" as a Boolean with an initial value of Stick and Stones using the contains method to search for the string tic.
        System.out.println("Sticks and Stones contains tic - " + b1); // Outputs the value of variable "b1". Answer should be true.
        boolean b2 = "Have a good day.".startsWith("Hav"); // Declares variable "b2" as a Boolean with an initial value of Have a good day using the startsWith method to search for the starting string Hav.
        System.out.println("Have a good day starts with Hav - " + b2); // Outputs the value of variable "b2". Answer should be true.
    }
}
