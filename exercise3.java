import java.lang.Math; //importing Math class in Java

public class exercise3{
    public static void main(String args[]) {
    //Variables indexing months
    int janMon = 1;
    int febMon = 2;
    int marMon = 3;
    int aprMon = 4;
    int mayMon = 5;
    int junMon = 6;
    int julMon = 7;
    int augMon = 8;
    int septMon = 9;
    int octMon = 10;
    int novMon = 11;
    int decMon =12;
    
    //Specified range
    int max = 12;
    int min = 1;
    
    
    //Generate random number
     double numberx = Math.random();
     double number = numberx * (((max - min)+1)+min);
     
     //Displays the month according to the index
     if(number == janMon){
         System.out.println("January");
     }
     if(number == febMon){
         System.out.println("February");
     }
     if(number == marMon){
         System.out.println("March");
     }
     if(number == aprMon){
         System.out.println("April");
     }
     if(number == mayMon){
         System.out.println("May");
     }
     if(number == junMon){
         System.out.println("June");
     }
     if(number == julMon){
         System.out.println("July");
     }
     if(number == augMon){
         System.out.println("August");
     }
     if(number == septMon){
         System.out.println("September");
     }
     if(number == octMon){
         System.out.println("October");
     }
     if(number == novMon){
         System.out.println("November");
     }
     if(number == decMon){
         System.out.println("December");
     }
     
     
    }
}