import java.util.Scanner;

public class circum_area_circle {
    //Write a program to print the circumference
    //and area of a circle of radius entered by user by defining your own method.
    static double circum(int radius){
        return (2.0*Math.PI*radius);
    }
    static double area(int radius){
        return (Math.PI*radius*radius);
    }

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter radius of circle: ");
        int radius=in.nextInt();
        System.out.println(circum(radius));
        System.out.println(area(radius));
    }
}
