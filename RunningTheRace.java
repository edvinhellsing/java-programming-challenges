import java.util.Scanner;

public class RunningTheRace {
   public static void main(String[] args) {
      
      String runnerName1;
      String runnerName2;
      String runnerName3;
      int runnerTime1;
      int runnerTime2;
      int runnerTime3;

      try (Scanner keyboard = new Scanner(System.in); ) {

         System.out.print("Enter the name of runner no.1: ");
         runnerName1 = keyboard.nextLine();
         System.out.print("Enter the time of runner no.1: ");
         runnerTime1 = keyboard.nextInt();

         System.out.print("Enter the name of runner no.2: ");
         runnerName2 = keyboard.nextLine();
         runnerName2 = keyboard.nextLine();
         System.out.print("Enter the time of runner no.2: ");
         runnerTime2 = keyboard.nextInt();

         System.out.print("Enter the name of runner no.3: ");
         runnerName3 = keyboard.nextLine();
         runnerName3 = keyboard.nextLine();
         System.out.print("Enter the time of runner no.3: ");
         runnerTime3 = keyboard.nextInt();

         if (runnerTime1 < runnerTime2 && runnerTime1 < runnerTime3) {
            if (runnerTime2 < runnerTime3) {
               System.out.println("Result list:"+"\n"+runnerName1+"\n"+runnerName2+"\n"+runnerName3);
            }
            else {
               System.out.println("Result list:"+"\n"+runnerName1+"\n"+runnerName3+"\n"+runnerName2);
            }
         }
         if (runnerTime2 < runnerTime1 && runnerTime2 < runnerTime3) {
            if (runnerTime1 < runnerTime3) {
               System.out.println("Result list:"+"\n"+runnerName2+"\n"+runnerName1+"\n"+runnerName3);
            }
            else {
               System.out.println("Result list:"+"\n"+runnerName2+"\n"+runnerName3+"\n"+runnerName1);
            }
         }
         if (runnerTime3 < runnerTime1 && runnerTime3 < runnerTime2) {
            if (runnerTime1 < runnerTime2) {
               System.out.println("Result list:"+"\n"+runnerName3+"\n"+runnerName1+"\n"+runnerName2);
            }
            else {
               System.out.println("Result list:"+"\n"+runnerName3+"\n"+runnerName2+"\n"+runnerName1);
            }
         }
      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}