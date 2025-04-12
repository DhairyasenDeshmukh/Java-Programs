// CHECKING IF THE NUMBER IS EVEN OR ODD
import java.util.*;

public class findingevenorodd{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER: ");
        long a = sc.nextLong();
        if(a%2==0){                     // CHECKING IF THE REMINDER OF DIVISION OF THE NUMBER WITH 2 IS ZERO OR NOT
            System.out.println("THE NUMBER YOU HAVE ENTYERED IS EVEN");
        }
        else{
            System.out.println("THE NUMBER YOU HAVE ENTERED IS ODD");
        }
    }
}
