/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainfall;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Tutor
 */
public class RainFall {

    Scanner keyboard = new Scanner(System.in);
    static final DecimalFormat df = new DecimalFormat("0.00");

   

    double[] rainFall = new double[12];
    //double[] rainfall = new double[12];
    double[] quarterAverage = new double[4];

    /**
     * Constructor copies the elements in an array to the rainFall Array
     *
     * @param rFall
     */
    public RainFall(double[] rFall) {
        // Coopies elements from rFall to rainFall.
        for (int i = 0; i < rFall.length; i++) {

            rainFall[i] = rFall[i];
        }

    }

    /**
     * getTotal method
     *
     * @return The total of the elements in the rainFall array
     */
    public double getTotal() {
        double total = 0.0;  // Accumulator

        // Accumlate the sum of the 
        //elements in rainFall Array.
        for (int index = 0; index < rainFall.length; index++) {
            total += rainFall[index];
        }
        // Return the total
        return total;
    }

    /**
     * getAverage method
     *
     * @return The average of the elements in the rainFall array
     */
    public double getAverage() {
        return getTotal() / rainFall.length;
    }

    /**
     * getHighest method
     *
     * @return The the highest values stored in the rainFAll array
     */
    public double getHighest() {
        double highest = rainFall[0];

        for (int index = 1; index < rainFall.length; index++) {
            if (rainFall[index] > highest) {
                highest = rainFall[index];
            }
        }
        return highest;
    }

    /**
     * getLowest method
     *
     * @return The the lowest values stored in the rainFAll array
     */
    public double getLowest() {
        double lowest = rainFall[0];

        for (int index = 1; index < rainFall.length; index++) {
            if (rainFall[index] > lowest) {
                lowest = rainFall[index];
            }
        }
        return lowest;
    }

}
