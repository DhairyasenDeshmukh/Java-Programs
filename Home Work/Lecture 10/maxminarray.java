//  2.	Find the maximum & minimum number in an array of integers.

import java.util.*;

public class maxminarray{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int Array[] = {1,2,3,4,5,6,7,8,9,10};

        int size = Array.length;

        int max = Array[0];
        int min = Array[0];

        for(int i=1; i<size; i++){

            if(Array[i]>max){
                max = Array[i];
            }
            if(Array[i]<min){
                min = Array[i];
            }
        }

        System.out.println("THE MIN IS: "+min);
        System.out.println("THE MAX IS: "+max);
    
    
    }
}