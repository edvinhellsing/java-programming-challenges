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