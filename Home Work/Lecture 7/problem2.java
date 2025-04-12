//  CREATE A FUNCTION TO CHECK IF THE INPUT NUMBER IS EVEN OR ODD

import java.util.*;

public class problem2 {

    public static void evenodd(int a){

        if(a%2==0){
            System.out.println("THE NUMBER "+a+" IS EVEN\n");
        }else{
            System.out.println("THE NUMBER "+a+" IS ODD\n"); 
        }
        return;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER : ");
        int a = sc.nextInt();
        System.out.println();

        evenodd(a);
    }
    
}

