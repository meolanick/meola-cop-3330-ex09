/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int width;
        int length;
        System.out.println( "What is the width of the room in square feet?" );
        width = scan.nextInt();
        System.out.println("What is the length of the room in square feet?");
        length = scan.nextInt();

        int area = length * width;
        System.out.println("The area of the room is " + area + " square feet.");

        double Square_feet_per_Gallon = 350;
        int gallons = (int)Math.ceil( area / Square_feet_per_Gallon );
        System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " + area + " square feet." );

    }
}

