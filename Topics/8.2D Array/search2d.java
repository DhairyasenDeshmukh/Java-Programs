import java.util.*;

public class search2d {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF ROWS: ");
        int row = sc.nextInt();
        System.out.print("ENTER THE NUMBER OF COLS: ");
        int col = sc.nextInt();

        int A[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("________________________");

        System.out.print("ENTER THE TARGET TO SEARCH: ");
        int target = sc.nextInt();

        for(int i=0; i<row; i++){

            for(int j=0; j<col; j++){
                if(A[i][j]==target){
                    System.out.println("THE TARGET"+target+" WAS FOUND AT i="+i+", j="+j);
                }
            }

        }

    }
}
