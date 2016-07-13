//Program Name: Blue Pelican Java Lesson 15 (Lesson - Part 2)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

public class Circle{
    public Circle(double r)
    {
        radius = r;
    }
    public double area()
    {
        double a = Math.PI * radius * radius;
        return a;
    }
    public double circumference()
    {
        double c = 2 * Math.PI * radius;
        return c;
    }
    public double radius;
}
