/**
 * @Class: PaintCalculator
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 2 February 2023
 * Description: A program designed to determine the amount of paint in gallons and quarts required to paint an entire room. The program
 * will ask the user to input the length, width, and height of the walls in the room, as well as to enter the number of windows and doors
 * in the room. The program will then determine the amount of space in the room required that will need paint, and break that down into
 * the amount of paint in gallons and quarts required to do the job.
 */

import java.util.Scanner;
public class PaintCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the paint calculator program!");
        System.out.println("This program will determine the amount of paint in gallons and quarts required to paint a room.");
        System.out.println("Please enter the following values in feet.");
        System.out.println("First, please enter the length of the room you are painting.");
        int roomLength = keyboard.nextInt();
        System.out.println("Next, please enter the width of the room you are painting.");
        int roomWidth = keyboard.nextInt();
        System.out.println("Next, please enter the height of the room you are painting.");
        int roomHeight = keyboard.nextInt();
        System.out.println("Great! You have entered the following:");
        System.out.println("Room length: " + roomLength);
        System.out.println("Room width: " + roomWidth);
        System.out.println("Room height:" + roomHeight);
        System.out.println("How many doors are there in the room?");
        int numDoors = keyboard.nextInt();
        System.out.println("How many windows are there in the room?");
        int numWindows = keyboard.nextInt();
        System.out.println("Great. Let's determine how much wall space will need to be painted.");
        System.out.println("First, we will calculate the first wall:");
        int firstWall = roomLength * roomHeight;
        System.out.println("The area of the first wall is: " + firstWall + " feet.");
        System.out.println("Great. Let's assume there are two walls that fit these exact dimensions.");
        System.out.println("Next, we will calculate the third wall:");
        int thirdWall = roomWidth * roomHeight;
        System.out.println("The area of the third wall is: " + thirdWall + " feet.");
        System.out.println("Great. Let's assume there are two walls that fit these exact dimensions.");
        System.out.println("Also, we have to paint the ceiling, so let's calculate how much space that is.");
        int ceilingSpace = roomLength * roomWidth;
        System.out.println("Now, let's determine how much space is taken up by doors or windows.");
        System.out.println("Let's assume each door is 21 square feet, and each window is 15 square feet.");
        int doorSpace = numDoors * 21;
        int windowSpace = numWindows * 15;
        System.out.println("So, our doors take up " + doorSpace + " square feet of space.");
        System.out.println("And, our doors take up " + windowSpace + " square feet of space.");
        System.out.println("Now, let's calculate how much space we are dealing with exactly.");
        System.out.println("We have TWO walls that are " + firstWall + " square feet.");
        System.out.println("We have TWO walls that are " + thirdWall + " square feet.");
        System.out.println("Our ceiling is " + ceilingSpace + " square feet.");
        int totalArea = (firstWall * 2) + (thirdWall * 2) + ceilingSpace;
        System.out.println("So, given this information, we have a total of " + totalArea + " space to paint.");
        System.out.println("But we have to consider the space of the doors and windows, too!");
        totalArea = totalArea - doorSpace - windowSpace;
        System.out.println("Once you take away the required space for each door and window, that leaves us with " + totalArea + " square feet to paint.");
        System.out.println("So, if you consider that each gallon of paint will cover approximately 350 square feet of space...");
        int paintGallons = totalArea / 350;
        double leftoverArea = totalArea - (paintGallons * 350);
        System.out.println("You will need " + paintGallons + " gallons of paint.");
        System.out.println("That leaves us with " + leftoverArea + " square feet left to paint.");
        double paintQuarts = leftoverArea / 88;
        System.out.println("You will need " + paintQuarts + " quarts of paint.");
    }
}


