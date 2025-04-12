// 2.	Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;

public class question2 {

    public static int sumofoddnumbers(int n,int num,int sum){

        num=0;

        for(int i=1; i<=n; i+=2){

            num=num+i;
        }
        sum=num;

        System.out.print("SUM OF ALL ODD NUMBERS FROM 1 TO "+n+" IS: "+sum);

        return 0;


    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER 'n' TILL WHIH YOU DESIRE THE SUM OF ODD NUMBERS: ");
        int n = sc.nextInt();

        sumofoddnumbers(n, n, n);




    }
    
    
}
