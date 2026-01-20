/**
 *  Java program to print random messages for fortune cookies from 1 to 10.
 */

package com.mycookies;

import java.util.Random;

/**
 *  Main class.
 */
public class Fortune {

    // Method to generate random numbers from 1 to 10.
    public int generateNumber() {

        return (int) (Math.random() * 10 + 1);
    }

    // Main method to run java program.
    public static void main(String[] args) {

        //Creating instance of Fortune.
        Fortune fortuneCookie = new Fortune();

        // Calling method generateNumber() to get a number.
        int fortune = fortuneCookie.generateNumber();

        if (fortune == 1) {

            System.out.println("Don't behave with cold manners.");

        } else if (fortune == 2) {

            System.out.println("Your lucky day for shopping.");

        } else if (fortune == 3) {

            System.out.println("Take more rest.");

        } else if (fortune == 4) {

            System.out.println("Cooking is definitely your trait.");

        } else if (fortune == 5) {

            System.out.println("Nothing better than catnapping.");

        } else if (fortune == 6) {

            System.out.println("Don't worry. Be happy.");

        } else if (fortune == 7) {

            System.out.println("Soon your dream comes true.");

        } else if (fortune == 8) {

            System.out.println("Walking is always a good idea.");

        } else if (fortune == 9) {

            System.out.println("Sleeping to recover.");

        } else if (fortune == 10) {

            System.out.println("The fortune you seek is in another cookie.");

        }
    }
}