import java.util.Scanner;

public class FatGramCalculator {
   public static void main(String[] args) {
      double caloriesInput;
      double fatInput;

      try (Scanner keyboard = new Scanner(System.in); ) {

         System.out.print("Enter the number of calories in a food item: ");
         caloriesInput = keyboard.nextDouble();

         System.out.print("Enter the number of fat grams in the same food item: ");
         fatInput = keyboard.nextDouble();

         double fatCalories = (fatInput * 9);
         double percentageOfFatCalories = (fatCalories / caloriesInput);

         if (fatCalories > caloriesInput) {
            System.out.printf("The input is invalid.");
         }
         else {
         System.out.printf("The calories that come from fat in the food item is %.2f percent.", percentageOfFatCalories);
         }

         if (fatCalories < (caloriesInput * .3)) {
            System.out.println(" The food is low in fat.");
         }
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}