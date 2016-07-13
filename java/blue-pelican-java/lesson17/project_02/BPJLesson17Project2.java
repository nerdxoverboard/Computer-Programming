//Program Name: Blue Pelican Java Lesson 17 Project 2 (File 1 of 2)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.io.*;
import java.util.*;

public class BPJLesson17Project2 {
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter a sentence that is to be encrypted: ");
        String sntnc = kbReader.nextLine();
        System.out.println("Original sentence = " + sntnc);
        
        Crypto myCryptObj = new Crypto();
    
        String encryptdSntnc = myCryptObj.encrypt(sntnc);
        System.out.println("Encrypted: " + encryptdSntnc);
    
        String decryptdSntnc = myCryptObj.decrypt(encryptdSntnc);
        System.out.println("Decrypted: " + decryptdSntnc);
    }
}
