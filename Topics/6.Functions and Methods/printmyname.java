//  CREATE A FUNCTION FOR PRINTING YOUR INPUT NAME

import java.util.Scanner;

public class printmyname {
    //  CREATE A MAIN FOR THE FUNCTION
    public static void printMyName(String name){
        
        //  TYPE THE OPERATION FOR THE FUNCTION
        System.out.println("WAKE UP "+name+" EASCAPE THE MATRIX ");
        
        //  STATEMENT FOR RETURNING TO THE LINE OF CODE FROM WHERE THE FUNCTION WAS CALLED
        return;
    }

    //  CREATE MAIN FOR RUNNING YOUR PROGRAM
    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);

        System.out.print("ENTER YOUR NAME : ");
        String name = sc.nextLine();
        System.out.println();
        
        //  CALLL THE FUNCTION BY TYPING ITS NAME AND ARGUMENTS IN IT
        printMyName(name);
        System.out.println();


    }
    
}
