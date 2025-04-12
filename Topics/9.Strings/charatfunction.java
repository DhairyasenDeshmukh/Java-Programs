// PRINTING EACH CHARACTER OF THE STRING GIVEN INPUT

import java.util.*;

public class charatfunction {

    public static void characters(String name){

        for(int i=0; i<=name.length(); i++){
            System.out.println(name.charAt(i));
        }
        return; 
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE STRING: ");
        String name = sc.nextLine();
        System.out.println("____________________________");

        System.out.println("THE CHARACTERS OF THE STRING ARE: ");
    
        characters(name);

    }
    
}
