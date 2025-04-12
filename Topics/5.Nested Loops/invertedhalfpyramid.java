// PRINT INVERTED HALF PYRAMID

public class invertedhalfpyramid {
    public static void main(String[] args) {
        
        int a = 5;

        // OUTER FOR LOOP
        for(int i=a; i>=1; i--){   // i IS STARTING WITH a AND DECREASING TILL 1 AND THATS WHY WE ARE USING DECREMENT 

            // INNER FOR LOOP
            for(int j=1; j<=i; j++){ // j WILL REMAIN THE SAME

                System.out.print("*");
            }System.out.println();  //  REMEMBER CAREFULLY TO PUT THIS STATEMENT AFTER THE END OF INNER FOR LOOP 

        }
    }
    
}
