// PRINT PALINDROMIC

public class problem3{
    public static void main(String[] args) {
        
        int n=5;  //  NUMBER OF ROWS
        
        //  OUTER FOR LOOP
        for(int i=1; i<=n; i++){
            
            // LOOP FOR SPACES
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            //  LOOP FOR FIRST NUMBERS
            for(int j=1; j<=i; j++){
                System.out.print(" "+j);
            }

            //  LOOP FOR REVERSE NUMBER
            int m=i-1;  //  WE WANT 123-21 HERE 21 IS NOT EQUAL TO "i" BUT RATHER EQUAL TO "i-1"
            for(int j=m; j>=1; j--){  //  DECREMENT OF THE NUMBERS WILL TAKE PLACE
                System.out.print(" "+j);
            }System.out.println();  //  OUTER  FOR LOOP WILL CONTINUE IN NEXT LINE
        }
    }
}