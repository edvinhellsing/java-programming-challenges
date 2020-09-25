import java.util.Scanner;

public class RomanNumerals {
   public static void main(String[] args) {
      int numberInput;

      try (Scanner keyboard = new Scanner(System.in); ) {

         System.out.print("Enter a number between 1-10: ");
         numberInput = keyboard.nextInt();

         if (numberInput < 0 || numberInput > 10) {
            System.out.println("That's not a number");
         }
         else {
            String RomanNumArr[] = {"I", "II", "IIV", "IV", "V", "VI", "VII", "IIX", "IX", "X"};
            System.out.println("You entered " + String.valueOf(numberInput) + ", that's " + RomanNumArr[numberInput - 1] + " in roman numbers.");
         }
      }

         catch(Exception e) {
            System.out.println(e);
         }
      
   }
}