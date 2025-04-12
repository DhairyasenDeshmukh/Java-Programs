import java.util.Scanner;

import java.util.*;

public class problem2{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        // Radius = r
        System.out.print("ENTER THE RADIUS OF CIRCLE: ");
        float r = sc.nextFloat();
        double pi = 3.14159;

        double area = pi*r;
        // REMEMBER VERY CAREFULLY TO INTER THE "+" OPERATOR IN THE PRINT STATEMENT
        System.out.print("AREA OF THE CIRCLE WHOSE RADIUS IS "+r+" : "+area);
    }
}