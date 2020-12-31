/* Write a program that calculates the occupancy rate for each floor of a hotel. The program should start by asking for the number of floors in the hotel. A loop should then iterate once for each floor. During each iteration, the loop should ask the user for the number of rooms on the floor and the number of them that are occupied. After all the iterations, the program should display the number of rooms the hotel has, the number of them that are occupied, the number that are vacant, and the occupancy rate for the hotel.

Input Validation: Do not accept a value less than 1 for the number of floors. Do not accept a number less than 10 for the number of rooms on a floor.

A hotel’s occupancy rate is calculated as follows:
Occupancy rate = 5 Number of rooms occupied / Total number of rooms */

package newpackage;

import java.util.Scanner;
import java.io.*;

public class HotelOccupancy {
   static Scanner keyboard = new Scanner(System.in);

   public static void main(String[] args) throws IOException {
      try {

         int numberOfFloors;
         int roomsOnFloor;
         int occupiedRoomsOnFloor;
         int totalRooms = 0;
         int totalOccupiedRooms = 0;

         String promptNumberMessage = "Please enter the number ";
         String promptHotelMessage = " on the hotel ";
         String invalidInputMessage = "Invalid input. " + promptNumberMessage;

         System.out.print(promptNumberMessage + "of floors" + promptHotelMessage + "(with an integer (at least 1)): ");
         numberOfFloors = keyboard.nextInt();

         while (numberOfFloors < 1) {
            System.out.print(invalidInputMessage + "of floors" + promptHotelMessage + "(with an integer): ");
            numberOfFloors = keyboard.nextInt();
         }
      
         for (int i = 1; i <= numberOfFloors; i++) {
            System.out.print(promptNumberMessage + "of rooms on floor " + i + promptHotelMessage + "(with an integer (at least 10)): ");
            roomsOnFloor = keyboard.nextInt();

            while (roomsOnFloor < 10) {
               System.out.print(invalidInputMessage + "of rooms on floor " + i + promptHotelMessage + "(with an integer): ");
               roomsOnFloor = keyboard.nextInt();
            }

            System.out.print(promptNumberMessage + "of occupied rooms on floor " + i + promptHotelMessage + "(with an integer): ");
            occupiedRoomsOnFloor = keyboard.nextInt();

            while (occupiedRoomsOnFloor > roomsOnFloor) {
               System.out.print(invalidInputMessage + "of occupied rooms on floor " + i + promptHotelMessage + "(with an integer): ");
               occupiedRoomsOnFloor = keyboard.nextInt();
            }

            totalRooms += roomsOnFloor;
            totalOccupiedRooms += occupiedRoomsOnFloor;
         }
         
         int totalVacantRooms;
         double occupancyRate;

         totalVacantRooms = totalRooms - totalOccupiedRooms;
         occupancyRate = 100 * ((double)(totalOccupiedRooms) / (double)(totalRooms));

         /* After all the iterations, the program should display the number of rooms the hotel has, the number of them that are occupied, the number that are vacant, and the occupancy rate for the hotel. */

         String totalNumbermessage = "The total number of ";
         String totalHotelmessage = " on the hotel are: ";

         System.out.println("--------------------------------------------------------");
         System.out.println(totalNumbermessage + "rooms" + totalHotelmessage + totalRooms + ".");
         System.out.println(totalNumbermessage + "occupied rooms" + totalHotelmessage + totalOccupiedRooms + ".");
         System.out.println(totalNumbermessage + "vacant rooms" + totalHotelmessage + totalVacantRooms + ".");
         System.out.println("The occupancy rate" + totalHotelmessage + occupancyRate + " procent.\n");

      }
      catch(Exception e) {
         System.out.println(e);
      }
   }
}