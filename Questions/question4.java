//  4.	Write a function that takes in the radius as input and returns the circumference of a circle

import java.util.*;

public class question4 {

    public static void circumference(float radius, double circum){

        circum = 2*(3.145)*radius;

        System.out.print("THE CIRCUMFERENCE OF THE CIRCLE OF RADIUS "+radius+" IS: "+circum);

        return;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE RADIUS OF THE CIRCLE: ");
        float radius = sc.nextFloat();

        circumference(radius, radius);
        }
    
}
