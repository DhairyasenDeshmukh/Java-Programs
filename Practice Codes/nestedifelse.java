import java.util.*;

public class nestedifelse{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(b>c){
                System.out.println("A IS THE LARGEST NUMBER");
            }else{
                if(a>c){
                    System.out.println("A IS THE LARGEST NUMBER");
                }else{
                    System.out.println("C IS THE LARGEST NUMBER");
                }
            }
        }else{
            if(b>c){
                System.out.println("B IS THE LARGEST NUMBER");
            }else{
                System.out.println("C IS THE LARGEST NUMBER");
            }
        }
}
}