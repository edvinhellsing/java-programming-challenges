import java.util.Scanner;

public class TestScoresAndGrade {
   public static void main(String[] args) {

      int testScore1Input;
      int testScore2Input;
      int testScore3Input;
      double testScore;

      try (Scanner keyboard = new Scanner(System.in); ) {
         System.out.print("Enter the first of three testscores: ");
         testScore1Input = keyboard.nextInt();

         System.out.print("Enter the second of three testscores: ");
         testScore2Input = keyboard.nextInt();

         System.out.print("Enter the third of three testscores: ");
         testScore3Input = keyboard.nextInt();

         testScore = (testScore1Input + testScore2Input + testScore3Input) / 3;

         if (testScore < 60) {
            System.out.print("Your average testscore is: " + testScore + ", your grade is F.");
         }
         else if (testScore < 70) {
            System.out.print("Your average testscore is: " + testScore + ", your grade is D.");
         }
         else if (testScore < 80) {
            System.out.print("Your average testscore is: " + testScore + ", your grade is C.");
         }
         else if (testScore < 90) {
            System.out.print("Your average testscore is: " + testScore + ", your grade is B.");
         }
         else {
            System.out.print("Your average testscore is: " + testScore + ", your grade is A.");
         }
      }
   }
}