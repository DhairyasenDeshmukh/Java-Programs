import java.util.Scanner;

public class outputofarray {

    public static void main(String[] args){

        // SYNTAX:  datatype[]_name_of_array = new_datatype[size_of_array];
        int[] marks = new int[3];
        
        //  ASSIGNING VALUES TO EACH INDEX OF ARRAY
        marks[0] = 45;
        marks[1] = 98;
        marks[2] = 87;

        Scanner sc = new Scanner(System.in);

        System.out.print("OF WHAT INDEX YOU WANT THE VALUE? : ");
        int n = sc.nextInt();

        System.out.print(marks[n]);

        
    }
    
}
