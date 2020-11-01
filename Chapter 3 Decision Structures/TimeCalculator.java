import java.util.Scanner;

public class TimeCalculator {
   public static void main( String[] args) {
      
      int numberInput;

      try (Scanner keyboard = new Scanner(System.in); ) {
         System.out.print("Enter a number of seconds: ");
         numberInput = keyboard.nextInt();

         if (numberInput >= 86400) {
            System.out.print("There is " + (numberInput / 86400) + " days in " + numberInput + " seconds.");
         }
         else if (numberInput >= 3600) {
            System.out.print("There is " + (numberInput / 3600) + " hours in " + numberInput + " seconds.");
         }
         else if (numberInput >= 60) {
            System.out.print("There is " + (numberInput / 60) + " minutes in " + numberInput + " seconds.");
         }
         else {
            System.out.print("That is " + numberInput + " seconds.");
         }
      }
      catch(Exception e) {
         System.out.println(e);
      }
   }
}