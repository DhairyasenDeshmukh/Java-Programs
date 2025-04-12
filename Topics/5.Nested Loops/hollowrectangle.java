// PRINT A PATTERN OF HOLLOW RECTANGLE

public class hollowrectangle {
    public static void main(String[] args){

        int a = 5; // NUMBER OF ROWS
        int b = 5; // NUMBER OF ELEMENTS IN THE ROW

        // OUTER LOOP
        for(int i=1; i<=a; i++){

            //INNER LOOP
            for(int j=1; j<=b; j++){

                if(i==1 || i==a || j==1 || j==b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println(); // THE OUTER FOR LOOP SHOULD CONTINUE IN THE NEXT LINE
        }
    }
    
}
