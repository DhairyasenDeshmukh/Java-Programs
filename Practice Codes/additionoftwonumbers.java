// ADDITTION OF TWO NUMBERS

import java.util.*;// DECLARATION OF WHAT TYPE OF RESOURCES THE USER IS GOING TO USE

public class additionoftwonumbers {
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("ENTER THE NUMBER A: ");
            int a=sc.nextInt();// USED TO SCAN INTEGER
             System.out.print("ENTER THE NUMBER B: ");
            int b=sc.nextInt();
            int sum=a+b;
             System.out.print("SUM OF A AND B IS: "+sum);     // +sum AFTER THE DOUBLE QUOTES STATES THAT THE SUM THAT THE USER DECLARED WILL BE PRINTED AFTER THE TEXT INSIDE THE QUOTE IN THE SAME LINE
        }
        
    }
}
