//  CREATE A FUNTION FOR CHECKING IF THE NUMBER IS PRIME OR COMPOSITE

import java.util.*;

public class problem1{

    //  CREATE A FUNCTION FOR CHECKING IF THE NUMBER IS PRIME OR NOT
    public static void prime(int a, int check){
        for(int i=2; i<a; i++){
            check = a%i;
            if(check==0){
                break;
            }else{
                continue;
            }

            }
            if(check!=0){
                System.out.print("THE NUMBER "+a+" IS PRIME");
            }else{
                System.out.print("THE NUMBER "+a+" IS COMPOSITE");
            }

            
        return;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER : ");
        int a = sc.nextInt();

        //  CALL THE FUNCTION
        prime(a, a);

        

        }
    }
    

