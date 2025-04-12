//  	Two numbers are entered by the user, x and n. Write a function to find the 
//  value of one number raised to the power of another i.e. x^n.

import java.util.*;

public class question8{

    public static int power(int x, int n, int a){
        a=1;
        for(int i=1; i<=n; i++){
            a=a*x;
        }

        System.out.print("THE NUMBER "+x+" RAISED TO THE POWER "+n+" GIVES : "+a);

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER X : ");
        int x = sc.nextInt();
        System.out.print("ENTER N : ");
        int n = sc.nextInt();

        power(x, n, n);
    }
}