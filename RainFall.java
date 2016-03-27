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

    double annualAverage = 0.0, sum = 0.0, difference = 0.0;

    String[] months = {"January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"};

    double[] rainFall = new double[12];
    //double[] rainfall = new double[12];
    double[] quarterAverage = new double[4];

    /**
     * Constructor copies the elements in an array to the rainFall Array
       *
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
     * @return The average of the
     * elements in the rainFall array
    */
    public double getAverage() {
        return getTotal() / rainFall.length;
    }
    
     /**
     * getHighest method
     * @return The the highest values
     stored in the rainFAll array
    */
    
     public double getHighest() {
     double highest = rainFall[0];
         
         for (int index = 1; index < rainFall.length; index++) 
         {
             if(rainFall[index]> highest)
                 highest = rainFall[index];
         }
        return highest ;
     }
     
      /**
     * getLowest method
     * @return The the lowest values
     stored in the rainFAll array
    */
     
      public double getLowest() {
     double lowest = rainFall[0];
         
         for (int index = 1; index < rainFall.length; index++) 
         {
             if(rainFall[index]> lowest)
                lowest = rainFall[index];
         }
        return lowest ;
     }
      
      
      
}    




   
