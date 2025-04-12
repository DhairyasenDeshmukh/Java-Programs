import java.util.*;

public class sumofnnumbersforloop{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Find the sum of first 'n' natural numbers where 'n' = ");
        int n = sc.nextInt();

        int sum = 0;  // USer has to initialise a value for the sum or it is also called as removing garbage value

        for(int i = 0; i <= n; i++){
            sum = sum+i;   // For loop will increase the value of i variable as long as the condition satisfies so the program will add sum with i to give new sum like interest
        }
        System.out.println(sum);


    }

}