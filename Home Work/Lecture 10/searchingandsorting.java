import java.util.*;

public class searchingandsorting{

    public static void bubbleSort(int Array[], int size){
        for(int i=0;i<size-1;i++){
            for(int j=0; j<size-1-i; j++){
                if(Array[j]>Array[j+1]){
                    int temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }
        }
    }




    public static int linearsearch(int Array[], int size, int target){
        int j=0;
        for(j=0; j<size; j++){
            if(target == Array[j]){
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE SIZE OF THE ARRAY: ");
        int size = sc.nextInt();

        int Array[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the element at index "+i+" : ");
            Array[i] = sc.nextInt();
        }

        System.out.print("ENTER THE TARGET: ");
        int target = sc.nextInt();

        int result = linearsearch(Array, size, target);

        if(result == -1){
            System.out.println("THE TARGET WAS NOT FOUND");
        }else{
            System.out.println("THE TARGET WAS FOUND AT INDEX: "+result);
        }

        System.out.println("THE ARRAY IS :  ");

        for(int i=0; i<size; i++){
            System.out.println(Array[i]);
        }

        System.out.println("THE SORTED ARRAY IS: ");
        bubbleSort(Array, size);

        for(int i=0; i<size; i++){
            System.out.println(Array[i]);
        }


    }
}