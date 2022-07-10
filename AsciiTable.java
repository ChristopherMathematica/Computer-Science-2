/* Christopher Yonek
 CSC-162  - Mr. Ng.
 2/4/2020 
 Chapter 5.15 - ASCii Display */
public class AsciiTable {
    public static void main(String args[]) {


    //Prints out 10 characters then makes a newline from ASCii #33-#126
        for(int i=33; i<= 43; i++){
            System.out.printf("%c ",i,i);
        }
        
        System.out.print("\n");
        
        for(int i=44; i<= 54; i++){
            System.out.printf("%c ",i,i);
        }
        
        System.out.print("\n");
        
        for(int i=55; i<=65; i++){
            System.out.printf("%c ",i,i);
        }
        
        System.out.print("\n");
        
        for(int i=66; i<=76; i++){
            System.out.printf("%c ",i,i);
        }
        
        System.out.print("\n");
        
        for(int i=77; i<=87; i++){
            System.out.printf("%c ",i,i);
        }

         System.out.print("\n");
        
        for(int i=88; i<=98; i++){
            System.out.printf("%c ",i,i);
        }
        
        System.out.print("\n");
        
        for(int i=99; i<=109; i++){
            System.out.printf("%c ",i,i);
        }
        
        System.out.print("\n");
        
        for(int i=110; i<=120; i++){
            System.out.printf("%c ",i,i);
        }
        
        System.out.print("\n");
        
        for(int i=121; i<=126; i++){
            System.out.printf("%c ",i,i);
        }
        
    }
}
