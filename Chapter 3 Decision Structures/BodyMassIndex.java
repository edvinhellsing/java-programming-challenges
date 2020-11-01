import java.util.Scanner;

public class BodyMassIndex {
   public static void main(String[] args) {
      double heightInput;
      double weightInput;

      try (Scanner keyboard = new Scanner(System.in); ) {
         System.out.print("Enter your height in inches: ");
         heightInput = keyboard.nextInt();

         System.out.print("Enter your weight in pounds: ");
         weightInput = keyboard.nextInt();

         double heightInputE2 = Math.pow(heightInput, 2);
         double BMI = (weightInput * 703) / heightInputE2;

         if (BMI > 18.5 && BMI < 25.0) {
            System.out.print ("You have optimal weight.");
         }
         else if (BMI < 18.5) {
            System.out.print ("You are considered underweight.");
         }
         else {
            System.out.print ("You are considered overweight.");
         }
      }
   }
}