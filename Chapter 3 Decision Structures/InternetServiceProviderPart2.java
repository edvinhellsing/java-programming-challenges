import java.util.Scanner;

public class InternetServiceProviderPart2 {
   public static void main(String[] args) {

      char choise;
      int hours;

      double packageA = 9.95;
      double packageB = 13.95;
      double packageC = 19.95;

      try (Scanner keyboard = new Scanner(System.in); ) {
         String promtPackage = "Enter your choice of package (A, B or C): ";
         String invalidInput = "Invalid input. Please try again.\n";
         
         String packageInput, A = "A", B = "B", C = "C";

         System.out.print(promtPackage);
         packageInput = keyboard.nextLine();
         

         while (!(packageInput.equalsIgnoreCase(A) || packageInput.equalsIgnoreCase(B) || packageInput.equalsIgnoreCase(C))) {
            System.out.print(invalidInput);
            System.out.print(promtPackage);
            packageInput = keyboard.nextLine();
         }
         
         System.out.print("Enter the amount of hours used for the month: ");
         hours = keyboard.nextInt();

         double costPackageA = packageA + (((hours - 10) * 2));
         double costPackageB = packageB + (((hours - 20) * 1));

         packageInput = packageInput.toUpperCase();
         choise = packageInput.charAt(0);

         switch (choise) {
            case 'A':
               if (hours > 10) {
                  System.out.printf("Your package total cost is $%.2f on the monthly bill.", costPackageA);
                  if ((costPackageA - costPackageB) > 0) {
                     System.out.printf("\nIf you switched from package A to package B, you would save $%.2f.", (costPackageA - costPackageB));
                  }
                  if ((costPackageA - packageC) > 0) {
                     System.out.printf("\nIf you switched from package A to package C, you would save $%.2f.", (costPackageA - packageC));
                  }
               }
               else {
                  System.out.printf("Your package total cost is $" + packageA + " on the monthly bill.");
               }
               break;
            case 'B':
               if (hours > 20) {
                  System.out.printf("Your package total cost is $%.2f on the monthly bill.", costPackageB);
                  if ((costPackageB - packageC) > 0) {
                     System.out.printf("\nIf you switched from package A to package B, you would save $%.2f.", (costPackageB - packageC));
                  }
               }
               else {
                  System.out.printf("Your package total cost is $" + packageB + " on the monthly bill.");
               }
               break;
            case 'C':
               System.out.printf("Your package total cost is $" + packageC + " on the monthly bill.");
               break;
            default:
               System.out.printf("Invalid input.");
         }
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}