import java.util.Scanner;

public class SumOfNumbers {
   public static void main(String[] args) {

      int numberInput;
      int numberTotal = 0;

      try (Scanner keyboard = new Scanner(System.in); ) {

         String promtInput = "Enter a positive nonzero integer value: ";
         String invalidInput = "Please enter a POSITIVE nonzero integer value:\n";

         System.out.print(promtInput);
         numberInput = keyboard.nextInt();

         while (numberInput < 1) {
            System.out.print(invalidInput);
            System.out.print(promtInput);
            numberInput = keyboard.nextInt();
         }

         System.out.print("The sum of all the integers from 1 up to " + numberInput + " is: ");

         for(int i = 1; i <= numberInput; i++) {
            numberTotal += i;
         }
         System.out.print(numberTotal + ".");
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}