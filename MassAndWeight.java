import java.util.Scanner;

public class MassAndWeight {
   public static void main(String[] args) {
      double massInput;

      try (Scanner keyboard = new Scanner(System.in); ) {

         System.out.print("Enter an object's mass: ");
         massInput = keyboard.nextDouble();

         double weight = massInput * 9.8;

         if (massInput > 10 && massInput < 1000) {
            System.out.printf("The weight is: %.2f N.\n", weight);
         }
         else if (massInput < 10) {
            System.out.println("The weight you entered is too low.");
         }
         else {
            System.out.println("The weight you entered is too high.");
         }
      }

      catch(Exception e) {
         System.out.println(e);
      }

   }
}