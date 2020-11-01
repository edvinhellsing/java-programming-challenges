import java.util.Scanner;

public class InternetServiceProvider {
   public static void main(String[] args) {

      String packageInput;
      char choise;
      int hours;

      double packageA = 9.95;
      double packageB = 13.95;
      double packageC = 19.95;

      try (Scanner keyboard = new Scanner(System.in); ) {

         System.out.print("Enter your choice of package: ");
         packageInput=keyboard.nextLine();

         System.out.print("Enter the amount of hours used: ");
         hours=keyboard.nextInt();   

         packageInput = packageInput.toUpperCase();
         choise = packageInput.charAt(0);

         double costPackageA = packageA + (((hours - 10) * 2));
         double costPackageB = packageB + (((hours - 20) * 1));

         switch (choise) {
            case 'A':
               if (hours > 10) {
                  System.out.printf("Your package total cost is: $%.2f.", costPackageA);
               }
               else {
                  System.out.printf("Your package total cost is $" + packageA + ".");
               }
               break;
            case 'B':
               if (hours > 20) {
                  System.out.printf("Your package total cost is: $%.2f.", costPackageB);
               }
               else {
                  System.out.printf("Your package total cost is $" + packageB + ".");
               }
               break;
            case 'C':
               System.out.printf("Your package total cost is $" + packageC + ".");
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