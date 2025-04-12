// PRINT FLOYD'S TRIANGLE

public class floydstriangle {
    public static void main(String[] args) {
        
        int a = 5;
        int num = 1; // THE STARTING OF THE ELEMENT INT THE FIRST ROW

        // OUTER FOR LOOP
        for(int i=1; i<=a; i++){
            
            // INNER FOR LOOP
            for(int j=1; j<=i; j++){
                System.out.print(num); // PRINTING THE VALUE OF NUM IN THE FIRST ELEMENT IN THE FIRST ROW
                num++;   //  INCREMENT OF THE VALUE OF THE NUM FOR THE NEXT ELEMENT
            }
            System.out.println();  // THIS WILL CONTINUE THE OUTER FOR LOOP IN THE NEXT LINE 
        }
    }
    
}
