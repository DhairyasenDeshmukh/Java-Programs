// PRINT INVERTED HALF PYRAMID WITH NUMBERS

public class invertednumberpyramid {
    public static void main(String[] args) {
        
        int a = 5;  // NUMBER OF ROWS

        // OUTER FOR LOOP
        for(int i=a; i>=1; i--){  // i IS STARTING WITH a AND DECREASING TILL 1 AND THATS WHY WE ARE USING DECREMENT

            // INNER FOR LOOP
            for(int j=1; j<=i; j++){
                System.out.print(j); // THE OUTPUT WILL BE THE VALUE OF J ITSELF 
            }
            System.out.println(); // OTER FOR LOOP WILL CONTINUE IN THE NEXT LINE
        }
    }
    
}