//Program Name: Blue Pelican Java Lesson 16 (File 2 of 2)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

public class Automobile {
    public double mpg;
    public double gallons = 0;
    
    public Automobile (double a){
        mpg = a;
    }
    
    public void fillUp (double b){
        gallons += b;
    }
    
    public void takeTrip (double c){
        gallons -= c/mpg;
    }
    
    public double reportFuel (){
        return gallons;
    }
}
