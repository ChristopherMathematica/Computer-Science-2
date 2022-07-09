/* Christopher Yonek
CSC-164-651 - Mr. Ng
2/22/2020
Test 1: This program takes two numbers from a user and finds the perfect number between the specified range
 */
import com.sun.jdi.IntegerValue;
import java.math.BigInteger;
import java.util.Scanner;
import java.math.*;

public class PerfectNumberFinder {
    public static void main(String[] args) {
        int goAgain = - 1;
        int userNumExit = 0;
        while(goAgain != userNumExit) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please Enter a positive number(preferably the min.) : ");
            long userNum1 = userInput.nextLong();
            System.out.println("Please Enter a positive number(preferably the max.): ");
            long userNum2 = userInput.nextLong(); // 2nd input
            PerfectNumberGenerator(RangeBetweenNumbers(userNum1, userNum2));
            System.out.println("Would you like to go again?, Enter -1 to exit");
            userNumExit = userInput.nextInt();
        }
        System.out.println("Thank you for using perfect number finder!");
        System.exit(0);
    }
    public static long RangeBetweenNumbers(long userNum1, long userNum2) {
        long rangeForNums = 0;
        if (userNum1>userNum2){
            rangeForNums = userNum1 - userNum2;
        }
        if (userNum2>userNum1){
            rangeForNums = userNum2 - userNum1;
        }
        if (userNum1==userNum2){
            System.out.println("Please enter two different numbers!");
            System.exit(0);
        }
        return rangeForNums;
    }


    public static boolean TestIfPrime(int possiblePrime) {
        int valueRemainder;
        for (int i = 2; i <= possiblePrime / 2; i++) {
            valueRemainder = possiblePrime % i;
            //if remainder is 0 than possiblePrime is not prime!
            if (valueRemainder == 0) {
                return false;
            }
        }
        return true;
    }


    public static  void PerfectNumberGenerator(long range) { ;
        boolean yesPrime = true;
        //Empty String
        String primeNumbersFound = "";

        //Start loop 1 to maxCheck
       //THINGY i <= rangeMax
        for (int i = 1; i <= range; i++) {
            yesPrime = TestIfPrime(i);
            if (yesPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }

        //Turn entered string into an Array of primes
        String[] brokenApart = primeNumbersFound.split(" ");
        long[] primeIntNumbers = new long[brokenApart.length];

        //Create BigInteger variables for precision
        BigInteger[] allPrimes = new BigInteger[primeIntNumbers.length];
        BigInteger lowValue = BigInteger.valueOf(1);

        System.out.println("Your perfect numbers are: ");
        for (int i = 0; i < brokenApart.length; i++) {
            //change prime numbers from string to long

            primeIntNumbers[i] = Long.parseLong(brokenApart[i]);
            //change long into big integer
            allPrimes[i] = BigDecimal.valueOf(primeIntNumbers[i]).toBigInteger();

            //If-statement to remove 1 from Perfect Number set
            if (primeIntNumbers[i] != 1) {
                //operations on BigInteger numbers to get list of possible perfect numbers
                BigInteger differenceAnswer = allPrimes[i].subtract(lowValue);
                BigInteger eqnPtOne = BigPower(BigInteger.valueOf(2), differenceAnswer);
                BigInteger eqnPtTwo = BigPower(BigInteger.valueOf(2), allPrimes[i]).subtract(lowValue);
                BigInteger productAnswer = eqnPtOne.multiply(eqnPtTwo);
                CheckIfPerfect(range, productAnswer);
            }
        }
    }

    public static BigInteger BigPower(BigInteger baseNum, BigInteger exponent) {
        BigInteger resultExp = BigInteger.ONE;
        while (exponent.signum() > 0) {
            if (exponent.testBit(0)) resultExp = resultExp.multiply(baseNum);
            baseNum = baseNum.multiply(baseNum);
            exponent = exponent.shiftRight(1);
        }
        return resultExp;
    }

    public static void CheckIfPerfect(long specifiedRange, BigInteger perfectResult) {
        int sum = 0;
        for (int i = 1; BigInteger.valueOf(i).compareTo(perfectResult) < 0; i++) {
            if ((perfectResult.mod(BigInteger.valueOf(i))).equals(BigInteger.ZERO)) {
                sum = sum + i;
                if(perfectResult.mod(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO) > 0){
                    break;
                }
            }
        }
        if (perfectResult.compareTo(BigInteger.valueOf(specifiedRange))<0) {
            if (BigInteger.valueOf(sum).equals(perfectResult)) {
                    System.out.println(perfectResult);
            }
        }
    }
}
