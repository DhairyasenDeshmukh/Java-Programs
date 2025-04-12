//  CREATE A FUNCTION FOR PERFORMING MULTIPLICATION OF TWO NUMBERS

import java.util.*;

public class multiplication {

    //  CREATE A MULTIPLICATION FUNCTION
    public static int Multiplication(int a,int b,int m){  //  INSTEAD OF VOID USE INT CAUSE WE WILL RETURN INTEGER VALUE

        m = a*b;
        System.out.print("MULTIPLICATION OF "+a+" AND "+b+" IS : "+m);

        //  RETURN "m" AS THE VALUE OF INTEGER "m"
        return m;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A : ");
        int a = sc.nextInt();
        System.out.print("ENTER B : ");
        int b = sc.nextInt();

       //  CALL THE FUNCTION
        Multiplication(a, b, b);
        
        
    }
    
}
