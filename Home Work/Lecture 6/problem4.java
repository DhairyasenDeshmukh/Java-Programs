//  INVERSE HALF NUMBER PYRAMID

public class problem4{

    public static void main(String[] args) {
        
        int n = 5;  //  NUMBER OF ROWS
        
        //  OUTER FOR LOOP
        for(int i=1; i<=n; i++){  //  WE WANT ROWS FROM 1 TO 5
            for(int j=0; j<=i; j++){
                System.out.print(" ");  //  WE WANT THE SAPCES TO BE IN ACSENDING ORDER
            }
            
            //  JUST AS WE TYPE INNER FOR LOOP FOR SPACES YOU NEED TO TYPE IT FOR PRINTING "i"
            //  BUT KEEP IN MIND TO TAKE THE INITIALISATION AS "0" SO THAT THE n-i BECOMES 5 IN THE FIRST ROW
            for(int j=0; j<=n-i; j++){
                
                System.out.print(i+" ");  // WE WANT THE NUMBER OF ROW TO BE PRINTED
            }
           
           
           
            System.out.println();
        }
    }
}