//  CREATING AN ARRAY WHERE USER INPUTS VALUE FOR EACH ELEMENT OF THE ARRAY

import java.util.*;

public class inputarray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("NUMBER OF SUBJECTS FOR THE SEMESTER: ");
        //  DECLARING SIZE FOR THE ARRAY
        int size = sc.nextInt();

        //  INITIALIZING ARRAY
        int marks[] = new int[size];
        int sub = 1;

        //  FOR LOOP FOR INPUTS OF ARRAY
        for(int i=0; i<size; i++){
            System.out.print("ENTER MARKS OF SUBJECT "+sub+" : "); 
            //  INPUTS OF VALUE IN ARRAY INDEX   
            marks[i]=sc.nextInt();
            sub++;
        }

        System.out.println();

        int num = 1;

        //  FOR LOOP FOR OUTPUT OF ARRAY
        for(int i=0; i<size; i++){
            System.out.println("MARKS OF SUBJECT "+num+" : "+marks[i]);
            num++;
        }
    }
    
}
