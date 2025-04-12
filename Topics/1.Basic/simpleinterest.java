import java.util.*;

public class simpleinterest {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE PRINCIPLE : ");
        int principle = sc.nextInt();
        System.out.print("ENTER THE RATE % : ");
        int rate = sc.nextInt();
        System.out.print("ENTER THE NO OF YEARS FOR FINDING THE INTEREST : ");
        int time = sc.nextInt();
        int SIMPLE_INTEREST = (principle*rate*time)/100;
        System.out.print("THE SIMPLE INTEREST FOR THE GIVEN PRINCIPLE FOR THE GIVEN TIME IS : "+SIMPLE_INTEREST); 
        
    }
}
