/* Christopher Yonek
   CSC-164-651 - Mr. Ng
   2/20/20
   8.5 Sum of Two Matrices: This program asks the user to enter the size of the matrices, and to enter their elements
   it will out put Matrix C which is the sum of the two
 */
import java.util.Scanner;
public class MatrixSum {
    public static void main(String []args) {
        //Get n, for n x n matrix
        int nByn = GetMatrixSize();
        System.out.println("== Matrix A ==");
        //Elements for the first matrix
        Double[][] matrixA = GetMatrixElements(nByn);
        System.out.println("== Matrix B ==");
        //Elements for the second matrix
        Double[][] matrixB = GetMatrixElements(nByn);
        //Add A+B
        Double[][] matrixSum = AddMatrix(nByn,matrixA,matrixB);
        //Output to user
        PrintMatrixSum(matrixSum,nByn);
    }
        public static int GetMatrixSize(){
        //Asks the user to enter one of the dimensions of the matrix
            int matrixSize;
            System.out.println("Enter the size of your square matrix (i.e. 3, for 3 x 3)");
            Scanner userInput = new Scanner(System.in);
            matrixSize = userInput.nextInt();
            return matrixSize;
        }

        public static Double[][] GetMatrixElements(int size) {
            int matrixOneRow = size, matrixOneCol = size, rowI, colJ;
            Double matrixOne[][] = new Double[size][size];
            //Create scanner for input
            Scanner userInput = new Scanner(System.in);

            // Prompt user to enter the elements
            System.out.println("Enter " + size * size + " Array Elements: ");
                for (rowI = 0; rowI < matrixOneRow; rowI++) {
                    for (colJ = 0; colJ < matrixOneCol; colJ++) {
                        matrixOne[rowI][colJ] = userInput.nextDouble();
                    }
                }
            return matrixOne;
        }

        public static Double[][] AddMatrix(int size, Double[][] a, Double[][] b){
        // Takes in 2 Arrays and Adds them up
            Double[][] matrixC = new Double[size][size];
            for(int row = 0; row < a.length; row++){
                for(int col = 0; col < a[row].length; col++){
                    matrixC[row][col] = a[row][col] + b[row][col];
                }
            }
            return matrixC;
        }

        public static void PrintMatrixSum(Double[][] c, int size){
            // Outputs the Array sum to the user
            System.out.print("The Sum is :\n");
            for(int i=0; i < size; i++){
                for(int j=0; j < size; j++){
                    System.out.print(c[i][j]+ "  ");
                }
                System.out.println();
            }
        }
}
