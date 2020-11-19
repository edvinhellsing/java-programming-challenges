/* The distance a vehicle travels can be calculated as follows: Distance 5 Speed * Time. For example, if a train travels 40 miles-per-hour for three hours, the distance traveled is 120 miles. Write a program that asks for the speed of a vehicle (in miles-per-hour) and the number of hours it has traveled. It should use a loop to display the distance a vehicle has traveled for each hour of a time period specified by the user. For example, if a vehicle is traveling at 40 mph for a three-hour time period, it should display a report similar to the one that follows:
Hour     Distance Traveled
--------------------------
1              40
2              80
3              120
Input Validation: Do not accept a negative number for speed and do not accept any value less than 1 for time traveled. */

package newpackage;

import java.util.Scanner;

public class DistanceTraveled {
   public static void main(String[] args) {

      try (Scanner keyboard = new Scanner(System.in); ) {

         int speedInput;
         int hoursInput;
         int distance;
         int traveledDistance;

         String promptSpeedInput = "Enter the speed (in miles-per-hour) of a vehicle: ";
         String invalidSpeedInput = "That's a negative number. " + promptSpeedInput;

         System.out.print(promptSpeedInput);
         speedInput = keyboard.nextInt();

         while (speedInput < 0) {
            System.out.print(invalidSpeedInput);
            speedInput = keyboard.nextInt();
         }

         String promptHoursInput = "Enter the number of hours it has traveled: ";
         String invalidHoursInput = "That's a number less than one. " + promptHoursInput;

         System.out.print(promptHoursInput);
         hoursInput = keyboard.nextInt();
         
         while (hoursInput < 1) {
            System.out.print(invalidHoursInput);
            hoursInput = keyboard.nextInt();
         }

         distance = speedInput * hoursInput;

         System.out.println("Hour \t Distance Traveled");
         System.out.println("--------------------------");

         for(int i = 1; i <= hoursInput; i++) {
            traveledDistance = distance / hoursInput * i;
            System.out.println(i + "\t\t" + traveledDistance);
         }
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}