// USING STRING BUILDER

import java.util.*;

public class strbuilder {

    public static void main(String [] args){

        StringBuilder name = new StringBuilder("FUCK");
        System.out.println(name);

        System.out.println("CHANGING THE CHARACTERS");

        name.setCharAt(0,'D');
        name.setCharAt(1,'o');
        name.setCharAt(2,'n');
        name.setCharAt(3,'t');

        System.out.println(name);
    }
    
}
 