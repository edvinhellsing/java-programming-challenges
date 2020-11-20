/* Write a program that asks the user to enter the name of a file, and then asks the user to enter a character. The program should count and display the number of times that the specified character appears in the file. Use Notepad or another text editor to create a simple file that can be used to test the program. */

package newpackage;

import java.util.Scanner;
import java.io.*;

public class FileLetterCounter {
   public static void main(String[] args) throws IOException {
      try (Scanner keyboard = new Scanner(System.in);) {

         String fileName;
         String userCharInput;
         String charString;
         char character;

         System.out.print("Please enter the name of a file (pro tip: 'testFile.txt'): ");
         fileName = keyboard.nextLine();

         if (!fileName.endsWith(".txt")) {
            fileName = fileName.concat(".txt");
         }

         File file = new File(fileName);

         if (!file.exists()) {
            System.out.print("File doesn't exist.");
            System.exit(0);
         }

         System.out.print("Please enter a character: ");
         userCharInput = keyboard.nextLine();
         charString = userCharInput.toUpperCase();
         character = charString.charAt(0);

         Scanner testFile = new Scanner(file);
         int count = 0;

         String sentenceOrg;
         String sentence;

         while (testFile.hasNext()) {
            sentenceOrg = testFile.nextLine();
            sentence = sentenceOrg.toUpperCase();
            for (int i = 0; i < sentence.length(); i ++) {
               if (sentence.charAt(i) == character) {
                  count ++;
               }
            }
         }

         System.out.println("'" + file + "'" +  " contains " + "'" + character + "' " + count + " times.");

         testFile.close();
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}