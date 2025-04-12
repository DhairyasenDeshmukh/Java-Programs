//  CREATE A FUNCTION FOR FINDING THE FACTORIAL OF A NUMBER

import java.util.*;

public class factorial {

    //  CREATE A FUNCTION FOR FACTORIAL
    public static int fact(int n, int i){

        if(n<0){
            String a = "LAST TIME SOMEONE GAVE ME AN INPUT FOR FACTORIAL AS NEGETIVE, YOU WERE BORN DICKHEAD >_<";
            System.out.print(a);
            System.out.println("\n");

            return 0;  //  RETURN STATEMENT CAN BE WRITTEN ANYWHERE IN THE CODE FROM WHERE YOU WAN TO RETURN THE TO THE MAIN CODE
        }

        int ans = 1;

        for(i=n; i>=1; i--){
            ans=ans*i;
        }

        //  RETURN THE VALUE OF "ans" AS INTEGER
        return ans;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER NEEDED TO FIND FACTORIAL OF : ");
        int n = sc.nextInt();
        System.out.println();

        //  CALL THE FUNCTION IN PRINT STATEMENT
        System.out.println("THE FACTORIAL OF "+n+" IS : "+fact(n, n));
        System.out.println();
    }
    
}
