import java.util.Scanner;

public class TheSpeedOfSound {
   public static void main(String[] args) {
      String mediumInput;
      int distanceInput;

      try (Scanner keyboard = new Scanner(System.in); ) {
         System.out.print("Enter one of the following mediums (air, water, or steel): ");
         mediumInput = keyboard.nextLine();

         System.out.print("Enter the distance in feet that a sound wave will travel in the medium entered: ");
         distanceInput = keyboard.nextInt();

         double timeInAir = distanceInput / 1100;
         double timeInWater = distanceInput / 4900;
         double timeInSteel = distanceInput / 16400;

         if (mediumInput.equalsIgnoreCase("air")) {
            System.out.printf ("The amount of time it will take for the sound to travel " + distanceInput + " feet in " + mediumInput + " is %.3f seconds.", timeInAir);
         }
         else if (mediumInput.equalsIgnoreCase("water")) {
            System.out.printf ("The amount of time it will take for the sound to travel " + distanceInput + " feet in " + mediumInput + " is %.3f seconds.", timeInWater);
         }
         else if (mediumInput.equalsIgnoreCase("steel")) {
            System.out.printf ("The amount of time it will take for the sound to travel " + distanceInput + " feet in " + mediumInput + " is %.3f seconds.", timeInSteel);
         }
         else {
            System.out.print ("Invalid medium input.");
         }
      }
      
      catch(Exception e) {
         System.out.println(e);
      }
   }
}