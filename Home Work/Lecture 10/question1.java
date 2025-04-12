//  1.	Take an array of names as input from the user and print them on the screen.

import java.util.*;

public class question1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ATTENDENT : ");

        //  INITIALIZING THE SIZE OF ARRAY
        int size = sc.nextInt();

        //  DECLARE THE DATATYPE OF ARRAY TO STRING FOR INPUT OF NAMES
        String names[] = new String[size];

        int a=1;

        //  FOR LOOP FOR INPUT
        for(int i=0; i<size; i++){
            System.out.print("NAME OF ATTENDENT "+a+" : ");
            names[i] = sc.next();
            a++;
        }

        System.out.println();

        int b = 1;

        //  FOR LOOP FOR OUTPUT
        for(int i=0; i<size; i++){
            System.out.println("ATTENDENT "+b+" : "+names[i]);
            b++;
        }
    }
    
}
