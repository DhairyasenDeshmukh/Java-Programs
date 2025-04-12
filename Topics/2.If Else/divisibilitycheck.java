// PERFORMING DIVISIBILITY CHECK OF A NUMBE USING ANOTHER NUMBER
import java.util.*;

public class divisibilitycheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    // IMPORTING SCANNER
        System.out.print("IS THE NUMBER: ");
        int a = sc.nextInt();
        System.out.print("DIVISIBLE BY: ");
        int b = sc.nextInt();
        if(a%b==0){                             // CHECKING IF THE REMINDER OF THE DIVISION OF A AND B IS ZERO OR NOT
            System.out.println("YES IT IS");
        }else{
            System.out.println("NO ITS NOT");
        }
    }
}
    
   
