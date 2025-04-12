import java.util.*;

public class input2darray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ROWS: ");
        int row = sc.nextInt();
        System.out.print("ENTER NUMBER OF COLOUMNS: ");
        int col = sc.nextInt();

        int Array[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                Array[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }


    }
    
}
