// PRINT HALF NUMBER PYRAMID

public class problem5 {
    public static void main(String[] args) {
        

        int n = 5;  //  NUMBER OF ROWS

        //  OUTER FOR LOOP
        for(int i=1; i<=n; i++){

            //  LOOP FOR SPACES
            for(int j=1; j<=n-i; j++){
            
                System.out.print(" ");
            
            }
            
            //  LOOP FOR STARS
            for(int j=1; j<=i; j++){
                
                System.out.print(j+" ");
            
            }
            System.out.println();
        }
    }
    
}
