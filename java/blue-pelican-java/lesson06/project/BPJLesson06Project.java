//Program Name: Blue Pelican Java Lesson 06 (Project)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016

public class BPJLesson06Project {
    public static void main(String args[]){
        // ** d1 = 3πsin(187°) + |cos(122°)| **
        double radianConversion1 = Math.toRadians(187);
        double sinCalculation = Math.sin(radianConversion1);
        double radianConversion2 = Math.toRadians(122);
        double cosCalculation1 = Math.cos(radianConversion2);
        double cosCalculation2 = Math.abs(cosCalculation1);
        double d1 = 3 * Math.PI * sinCalculation + cosCalculation2;
        System.out.println("d1 = " + d1); 
        // d2 = ** (14.72)^3.801 + ln 72 **
        double v1 = 14.72, v2 = 3.801, v3 = 72;
        double expo = Math.pow(v1, v2);
        double baseE = Math.log(v3);
        double d2 = expo + baseE;
        System.out.println("d2 = " + d2);
    }
}
