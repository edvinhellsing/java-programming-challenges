/* Write a program that calculates the amount a person would earn over a period of time if his or her salary is one penny the first day, two pennies the second day, and continues to double each day. The program should display a table showing the salary for each day, and then show the total pay at the end of the period. The output should be displayed in a dollar amount, not the number of pennies. Input Validation: Do not accept a number less than 1 for the number of days worked. */

package newpackage;

import java.util.Scanner;

public class PenniesForPay {
   public static void main(String[] args) {

      try (Scanner keyboard = new Scanner(System.in); ) {

         int daysWorkedInput;
         
         String promptDaysWorkedInput = "Enter number of days worked: ";
         String invalidDaysWorkedInput = "Minimum of one (1) day. " + promptDaysWorkedInput;

         System.out.print(promptDaysWorkedInput);
         daysWorkedInput = keyboard.nextInt();

         while (daysWorkedInput < 1) {
            System.out.print(invalidDaysWorkedInput);
            daysWorkedInput = keyboard.nextInt();
         }

         System.out.println("Number of days \t Sallary (in USD)");
         System.out.println("---------------------------------");

         double totalSalary = 0;
         String salaryString = "Total salary: ";

         for(int i = 0; i < daysWorkedInput; i++) {
            int day = i + 1;
            double daySalary = Math.pow(2, i) / 100;
            totalSalary = totalSalary + daySalary;
            System.out.printf("%-17d$%,.2f\n", day, daySalary);
         }
         System.out.printf("\n%-17s$%,.2f\n", salaryString, totalSalary);
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}