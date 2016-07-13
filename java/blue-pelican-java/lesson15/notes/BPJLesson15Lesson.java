//Program Name: Blue Pelican Java Lesson 15 (Lesson - Part 1)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

public class BPJLesson15Lesson {
    public static void main(String args[]){
        Circle cir1 = new Circle(5.1); // Declares a new object named "cir1" using the Circle class with a radius of 5.1.
        Circle cir2 = new Circle(20.6); // Declares a new object named "cir2" using the Circle class with a radius of 20.6.
        Circle cir3 = new Circle(35.5); // Declares a new object named "cir3" using the Circle class with a radius of 35.5.
        System.out.println("Circumference of Circle 1 is " + cir1.circumference() ); // Outputs the circumference of object "cir1" from the Cricle class.
        System.out.println( "Area of Circle 2 is " + cir2.area() ); // Outputs the area of object "cir2" from the Circle class.
        System.out.println("Diameter of Circle 3 is " + cir3.diameter() ); // Outputs the diameter of object "cir3" from the Circle class.
    }
}
