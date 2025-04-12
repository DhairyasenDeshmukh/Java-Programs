//  WAP TO FIND THE FACTORIAL OF A NUMBER

import java.util.*;

public class factorial{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print(" ENTER N : ");
        int n = sc.nextInt();
        
        //  DECLARE FACT AS AN INTEGER AND ASSIGN IT VALUE AS"1" AND NOT "0" BECAUSE WHEN WE MULTIPLY O IN THE FACTORIAL THE ENTIRE TERM WILL BECOME ZERO
        int fact = 1;

        for(int i=n; i>=1; i--){
            
            //  MULTIPLY fact WITH i AND THIS LOOP WILL CONTINUE FOR UPDATED i AND fact TILL i=1
            fact=fact*i;
        }
        System.out.print("THE FACTORIAL OF "+n+" IS : "+fact);

        //  THERE IS NO NEED TO CODE FOR EXEPTIONAL CASE OF "0"
        //  BECAUSE WE ASSIGNED fact = 1 AND WHEN WE ENTER n=0
        //  THE LOOP WONT EVEN RUN BECAUSE O IS LESS THAN 1 
        //  AND DIRECT INITIAL fact VALUE WILL BE PRINTED WHICH IS "1" 

    }
}