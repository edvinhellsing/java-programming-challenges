import java.util.Scanner;

public class ShippingCharges {
   public static void main(String[] args) {

      int weightInput;
      double distanceInput = 0.0;
      double distanceExtras;
      double lessTwo = 1.1;
      double overTwoToSix = 2.2;
      double overSixtoTen = 3.7;
      double overTen = 3.8;

      try (Scanner keyboard = new Scanner(System.in); ) {

         System.out.print("Enter the enter the weight (in pounds) of a package: ");
         weightInput = keyboard.nextInt();

         System.out.print("Enter the enter the distance (in miles) of a package: ");
         distanceInput = keyboard.nextDouble();

         distanceExtras = distanceInput / 500;
         distanceExtras = Math.ceil(distanceExtras);

         if (weightInput > 10) {
            System.out.printf("The shipping charge is $%.2f.", (overTen * distanceExtras));
         }
         else if (weightInput > 6) {
            System.out.printf("The shipping charge is $%.2f.", (overSixtoTen * distanceExtras));
         }
         else if (weightInput > 2) {
            System.out.printf("The shipping charge is $%.2f.", (overTwoToSix * distanceExtras));
         }
         else {
            System.out.printf("The shipping charge is $%.2f.", (lessTwo * distanceExtras));
         }
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}