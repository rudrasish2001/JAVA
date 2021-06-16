import java.util.Scanner;
public class lab26 {
 
    public static void main(String...args) {
           
           Scanner scanner = new Scanner(System.in);
           
           int[][] matrix = new int[3][3];
           
           System.out.println("Enter the elements in matrix :");
           for (int i = 0; i < 3; i++) {
                  for (int j = 0; j < 3; j++) {
                        matrix[i][j] = scanner.nextInt();
                  }
           }
           int sumOfDiagonal1=0;
           for (int i = 0, j =0; i< 3 && j < 3; i++, j++) {
                  sumOfDiagonal1= sumOfDiagonal1 + matrix[i][j];
                  }
           
           int sumOfDiagonal2=0;
           for (int i=0,j=3-1 ; i<3 && j>=0 ; i++, j--) {
                  sumOfDiagonal2= sumOfDiagonal2 + matrix[i][j];
                  
           }
 
           System.out.println("\nMatrix is : ");
           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                        System.out.print(matrix[i][j] + " ");
                  }
                  System.out.println();
           }
 
           System.out.println("sum of diagonal1 elements="+sumOfDiagonal1+", sum of diagonal2 elements ="+ sumOfDiagonal2 );
           System.out.println("sum of diagonal1 and diagonal2 elements is: "+ (sumOfDiagonal1+ sumOfDiagonal2) );
 
    }
}
