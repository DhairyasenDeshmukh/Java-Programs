//  CHECK IF THE YEAR IS LEAP OR NOT

import java.util.*;

public class checkyear{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER YEAR : ");
        
        //  INPUT FOR YEAR
        int a = sc.nextInt();
        int b;
        b=a%4;

        if(b==0){
            System.out.print(" YES THE YEAR "+a+" IS LEAP");
        }
            else{
                System.out.print("NO THE YEAR "+a+" IS NOT LEAP");
            }
    }
}