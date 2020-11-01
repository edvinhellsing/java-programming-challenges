import java.util.Scanner;

public class ShippingChargesClasses {

   public static void main(String[] args) {

      try (Scanner keyboard = new Scanner(System.in)) {
         double shippingInput;
         int distanceInput;

         System.out.print("Enter the enter the weight of a package: ");
         shippingInput = keyboard.nextDouble();

         System.out.print("Enter the enter the distance of a package: ");
         distanceInput = keyboard.nextInt();

         ShippingObject package = new ShippingObject(shippingInput, distanceInput);

         System.out.printf("The shipping charges are $%.2f.", package.calculateCost());
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}

class ShippingObject {
   private double shippingWeight;
   private int distance;

   public ShippingObject(double shippingWeight, int distance) {
       this.shippingWeight = shippingWeight;
       this.distance = distance;
   }

   public double calculateCost() {
       if (this.shippingWeight > 10) {
           return this.distance * 3.80;
        }
        else if(this.shippingWeight > 6) {
           return this.distance * 3.70;
        }
        else if(this.shippingWeight > 2) {
           return this.distance * 2.20;
        }
        else {
           return this.distance * 1.10;
        }
   }

   public double getShippingWeight() {
       return this.shippingWeight;
   }
}