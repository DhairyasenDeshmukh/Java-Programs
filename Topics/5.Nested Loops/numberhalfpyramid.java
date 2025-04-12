// PRINT HALF PYRAMID WITH NUMBERS

public class numberhalfpyramid {
    public static void main(String[] args) {
        
        int a = 5;  // NUMBER OF ROWS

        // OUTER FOR LOOP
        for(int i=1; i<=a; i++){

            // INNER FOR LOOP
            for(int j=1; j<=i; j++){
                System.out.print(j); // THE OUTPUT WILL BE THE VALUE OF J ITSELF 
            }
            System.out.println(); // OTER FOR LOOP WILL CONTINUE IN THE NEXT LINE
        }
    }
    
}
