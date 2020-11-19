/* Write a program that asks the user to enter a string, and then asks the user to enter a character. The program should count and display the number of times that the specified character appears in the string. */

package newpackage;

import java.util.Scanner;

public class LetterCounter {
   public static void main(String[] args) {

      try (Scanner keyboard = new Scanner(System.in); ) {

         String stringInput;
         String string;
         String characterInput;
         String characterString;

         char character;
         int counter = 0;

         String promptStringInput = "Enter a string: ";

         System.out.print(promptStringInput);
         stringInput = keyboard.nextLine();
         string = stringInput.toUpperCase();

         String promptCharacterInput = "Enter a character: ";

         System.out.print(promptCharacterInput);
         characterInput = keyboard.nextLine();
         characterString = characterInput.toUpperCase();
         character = characterString.charAt(0);

         System.out.println("The string entered was: " + "'" + stringInput + "'" + ".");
         System.out.println("The character entered was: " + "'" + characterInput + "'" + ".");

         for (int i = 0; i < string.length(); i ++) {
            if (string.charAt(i) == character) {
               counter ++;
            }
         }
         if (counter != 1) {
            System.out.println("The string " + "'" + string + "'" + " contains the character: " + character + " " + counter + " times.");
         }
         else {
            System.out.println("The string " + "'" + string + "'" + " contains the character " + "'" + character + "' " + counter + " time.");
         }
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}