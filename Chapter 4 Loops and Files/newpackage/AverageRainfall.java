/* Write a program that uses nested loops to collect data and calculate the average rainfall over a period of years. First the program should ask for the number of years. The outer loop will iterate once for each year. The inner loop will iterate 12 times, once for each month. Each iteration of the inner loop will ask the user for the inches of rainfall for that month. After all iterations, the program should display the number of months, the total inches of rainfall, and the average rainfall per month for the entire period.

Input Validation: Do not accept a number less than 1 for the number of years. Do not accept negative numbers for the monthly rainfall. */

package newpackage;

import java.util.Scanner;
import java.io.*;

public class AverageRainfall {
   static Scanner keyboard = new Scanner(System.in);

   public static void main(String[] args) throws IOException {
      try {
         int numberOfYears;
         double monthRainfall;
         double totalRainfall = 0;
         double averageRainfallPerMonth = 0;

         String promptEnterMessage = "Please enter the ";
         String invalidInputMessage = "Invalid input. " + promptEnterMessage;

         System.out.print(promptEnterMessage + "number of years of average rainfall you want to calculate (with an integer (at least 1)): ");
         numberOfYears = keyboard.nextInt();

         while (numberOfYears < 1) {
            System.out.print(invalidInputMessage + "of years of average rainfall you want to calculate (with an integer (at least 1)): ");
            numberOfYears = keyboard.nextInt();
         }

         for (int i = 1; i <= numberOfYears; i++) {
            System.out.println("\n----Year " + i + "----");
            
            for (int y = 1; y <= 12; y++) {
               System.out.print(promptEnterMessage + "inches of rainfall in month " + y + " in year " + i + ": ");
               monthRainfall = keyboard.nextDouble();

               while (monthRainfall < 0) {
                  System.out.print(promptEnterMessage + "inches of rainfall in month " + y + " in year " + i + ": ");
                  monthRainfall = keyboard.nextInt();
               }

               totalRainfall += monthRainfall;
            }
         }

         int totalNumberOfMonths = (numberOfYears * 12);
         averageRainfallPerMonth = totalRainfall / (double)(totalNumberOfMonths);

         System.out.println("\nThe total number of months during the period are " + totalNumberOfMonths + ".");

         String inch = " inch";
         String inches = " inches";

         if(totalRainfall == 1 && averageRainfallPerMonth == 1) {
            System.out.printf("The total amount of rainfall for the peroid is %.2f" + inch + ".", totalRainfall);
            System.out.printf("\nThe average amount of rainfall per month during the entire period is %.2f" + inch + ".\n\n", averageRainfallPerMonth);
         }
         else if (totalRainfall == 1) {
            System.out.printf("The total amount of rainfall for the peroid is %.2f" + inch + ".", totalRainfall);
            System.out.printf("\nThe average amount of rainfall per month during the entire period is %.2f" + inches + ".\n\n", averageRainfallPerMonth);
         }
         else if (averageRainfallPerMonth == 1) {
            System.out.printf("The total amount of rainfall for the peroid is %.2f" + inches + ".", totalRainfall);
            System.out.printf("\nThe average amount of rainfall per month during the entire period is %.2f" + inch + ".\n\n", averageRainfallPerMonth);
         }
         else {
            System.out.printf("The total amount of rainfall for the peroid is %.2f" + inches + ".", totalRainfall);
            System.out.printf("\nThe average amount of rainfall per month during the entire period is %.2f" + inches + ".\n\n", averageRainfallPerMonth);
         }
         
      }
      catch(Exception e) {
         System.out.println(e);
      }
   }
}