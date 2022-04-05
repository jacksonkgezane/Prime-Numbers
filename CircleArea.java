import java.util.*;


public class CircleArea {
    
    public static void main(String[] args) {

        double Area = 0;
        final double pie = 3.14;
    
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Radius");
        int radius = input.nextInt();

        Area = pie * radius * radius;

        System.out.println("The area of a circle with a radius "+radius+" is "+Area);


    }
}
