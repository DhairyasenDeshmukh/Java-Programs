import java.util.*;

public class string {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE USER NAME: ");
        String name = sc.nextLine();

        System.out.println("__________________");

        if(name.equals("DHAIRYASEN") || name.equals("Dhairyasen") || name.equals("dhairyasen")){
            System.out.print("WELCOME "+name);
        }else{
            System.out.print("INVALID USER");
        }
    }
    
}
