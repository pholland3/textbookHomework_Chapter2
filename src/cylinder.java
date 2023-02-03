/**
 * @Class: Cylinder
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 2 February 2023
 * Description: A program designed to give the base area and volume of a cylinder with user input entering the radius
 * of the circle, and height of the cylinder.
 */

import java.util.Scanner;
public class Cylinder {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Welcome to the cylinder volume and base calculator!");
        System.out.println("This program will calculate cylinder volume and base, with your input.");
        System.out.println("First, please enter the radius of the base of the cylinder: ");
        double cylinderRadius = keyboard.nextDouble();
        System.out.println("CYLINDER RADIUS: " + cylinderRadius);
        System.out.println("Next, please enter the length of the cylinder: ");
        double cylinderHeight = keyboard.nextDouble();
        System.out.println("CYLINDER HEIGHT: " + cylinderHeight);
        System.out.println("Great! Calculating base area of the cylinder: ");
        double cylinderArea = 3.1416 * (cylinderRadius * cylinderRadius);
        System.out.println("The base area of the cylinder is: " + cylinderArea);
        System.out.println("Now, calculating the volume of the cylinder...");
        double cylinderVolume = cylinderArea * cylinderHeight;
        System.out.println("The volume of the cylinder is: " + cylinderVolume);
        System.out.println("Thanks!");
    }
}
