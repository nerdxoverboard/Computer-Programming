//Program Name: Blue Pelican Java Lesson 17 Project 2 (File 2 of 2)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.io.*;
import java.util.*;

public class Crypto {
    /*
    V and v are replaced with ag',r
    M and m are replaced with ssad
    G and g are replaced with jeb..w
    B and b are replaced with dub>?/
    */
    
    public String encryptdSntnc = "";

    public String encrypt(String sntnc)
    {
       int i;
       for (i = 0; i < sntnc.length(); i++)
       { 
        switch(sntnc.charAt(i))
        {
           case 'v':
           case 'V': encryptdSntnc += "ag',r";
                     break;
           case 'm':
           case 'M': encryptdSntnc += "ssad";
                     break;
           case 'g':
           case 'G': encryptdSntnc += "jeb..w";
                     break;
           case 'b':
           case 'B': encryptdSntnc += "dug>?/";
                     break;
           default: encryptdSntnc += sntnc.charAt(i);
        }
       }
       return encryptdSntnc;
    }
    
    public String decrypt(String encryptdSntnc)
    {
        encryptdSntnc = encryptdSntnc.replace("ag',r", "v");
        encryptdSntnc = encryptdSntnc.replace("ssad", "m");
        encryptdSntnc = encryptdSntnc.replace("jeb..w", "g");
        encryptdSntnc = encryptdSntnc.replace("dug>?/", "b");
        return encryptdSntnc;
    }
}
