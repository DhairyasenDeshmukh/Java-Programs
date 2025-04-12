//2.	Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

import java.util.*;

public class ques3 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE EMAIL: ");
        StringBuilder email = new StringBuilder(sc.nextLine());

        StringBuilder username = new StringBuilder("");  // CERATING AN EMPTY STRING (username)

        for(int i=0; i<email.length(); i++){
            char alpha = email.charAt(i);         // CREATING A CHARACTER 'alpha' FOR STORING THE CHAR AT INDEX 'i' IN 'email'
            if(email.charAt(i)=='@'){             // CHECKING IF THE CHAR AT INDEX 'i' IN email IS '@' 
                break;                            // IF '@' IS PRESENT THEN BREAK THE LOOP
            }else{
                username.append(alpha);           // ELSE ADD THE 'alpha'(CHAR AT INDEX 'i' OF THE 'email') AT THE END OF 'username'
            }
        }
        System.out.println("THE USERNAME IS: "+username);
    }
    
}
