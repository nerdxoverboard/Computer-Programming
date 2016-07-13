//Program Name: Blue Pelican Java Lesson 08 (Lesson)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.lang.*;

public class BPJLesson08Lesson
{
	public static void main (String[] args) throws java.lang.Exception
	{

        System.out.print("true  -  "); // Outputs boolean string for user.
        System.out.print(true); // Outputs boolean value for "true", which is true.
        System.out.println(""); // Outputs a blank line.
        System.out.print("false  -  "); // Outputs boolean string for user.
        System.out.print(false); // Outputs boolean value for "false", which is false.
        System.out.println(""); // Outputs a blank line.
        System.out.print("NOT true  -  "); // Outputs boolean string for user.
        System.out.print(!true); // Outputs boolean value for "NOT true", which is false.
        System.out.println(""); // Outputs a blank line.
        System.out.print("NOT false  -  "); // Outputs boolean string for user.
        System.out.print(!false); // Outputs boolean value for "NOT false", which is true.
        System.out.println(""); // Outputs a blank line.
        System.out.print("NOT 3 < 5  -  "); // Outputs boolean string for user.
        System.out.print(!(3 < 5)); // Outputs boolean value for "NOT 3 < 5", which is false.
        System.out.println(""); // Outputs a blank line.
        System.out.print("NOT 1 = 0  -  "); // Outputs boolean string for user.
        System.out.print(!(1 == 0)); // Outputs boolean value for "NOT 1 = 0", which is true.
        System.out.println(""); // Outputs a blank line.
        int x = 79, y = 46, z = -3;
        double d = 13.89, jj = 40.0;
        boolean b = true, c = false;
        System.out.print("true AND false  -  "); // Outputs boolean string for user.
        System.out.print(true && false); // Outputs boolean value for "true AND false", which is false.
        System.out.println(""); // Outputs a blank line.
        System.out.print("true AND NOT false  -  "); // Outputs boolean string for user.
        System.out.print(true && !false); // Outputs boolean value for "true AND NOT false", which is true.
        System.out.println(""); // Outputs a blank line.
        System.out.print("false OR 13.89 > 0  -  "); // Outputs boolean string for user.
        System.out.print(c || (d > 0) ); // Outputs boolean value for "c OR (d > 0)", which is true.
        System.out.println(""); // Outputs a blank line.
        System.out.print("NOT true OR false  -  "); // Outputs boolean string for user.
        System.out.print(!b || c); // Outputs boolean value for "NOT b or c", which is false.
        System.out.println(""); // Outputs a blank line.
        System.out.print("79 > 102 AND true  -  "); // Outputs boolean string for user.
        System.out.print(x > 102 && true); // Outputs boolean value for "x > 102 AND true", which is false.
        System.out.println(""); // Outputs a blank line.
        System.out.print("40.0 = 1 or false  -  "); // Outputs boolean string for user.
        System.out.print( (jj == 1) || false); // Outputs boolean value for "jj = 1 OR false", which is false.
        System.out.println(""); // Outputs a blank line.
        System.out.print("40.0 = 40 AND NOT false  -  "); // Outputs boolean string for user.
        System.out.print( (jj == 40) && !false); // Outputs boolean value for "jj = 40 AND NOT false", which is true.
        System.out.println(""); // Outputs a blank line.
        System.out.print("79 NOT = 3  -  "); // Outputs boolean string for user.
        System.out.print(x != 3); // Outputs boolean value for "x NOT = 3", which is true.
        System.out.println(""); // Outputs a blank line.
        System.out.print("NOT ( 79 NOT = 3 )  -  "); // Outputs boolean string for user.
        System.out.print( !(x != 3) ); // Outputs boolean value for "NOT (x NOT = 3)", which is false.
        System.out.println(""); // Outputs a blank line.
        System.out.print("NOT NOT true  -  "); // Outputs boolean string for user.
        System.out.print( !!true); // Outputs boolean value for "NOT NOT true", which is true.
        System.out.println(""); // Outputs a blank line.
        System.out.print("(true AND false) OR (true AND true) OR false  -  "); // Outputs boolean string for user.
        System.out.print( (true && false) || ( (true && true) || false ) ); // Outputs boolean value for "(true AND false) OR (true AND true) OR false" which is true.
        System.out.println(""); // Outputs a blank line.
        System.out.print("true OR false AND false  -  "); // Outputs boolean string for user.
        System.out.print(true || false && false ); // Outputs boolean value for "true OR false AND false", which is true.
        System.out.println(""); // Outputs a blank line.
        System.out.print("true OR false AND NOT true  -  "); // Outputs boolean string for user.
        System.out.print(true || false && !true ); // Outputs boolean value for "true OR false AND NOT true", which is true.
        System.out.println(""); // Outputs a blank line.
        System.out.print("true AND NOT false OR false AND NOT true  -  "); // Outputs boolean string for user.
        System.out.print(true && !false || false && !true ); // Outputs boolean value for "true AND NOT false OR false AND NOT ture", which is true,
        System.out.println(""); // Outputs a blank line.
        System.out.print("true AND NOT false AND false AND NOT true  -  "); // Outputs boolean string for user.
        System.out.print(true && !false && false && !true ); // Outputs boolean value for "true AND NOT false AND false AND NOT ture", which is false,
        System.out.println(""); // Outputs a blank line.
    }
}
