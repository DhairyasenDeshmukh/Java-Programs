import java.util.*;

public class problem3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("WHAT WILL BE MAJOR, REMARKS OR NOTHING?: ");

        String input = sc.next();

        switch (input) {
            case ("REMARKS"): System.out.print("PLEASE ENTER YOUR MARKS MAJOR: ");
            int marks = sc.nextInt();
            if(marks>=90){
                System.out.println("This is Good");
            
            }else{
                if(89>=marks&&marks>=60){
                    System.out.println("This is also Good");
                }else{
                    if(59>=marks&&marks>=0){
                        System.out.println("This is Good as well");
                    }else{
                        System.out.println("ERROR INPUT");
                    }
                }
            }
                        
            break;
            case ("NOTHING"): System.out.print("OKAY MAJOR THAT WILL BE GOOD.");
            break;
        
            default: System.out.println("ASD");
                
        }

    }
}
    

