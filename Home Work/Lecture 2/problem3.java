import java.util.*;

public class problem3{

    public static void main(String[] args){
        
        System.out.print("ENTER THE NUMBER WHOSE TABLE IS NEEDED : ");

        Scanner sc = new Scanner(System.in);

        // "a" = The number whose table is needed
        double a = sc.nextDouble();

        System.out.println("THE TABLE OF "+a+" IS : ");
        System.out.println("-------------------");

        double result = 0;
        int i = 1;

        for(i=1; i<11; i++){

            result = a*i;

            // IF YOU DESIRE AN OUTPUT IN FOR LOOP OUTPUT THEN YOU MUST CODE IT INSIDE FOR LOOP STATEMENT
            System.out.println(a+" x "+i+" = "+result);
            // THE ABOUVE STATEMENT WILL GIVE THE OUTPUT AS "5 X 3 = 15"
        }
        
        

    }
}