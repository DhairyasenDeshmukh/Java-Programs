//PRINT FIRST N EVEN NUMBERS
import java.util.*;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("THE FIRST N EVEN NUMBERS WHERE N IS : ");

        int n= sc.nextInt();
        System.out.println("------------------------------------");

        int number = 0;  // SPECIFIED THE VALUE OF NUMBER 0 BECAUSE WHEN WE INCREMENT WITH 2 THE FIRST DIGIT WILL BE 0+2=2
        for(int i=1; i<=n; i++){
            number+=2;  // NUMBER+=2 MEANS THAT THE INCREMENT NEEDED FOR THE VARIABLE NUMBER IS BY DIDGIT 2
            
            System.out.println(number);
        }
        
    }

}
