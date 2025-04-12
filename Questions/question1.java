//  1.	Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class question1 {

    public static void average(int num1, int num2, int num3, double avg){

        avg=(num1+num2+num3)/3.0;

        System.out.print("THE AVERAGE OF "+num1+", "+num2+" & "+num3+" IS : "+avg);

        return;


    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER 1st NUMBER: ");
        int num1 = sc.nextInt();

        System.out.print("ENTER 2nd NUMBER: ");
        int num2 = sc.nextInt();

        System.out.print("ENTER 3rd NUMBER: ");
        int num3 = sc.nextInt();

        average(num1, num2, num3, num3);
    }
}
