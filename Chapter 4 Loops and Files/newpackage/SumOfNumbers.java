/* Write a program that asks the user for a positive nonzero integer value. The program should use a loop to get the sum of all the integers from 1 up to the number entered. For example, if the user enters 50, the loop will find the sum of 1, 2, 3, 4, . . . 50. */

package newpackage;

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