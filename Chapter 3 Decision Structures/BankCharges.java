import java.util.Scanner;

public class BankCharges {
   public static void main(String[] args) {

      int baseFee = 10;
      
      int checksInput;
      double serviceFees;

      double checkFee1 = 0.10;
      double checkFee2 = 0.08;
      double checkFee3 = 0.06;
      double checkFee4 = 0.04;

      try (Scanner keyboard = new Scanner(System.in); ) {

         System.out.print("Enter the number of checks written for the month: ");
         checksInput = keyboard.nextInt();

         double checkFee = 0;
         int n;

         for(n = 1; n <= checksInput; n++) {
            if(n<15) {
               checkFee = checkFee + checkFee1;
            }
            else if(n<=29) {
               checkFee = checkFee + checkFee2;
            }
            else if(n<=49) {
               checkFee = checkFee + checkFee3;
            }
            else {
               checkFee = checkFee + checkFee4;
            }
         }

         serviceFees = baseFee + checkFee;

         System.out.printf("The bank’s service fees for the month are $%.2f.", serviceFees);
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}