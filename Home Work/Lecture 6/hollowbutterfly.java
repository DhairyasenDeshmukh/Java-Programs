// HOLLOW BUTTERFLY

public class hollowbutterfly {
    public static void main(String[] args) {
        
        //  NUMBER OF ROWS
        int n = 5;
        //  NUMBER OF COLOUMNS
        int m = 5;
        
        //  OUTER FOR LOOP FOR UPPER HALF OF BUTTERFLY
        for(int i=1; i<=n; i++){
            
            //  INNER FOR LOOP FOR 1ST PART OF STARS
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            //  INNER FOR LOOP FOR SPACES AFTER 1ST PART OF THE STAR
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //  INNER FOR LOOP FOR 2ND PART OF THE STARS
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //  OUTER FOR LOOP FOR LOWER PART OF THE BUTTERFLY
        for(int i=n; i>=1; i--){

            //  INNER FOR LOOP FOR 1ST PART OF STARS
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            
            //  INNER FOR LOOP FOR SPACES AFTER 1ST PART OF THE STAR
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            
            //  INNER FOR LOOP FOR 2ND PART OF THE STARS
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
