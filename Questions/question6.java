//  6.	Write an infinite loop using do while condition.

import java.util.*;

public class question6 {

    public static void loop(int n){
        while(n>0 || n<0 ){
            System.out.println("INFINITE LOOP");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ANY NUMBER : ");
        int n = sc.nextInt();

        loop(n);
    }
    
}
