// BUTTERFLY PATTERN

public class butterfly {
    public static void main(String[] args) {
        
        int n = 4; // NUMBER OF ROWS IN THE FIRST HALF

        //UPPER HALF LOOP
        for(int i=1; i<=n; i++){

            //STARS
            for(int j=1; j<=i; j++){  //  PRINTING THE STARS EQUIVALENT TO THE ROW NUMBER
                System.out.print("*");
            }
            //Spaces
            int spaces = 2*(n-i);  //  PRINTING THE SPACES EQUIVALENT TO [2*(n-i)] LOGIC
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){  //  PRINTING THE STARS AFTER THE SPACES EQUIVALENT TO ROW NUMBER
              System.out.print("*");  
            }
            System.out.println();  //  FOR THE LOWER FOR LOOP WILL BE EXECUTED IN NEXT LINE

        }
        // lower loop
        for(int i=n; i>=1; i--){  //  WE ARE GOING REVERSE AS COMPARED TO UPPER HALF SO REVERSE "i" INITIALIZATION
                                  //  AND DECREMENT FOR "i--"
            //Stars
            for(int j=1; j<=i; j++){  //  PRINTING THE STARS EQUIVALENT TO THE ROW NUMBER
                System.out.print("*");
            }
            //Spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++){  //  PRINTING THE SPACES EQUIVALENT TO [2*(n-i)] LOGIC
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){  //  PRINTING THE STARS AFTER THE SPACES EQUIVALENT TO ROW NUMBER
              System.out.print("*");  
            }
            System.out.println();

        }
    }
    
}
