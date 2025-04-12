//  PRINT NUMBER PYRAMID

public class problem2 {
    public static void main(String[] args) {
        
        int n = 5;  //  NUMBER OF ROWS

        for(int i=1; i<=n; i++){  //  LOOP FOR ROWS
            
            int spaces=(n-i);
            for(int j=1; j<=spaces; j++){  //  LOOP FOR SPACES BEFORE ELEMENT
                System.out.print(" ");  
            }
            
           for(int j=1; j<=i;j++){  //  NUMBER OF ELEMENTS IN THE ROW
            System.out.print(i+" ");  //  WE DONT WANT THE OUTPUT I  THE ROW AS THE NUMBER OF ELEMENTS IN THE ROW
           }                      //  WE WANT THE NUMBER OF THE ROW ON THE ELEMENT'S PLACE THAT WHY PRINT (i)
           System.out.println();
        }
    }
    
}
