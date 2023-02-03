/**
 * @Class: HoursMinutesSeconds
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 2 February 2023
 * Description: A program designed to determine the number of hours, minutes, and seconds in a number of seconds input
 * by the user when prompted.
 */

import java.util.Scanner;
public class HoursMinutesSeconds {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Hours/Minutes/Seconds program!");
        System.out.println("This program will determine the number of hours, minutes, and seconds in a given amount of seconds.");
        System.out.println("First, please enter the number of seconds you would like to break down: ");
        int totSeconds = keyboard.nextInt();
        System.out.println("Great! You entered: " + totSeconds);
        int numHours = totSeconds/3600;
        System.out.println("Hours: " + numHours);
        totSeconds = totSeconds - (numHours * 3600);
        int numMinutes = totSeconds / 60;
        System.out.println("Minutes: " + numMinutes);
        int numSeconds = totSeconds - (numMinutes * 60);
        System.out.println("Seconds: " + numSeconds);
        System.out.println("So, there are a total of " + numHours + " hours, " + numMinutes + " minutes, and " + numSeconds + " in " + totSeconds + " total seconds.");
        System.out.println("We've got some time on our hands!");
    }
}