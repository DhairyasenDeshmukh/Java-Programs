import java.util.*;

public class transpose {

    public static void swap(int A[][], int row, int col){

        System.out.println("THE TRANSPOSE IS: ");

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(A[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void display(int A[][], int row, int col){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF ROWS: ");
        int row = sc.nextInt();
        System.out.print("ENTER THE NUMBER OF COLOUMNS: ");
        int col = sc.nextInt();

        System.out.println("________________________");

        int A[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("________________________");

        System.out.println("THE ENTERED MATRIX IS: ");

        display(A, row, col);

        System.out.println("________________________");

        swap(A, row, col);


    }
    
}
