import java.util.*;

public class problem1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE FIRST NUMBER: ");
        double a = sc.nextDouble();

        System.out.print("ENTER THE OPERATOR (+,-,*) : ");
        String operator = sc.next();

        System.out.print("ENTER THE SECOND NUMBER: ");
        double b = sc.nextDouble();

        double result = 0;

        switch (operator){
            case "+": result = a+b;
            break;
            case "-": result = a-b;
            break;
            case "*": result = a*b;
            default: System.out.println("ERROR");
        }

        System.out.println("RESULT : "+result);




    }
}