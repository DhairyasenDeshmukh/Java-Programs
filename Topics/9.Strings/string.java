import java.util.*;

public class string {

    public static void characters(String name){

        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i)+", ");
        }
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE USER NAME: ");
        String name = sc.nextLine();

        System.out.println("__________________");

        if(name.equals("DHAIRYASEN") || name.equals("Dhairyasen") || name.equals("dhairyasen")){
            System.out.println("WELCOME "+name);
        }else{
            System.out.println("INVALID USER");
        }

        System.out.println("THE CHARACTERS IN THE INPUT STRING ARE: ");
        System.out.println("__________________");

        characters(name);
    }
    
}
