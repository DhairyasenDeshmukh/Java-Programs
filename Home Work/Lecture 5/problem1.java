// SOLID ROHMBUS

public class problem1 {
    public static void main(String[] args) {
        
        int n = 5;  //  NUMBER OF ROWS
        int m = 5;  //  NUMBER OF ELEMENTS IN A ROW

        for(int i=1; i<n; i++){  //  LOOP FOR ROWS
            //  INNER FOR LOOP FOR SPACES BEFORE STARS
            for(int j=1; j<=n-i; j++){  //  n-i MEANS THE HOW MANY SPACES WILL BE PRESENT IN THE ROW 
                System.out.print(" ");  
            }
            //  INNER FOR LOOP FOR STARS AFTER SPACES
            for(int j=1; j<=m; j++){  //  j<=M MEANS THE NUMBER OF ELEMNTS PRESENT IN THE ROW
                System.out.print(" *");
            }
            System.out.println();  //  OUTER FOR LOOP CONTINUES IN THE NEXT LINE
            
        }
    }
    
}
