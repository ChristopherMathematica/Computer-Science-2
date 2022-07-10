/* Christopher Yonek
   CSC:164-651 - Mr. Ng.
   Programming Exercise 1: Area and Perimeter of Rectangle
   1/18/2020
*/

import java.util.Scanner;

public class rectangleAreaPerimeter{
    public static void main(String args[]) {
       //Create scanner
        Scanner userInput = new Scanner(System.in);
        
      //Get rectangle width
        System.out.println("Please enter the Rectangle Width.");
      Double rectangleWidth = userInput.nextDouble();
      
      //Get rectangle height
              System.out.println("Please enter the Rectangle Height.");
      Double rectangleHeight = userInput.nextDouble();
      
      //Calculations
      Double rectangleArea = rectangleWidth * rectangleHeight;
      Double rectanglePerimeter = 2 * (rectangleWidth + rectangleHeight);
      
      //Output that is the area and perimeter
      System.out.println("Rectangle Area:  " + rectangleArea);
      System.out.println("Rectangle Perimeter:  " + rectanglePerimeter);
    }
}