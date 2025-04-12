//  DIAMOND
public class diamond {
    public static void main(String[] args) {
        
        int n=5;  //  NUMBER OF ROWS
        
        //  UPPER HALF 
        for(int i=1; i<=n; i++){

            // LOOP FOR SPACES
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //  LOOP FOR STARS
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        //  LOWER HALF
        for(int i=n-1; i>=1; i--){  //  "i=n-1" BECAUSE WE WANT THE LINE AFTER 5 STARED LINE TO CONTAIN ONLY 4 STARS
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
