import java.lang.Math;
/* Christopher Yonek 1/25/20
   CSC-162:650 - Mr. Ng
   Assignment 4: Generating Random Months
*/
public class RandomMonMaker {
    public static void main(String args[]) {
        //vars for indexing month
      int janMon = 1;
      int febMon = 2;
      int marMon = 3;
      int aprMon = 4;
      int mayMon = 5;
      int junMon = 6;
      int julMon = 7;
      int augMon = 8;
      int sepMon = 9;
      int octMon = 10;
      int novMon = 11;
      int decMon = 12;
      int maxMon = decMon;
      int minMon = janMon;
      int numberMon = (int)(Math.random() * ((maxMon - minMon) + 1)) + minMon;
  
//Calculation and Output
switch(numberMon){
    case 1: System.out.println("January");
    break;
    
    case 2: System.out.println("Febraury");
    break;
    
    case 3: System.out.println("March");
    break;
    
    case 4: System.out.println("April");
    break;
    
    case 5: System.out.println("May");
    break;
    
    case 6: System.out.println("June");
    break;
    
    case 7: System.out.println("July");
    break;
    
    case 8: System.out.println("August");
    break;
    
    case 9: System.out.println("September");
    break;
    
    case 10: System.out.println("October");
    break;
    
    case 11: System.out.println("November");
    break;
    
    default: System.out.println("December");
}
    }
}