/* Christopher Yonek
   CSC-162 - Mr. Ng
  2/9/2020
  Ch7.7: Number Generator and Counter: This program generates 100 random
  digits between 0-9 and also counts how many times each digit is generated
  */
import java.util.Random;

public class NumberMakerCounter{

     public static void main(String []args){
         //Call Number Generator Method
        numberGenerator();
          }
     public static void numberGenerator(){
        int[] digitCounter = new int[10];
         for(int i = 0; i<100; i++){
            //Create two arrays that go 0-9
            int[] arryResult = new int[100]; 
            Random random = new Random();
            int[] randomInt = new int[100];
            //Fill Array with Random Number
              randomInt[i] = random.nextInt(10);
              arryResult[i] = randomInt[i];
              
              //Outputs the sequence of 100 digits
              System.out.println("[Number " + (i + 1) + "] = " + arryResult[i]);
              
              //If=statements keeping count of digits 
              if(arryResult[i] == 0){
                  digitCounter[0] = digitCounter[0] + 1;
              }
              
              if(arryResult[i] == 1){
                  digitCounter[1] = digitCounter[1] + 1;
              }
              if(arryResult[i] == 2){
                  digitCounter[2] = digitCounter[2] + 1;
              }
              
              if(arryResult[i] == 3){
                  digitCounter[3] = digitCounter[3] + 1;
              }
              
              if(arryResult[i] == 4){
                  digitCounter[4] = digitCounter[4] + 1;
              }
              
              if(arryResult[i] == 5){
                  digitCounter[5] = digitCounter[5] + 1;
              }
              
              if(arryResult[i] == 6){
                  digitCounter[6] = digitCounter[6] + 1;
              }
              
              if(arryResult[i] == 7){
                  digitCounter[7] = digitCounter[7] + 1;
              }
              if(arryResult[i] == 8){
                  digitCounter[8] = digitCounter[8] + 1;
              }
              
              if(arryResult[i] == 9){
                  digitCounter[9] = digitCounter[9] + 1;
              }
          }
          
          //Outputs the total count of each digit to the user
          System.out.println("==============================");
          System.out.println("Total Number of 0s: " + digitCounter[0] + "\nTotal Number of 1s: " + digitCounter[1] + "\nTotal Number of 2s: " + digitCounter[2] + "\nTotal Number of 3s: " + digitCounter[3] + "\nTotal Number of 4s: " + digitCounter[4] + "\nTotal Number of 5s: " + digitCounter[5] + "\nTotal Number of 6s: " + digitCounter[6] + "\nTotal Number of 7s: " + digitCounter[7] + "\nTotal Number of 8s: " + digitCounter[8] + "\nTotal Number of 9s: " + digitCounter[9]);

        }
     }