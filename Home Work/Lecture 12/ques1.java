// 1.	Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;

public class ques1 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("DETERMINE THE SIZE OF THE ARRAY: ");
        int size = sc.nextInt();
        sc.nextLine();  // consume the newline character

        String Array[] = new String[size];

        for(int i=0; i<size; i++){
            System.out.print("ENTER STRING "+(i+1)+" : ");   
            Array[i] = sc.nextLine();
        }

        System.out.println("THE ARRAY YOU HAVE ENTERED IS: ");

        for(int i=0; i<size; i++){
            System.out.println(Array[i]);
        }

        int total = 0;

        for(int i=0; i<size; i++){
            total += Array[i].length();  //  IN EVERY LOOP THE TOTAL WILL BE UPDATED WITH THE ADDED VALUE OF THE STRING.
        }

        System.out.println("THE TOTAL LENTGH OF ALL ELEMENTS OF THE MATRIX IS: "+total);

    }
    
}
