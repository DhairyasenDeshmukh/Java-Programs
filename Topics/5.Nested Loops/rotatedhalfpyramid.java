// PRINT INVERTED HALF PYRAMID WHICH IS ROTATED BY 180 DEGREE

public class rotatedhalfpyramid {
    public static void main(String[] args) {
        
        int a = 5;  // NUMBER OF ROWS

        // OUTER FOR LOOP
        for(int i=1; i<=a; i++){

            // TWO INNER FOR LOOPS ARE NEEDED FOR THE SAME ROW, ONE FOR SPACE BEFORE THE STARS 
            // AND THE SECOND FOR THE STARS AFTER THE SPACE. THATS WHY THE COUNTER VARIABLE WILL 
            // REMAIN SAME AS j CAUSE BOTH THE FOR LOOPS ARE FOR SAME ROW ELEMENTS
            // THE FOR LOOP FOR SPACE WILL CONTAIN j<=a-i BECAUSE a-i IS THE SPACE BEFORE THE STARS

            // INNER FOR LOOP FOR SPACE
            for(int j=1; j<=a-i; j++){
                System.out.print(" ");
            }

            // FOR LOOP FOR STARS
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(); // OUTER FOR LOOP WILL CONTINE IN THE NEXT LINE
        }
    }
    
}
