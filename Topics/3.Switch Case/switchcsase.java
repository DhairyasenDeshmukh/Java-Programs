import java.util.*;

public class switchcsase{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in)
        System.out.print("ENTER YOUR CAST:  ");

        String cast = sc.nextLine();

        switch (cast) {
            case "OPEN" : System.out.println("JEE PASS YET?");
            break;
            case "SC" : System.out.println("JAI BHEEM");
            break;
            default : System.out.println("NA"); 
        }
        
    
    }
}
