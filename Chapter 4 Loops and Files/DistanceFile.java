import java.util.Scanner;
import java.io.*;

public class DistanceFile {
   public static void main(String[] args) throws IOException {

      PrintWriter outputFile = new PrintWriter("DistanceReport.txt");

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

         outputFile.println("Hour \t Distance Traveled");
         outputFile.println("--------------------------");

         for(int i = 1; i <= hoursInput; i++) {
            traveledDistance = distance / hoursInput * i;
            outputFile.println(i + "\t\t" + traveledDistance);
         }

         outputFile.close();
         System.out.println("Data has been saved to file.");
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}