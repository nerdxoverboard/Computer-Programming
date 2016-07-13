//Program Name: Blue Pelican Java Lesson 15 (File 2 of 2)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

public class BankAccount{
    public double balance;
    public String name;
    
    public BankAccount (double b, String n)
    {
        balance = b;
        name = n;
    }
    public void deposit (double d)
    {
        balance += d;
    }
    public void withdraw (double w)
    {
        balance -= w;
    }
}
