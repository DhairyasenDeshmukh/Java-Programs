// PRINT SOLID RECTANGLE
public class solidrectangle{
    public static void main(String[] args){

        int a = 5;  // NUMBER OF ROWS
        int b = 5;  // NUMBER OF ELEMENTS IN THE ROW

        for(int i = 1; i<=a; i++){  //  THIS FOR IS FOR PRINTING THE LOOP BODY FIVE TIMES WITH INCREMENT
            for(int j = 1; j<=b; j++){  //  THIS FOR IS FOR PRINTING * 5 TIMES IN A SINGLE ROW
                System.out.print("*");
            }
            System.out.println();  //  THIS PRINTLN STATEMENT OUTSIDE 2ND FOR LOOP STATES THAT THE NEXT OUTPUT IS REQUIRED IN NEXT LINE
        }
    }
}