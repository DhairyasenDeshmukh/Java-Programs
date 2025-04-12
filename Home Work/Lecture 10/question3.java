//  Check if the array is in ascending order or not

import java.util.*;

public class asd {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ELEMENTS IN THE ARRAY: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];
        int a = 1;

        for(int i=0; i<size; i++){
            System.out.print("DIGIT "+a+": ");
            numbers[i] = sc.nextInt();
            a++;
        }

        System.out.println();

        for(int i=0; i<size-1; i++){
            if(numbers[i]<numbers[i+1]){
                continue;
            }
            
        }
        System.out.print("THE ARRAY IS IN ASCENDING ORDER");
    }
    
}
