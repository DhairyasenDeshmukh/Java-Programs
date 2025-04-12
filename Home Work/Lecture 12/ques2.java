// 2.	Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

import java.util.*;

public class ques2 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE STRING: ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        System.out.println("THE ORIGINAL STRING: "+str);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'e'){       // CHECKING THE CHARACTER AT INDEX i
                str.setCharAt(i, 'i');   // CHANGING THE CHARACTER AT INDEX i
            }
        }

        System.out.println("CHANGED STRING: "+str);
    }
}
