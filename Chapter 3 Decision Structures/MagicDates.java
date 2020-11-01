import java.util.Scanner;

public class MagicDates {
   public static void main(String[] args) {
      int monthInput;
      int dayInput;
      int yearInput;

      try (Scanner keyboard = new Scanner(System.in); ) {

         System.out.print("Enter a month, e.g 6: ");
         monthInput = keyboard.nextInt();

         System.out.print("Enter a day, e.g 10: ");
         dayInput = keyboard.nextInt();

         System.out.print("Enter a year, e.g 20: ");
         yearInput = keyboard.nextInt();

         if (monthInput * dayInput == yearInput) {
            System.out.print ("The date you entered is magic");
         }
         else {
            System.out.print ("The date you entered isn't magic.");
         }
      }
   }
}
