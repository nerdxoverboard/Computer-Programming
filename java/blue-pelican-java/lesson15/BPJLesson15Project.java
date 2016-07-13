//Program Name: Blue Pelican Java Lesson 15 (File 1 of 2)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

import java.io.*;
import java.util.*;

public class BPJLesson15Project {
    public static void main(String args[]){
        System.out.println("Enter the initial account balance.");
        Scanner kb = new Scanner(System.in);
        double b = kb.nextDouble();
        System.out.println("Enter the account holder name.");
        Scanner kb2 = new Scanner(System.in);
        String n = kb2.nextLine();
        BankAccount myAccount = new BankAccount(b, n);
        myAccount.deposit(505.22);
        myAccount.withdraw(100);
        System.out.println("The " + myAccount.name + " account balance is $" + myAccount.balance);
    }
}
