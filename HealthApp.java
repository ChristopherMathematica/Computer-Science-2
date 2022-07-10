/* Christopher Yonek
   CSC:164-651 - Mr. Ng.
   Programming Exercise 2: Health Application
   1/23/2020
*/

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class HealthApp{
    public static void main(String args[]) {
    
      final double oneLb = 0.45359237;
      final double oneM = 0.0254;
      
      //Create scanner
      Scanner userInput = new Scanner(System.in);
      
      //Ask for weight to convert
      System.out.println("Enter your weight in Pounds (Lb)");
      double weight = userInput.nextDouble();
      
      double weightKg = oneLb * weight;
      
      //Ask user to enter height in inches
      System.out.println("Enter your height in Inches (in)");
      double height =userInput.nextDouble();
      
      double heightMeters = oneM * height;
      
      //Calculate BMI and keep to 4 decimal values
      double userBMI = weightKg / (heightMeters * heightMeters);
      double precisionSetBMI = BigDecimal.valueOf(userBMI).setScale(4,RoundingMode.HALF_UP).doubleValue();
      System.out.println("Your BMI is: " + precisionSetBMI);
      


    }
}
