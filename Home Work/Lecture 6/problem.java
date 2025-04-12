// HOLLOW ROHMBUS

public class problem {
    public static void main(String[] args) {
        
        //  NUMBER OF ROWS
        int n = 5;
        //  NUMBER OF ELEMENTS IN A ROW
        int m = 5;

        //  OUTER FOR LOOP
        for(int i=1; i<=n; i++){

            //  INNER FOR LOOP FOR SPACES
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //  INNER FOR LOOP FOR STARS
            for(int j=1; j<=m; j++){

                //  CONDITION FOR STARS TO BE PRINTED AT THE EXTREME EDGES OF THE PATTERN 
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("* ");
                }
                
                //  CONDITION FOR SPACES TO BE PRINTED WHERE NO STARS ARE REQUIRED
                else{
                    System.out.print("  ");
                }
                
            }
            //  OUTER FOR LOOP WILL CONTINUE IN THE NEXT LINE
            System.out.println();
        }
    }
    
}
