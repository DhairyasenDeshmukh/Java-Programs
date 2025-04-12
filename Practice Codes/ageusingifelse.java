// CHECKING AGE USING IF ELSE
import java.util.*;
public class ageusingifelse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("ENTER YOUR AGE: ");
            int age=sc.nextInt();
            if(age<=50)                               // CHECING IF THE AGE IS LESS THAN OR EQUAL TO 50 OR NOT
            {
                System.out.println("YOU HAVE MUCH TIME LEFT TO LIVE");
            }
            else
            {
                System.out.println("YOUR TIME IS NEARLY UP MY BOAH");

            }
        }
    }
    
}