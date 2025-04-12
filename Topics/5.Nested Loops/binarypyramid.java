// PRINT BINARY PYRAMID

public class binarypyramid {
    public static void main(String[] args) {
        
        int a = 5;

        // OUTER FOR LOOP
        for(int i=1; i<=a; i++){

            // INNER FOR LOOP
            for(int j=1; j<=i; j++){
                int b=i+j; // DECLARE A VARIABLE FOR ADDITION OF POSITION OF i AND j

                if(b%2==0){
                    System.out.print("1");  // IF THE POSITION IF EVEN THE PRINT 1
                }else{
                    System.out.print("0");  // IF THE POSITION IS ODD THEN PRINT 0
                }
            }
            System.out.println();  // CONTINUE THE FOR LOOP IN THE NEXT LINE
        }

    }
    
}
