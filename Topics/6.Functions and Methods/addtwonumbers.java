//  CREATE A FUNCTION FOR ADDITION OF TWO NUMBERS

import java.util.*;

public class addtwonumbers{

    //  CREATE A FUNCTION FOR ADDITION OF NUMBERS
    public static void addNumbers(int a,int b,int sum){  //  DECLARE VARIABLES WITH THIER DATATYPES
        sum=a+b;
        System.out.print("THE SUM OF "+a+" AND "+b+" IS : "+sum);

        return;  //  RETURN THE FUNCTION
    }

    //  CREATE A MAIN FUNCTION FOR PERFORMING YOUR CODE
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A : ");
        int a = sc.nextInt();
        System.out.print("ENTER B : ");
        int b = sc.nextInt();

        //  CALL THE FUNCTION.
        addNumbers(a, b, b);



    }
}