import java.util.Scanner;

public class BookClubPoints {
   public static void main(String[] args) {

      int booksInput;
      int points;

      try (Scanner keyboard = new Scanner(System.in); ) {

         System.out.print("Enter the number of books you have purchased at Serendipity Booksellers this month: ");
         booksInput = keyboard.nextInt();

         if(booksInput >= 4) {
            points = 60;
         }
         else if(booksInput >= 3) {
            points = 30;
         }
         else if(booksInput >= 2) {
            points = 15;
         }
         else if(booksInput >= 1) {
            points = 5;
         }
         else {
            points = 0;
         }

         if(booksInput >= 1) {
            System.out.printf("You have purchased " + booksInput + " books at Serendipity Booksellers this month, that gives you " + points + " points, congrats!");
         }
         else if (booksInput < 0) {
            System.out.printf("Invalid input, you cannot purchase a negative number of books.");
         }
         else {
            System.out.printf("You haven't purchased any books at Serendipity Booksellers this month, that gives you " + points + " points. Go purchase some book next month to earn yourself some points.");
         }
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}