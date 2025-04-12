// REVERSING A STRING

import java.util.*;

public class reversestring {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE STRING: ");

        StringBuilder str =new StringBuilder(sc.nextLine());

        System.out.println("REVERSE STRING IS: ");

        for(int i=0; i<str.length()/2; i++){

            int front = i;
            int back = str.length()-1-i;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println(str);
    }
    
}
