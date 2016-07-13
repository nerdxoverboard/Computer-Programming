//Program Name: Blue Pelican Java Lesson 16 (File 1 of 2)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

public class BPJLesson16Project {
    public static void main(String args[]){
        Automobile myBmw = new Automobile(24);
        myBmw.fillUp(20);
        myBmw.takeTrip(100);
        double fuel_left = myBmw.reportFuel( );
        System.out.println(fuel_left);
    }
}
