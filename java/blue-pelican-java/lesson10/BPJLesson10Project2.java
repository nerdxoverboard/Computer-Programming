//Program Name: Blue Pelican Java Lesson 10 (Project #2)
//Programmer Name: Eric Evans, M.Ed.
//Programmer Organization: Ferris High School
//Program Date: Fall 2016
 
import java.io.*;
import java.util.*;
 
public class BPJLesson10Project2 {
    public static void main(String args[]){
        System.out.println("********************************");
        System.out.println("** Enter Your Weight on Earth **");
        System.out.println("********************************");
        System.out.println("Weight in pounds? _");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
 
        System.out.println("**************************");
        System.out.println("** Please Select Planet **");
        System.out.println("**************************");
        System.out.println("** 1. Voltar            **");
        System.out.println("** 2. Krypton           **");
        System.out.println("** 3. Fertos            **");
        System.out.println("** 4. Servontos         **");
        System.out.println("**************************");
        System.out.println("**************************");
        System.out.println("Your Choice? _");
 
        int choice = input.nextInt();
 
        switch (choice){
            case 1:
                double weightVoltar = weight * 0.091;
                System.out.println("Your weight of " + weight + " lbs on Earth would be " + weightVoltar + " lbs on Voltar");
                break;
            case 2:
                double weightKrypton = weight * 0.720;
                System.out.println("Your weight of " + weight + " lbs on Earth would be " + weightKrypton + " lbs on Krypton");
                break;
            case 3:
                double weightFertos = weight * 0.865;
                System.out.println("Your weight of " + weight + " lbs on Earth would be " + weightFertos + " lbs on Fertos");
                break;
            case 4:
                double weightServontos = weight * 4.612;
                System.out.println("Your weight of " + weight + " lbs on Earth would be " + weightServontos + " lbs on Servontos");
                break;
            default:
                System.out.println("Invalid Menu Selection Made. Please Rerun Program.");
        }
    }
}
