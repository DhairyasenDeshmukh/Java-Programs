//  5.	Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote

import java.util.*;

public class question5 {

    public static void vote(int age, String name){

        
            if(age>=18){
                System.out.print("HEY "+name+" YOU ARE ELIGIBLE FOR VOTING");
            }else{
                System.out.print("HEY "+name+" YOU NOT ARE ELIGIBLE FOR VOTING");
            }
        

        return;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("NAME OF THE CANDIDATE : ");
        String name = sc.next();

        System.out.print("ENTER THE AGE OF THE CANDIDATE : ");
        int age = sc.nextInt();

        vote(age, name);
    }
    
}
