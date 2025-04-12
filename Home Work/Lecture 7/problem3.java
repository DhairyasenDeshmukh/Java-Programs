//  CREATE A FUNCTION FOR PRINTING A TABLE FOR A NUMBER BEING INPUT

import java.util.*;

public class problem3 {
    


public static void table(int n,int i){
    for(i=1; i<=n; i++){
        int ans=n*i;
        

        System.out.println(n+" x "+i+" = "+ans);

    }
    return;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE NUMER YOU WANT TABLE OF : ");
    int n = sc.nextInt();
    System.out.println("___________________________\n");

    table(n, n);
    System.out.println("___________________________\n");
}

}