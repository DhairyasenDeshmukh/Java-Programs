// PRINT A HALF PYRAMID

public class halfpyramid {
    public static void main(String[] args) {
        
        int a = 5; // NUMBER OF ROWS

        // OUTER FOR LOOP
        for(int i=1; i<=a; i++){

            // INNER FOR LOOP
            for(int j=1; j<=i; j++){  // i<=i  INDICATES THAT THE NUMBER OF ELEMENTS IN THE ROW WILL BE EQUAL TO THE SERIAL NUMBER OF THE ROW
                System.out.print("*");
            }System.out.println(); // THE OUTER FOR LOOP SHOULD CONTINUE IN THE NEXT LINE
        }
    }
    
}
