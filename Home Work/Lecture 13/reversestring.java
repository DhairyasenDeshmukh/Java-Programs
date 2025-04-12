// REVERSE THE INPUT STRING 

import java.util.*;

public class reversestring {
    public static void main(String [] main){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE STRING: ");
        StringBuilder og = new StringBuilder(sc.nextLine());

        for(int i=0; i<og.length()/2; i++){
            int front = i;
            char frontchar = og.charAt(i);
            int back  = og.length()-1-i;
            char backchar = og.charAt(og.length()-1-i);

            og.setCharAt(front, backchar);
            og.setCharAt(back, frontchar);

        }

        System.out.println("THE REVERSE STRING IS: "+og);
    }
    
}
