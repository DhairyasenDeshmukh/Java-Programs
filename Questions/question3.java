//  3.	Write a function which takes in 2 numbers and returns the greater of those two

import java.util.*;

public class question3 {

    public static int greater(int a, int b){

        if(a==b){
            System.out.print(a+" IS EQUAL TO "+b);
        }else{
            if(a<b){

                     System.out.print(b+" IS GREATER THAN "+a);
                   }
                    else{
                         System.out.print(a+" IS GREATER THAN "+b);
                        }
    }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER A : ");
        int a = sc.nextInt();
        System.out.print("ENTER THE NUMBER B : ");
        int b = sc.nextInt();

        greater(a, b);

    }
    
}
