/*******************************************
*Road Trip Calculator by Art Palmer
*9/3/2020
*
********************************************/

import java.util.Scanner;

public class RoadTripCalc
{

   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
   
      //values
      String name = "";
      double miles = 0;
      double speedLimit = 0;
      double mph = 0;
      double total;
          
      //input
      System.out.println("Please enter your destination:");
      name = input.nextLine();
      
      System.out.println("How many miles is it to " + name + "?");
      miles = input.nextDouble();
      
      System.out.println("What is the speed limit?");
      speedLimit = input.nextDouble();
      
      System.out.println("How fast do you plan on driving over the speed limit (in mph)?:");
      mph = input.nextDouble();
      
      //math
      total = (double) ((miles / speedLimit) - (miles / (speedLimit + mph))) * 60;
            
      //total
      System.out.println("You will arrive in " + name + " " + total + " minutes faster \nby driving " + mph + " over the speed limit.");
       
   }

}