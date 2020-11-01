import java.util.Scanner;

public class SoftwareSales {
   public static void main(String[] args) {

      int retailPrice = 99;
      int numberOfPackagesInput;
      double totalPurchase;
      double discount;

      try (Scanner keyboard = new Scanner(System.in); ) {

         System.out.print("Enter the number of packages purchased: ");
         numberOfPackagesInput = keyboard.nextInt();

         if(numberOfPackagesInput>=100) {
            discount = (numberOfPackagesInput * retailPrice) * 0.5;
         }
         else if(numberOfPackagesInput>=50) {
            discount = (numberOfPackagesInput * retailPrice) * 0.4;
         }
         else if(numberOfPackagesInput>=20) {
            discount = (numberOfPackagesInput * retailPrice) * 0.3;
         }
         else if(numberOfPackagesInput>=10) {
            discount = (numberOfPackagesInput * retailPrice) * 0.2;
         }
         else {
            discount = 0;
         }

         totalPurchase = (numberOfPackagesInput * retailPrice) - discount;

         System.out.printf("The total amount of the purchase are $%.2f.\n", totalPurchase);
         
         if(discount>0) {
            System.out.printf("The amount of discount are $%.2f.", discount);
         }
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}