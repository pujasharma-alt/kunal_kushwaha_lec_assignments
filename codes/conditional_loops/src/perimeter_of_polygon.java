import java.util.Scanner;

public class perimeter_of_polygon {
    //Perimeter Of Circle
    //Perimeter Of Equilateral Triangle
    //Perimeter Of Parallelogram
    //Perimeter Of Rectangle
    //Perimeter Of Square
    //Perimeter Of Rhombus
    //Volume Of Cone Java Program
    static void circle(int radius){
        System.out.println("Area of the circle is: "+(3.14159265359*radius*2));
    }
    static void triangle(float side)
    {
        System.out.println("Area of the triangle is: "+(side*3));
    }
    static void parallelogram(double lenght, double width){
        System.out.println("Area of the Parallelogram is: "+2*(lenght+width));
    }
    static void rectangle(int len, double width){
        System.out.println("Area of the reactangle is: "+(2*(len+width)));
    }
    static void square(int s)
    {
        System.out.println("Area of the square is: "+(4*s));
    }
    static void rhombus(double q)
    {
        System.out.println("Area of the rhombus is: "+(4*q));
    }

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 1. circle 2.equilateral triangle 3.parallelogram 4. rectagle 5. square 6.rhombus area calculation: ");
        int check=in.nextInt();
        switch(check)
        {
            case 1:
                System.out.println("enter the radius: "); int radius=in.nextInt();
                circle(radius); break;
            case 2: System.out.println("enter the height: "); int height=in.nextInt();
                System.out.println("enter the base: "); float side=in.nextFloat();
                triangle(side); break;
            case 3: System.out.println("enter the length: "); double length1=in.nextDouble();
                System.out.println("enter the width: "); double width1=in.nextDouble();
                parallelogram(length1, width1); break;
            case 4: System.out.println("enter the length: "); int length=in.nextInt();
                System.out.println("enter the width: "); double width=in.nextDouble();
                rectangle(length, width); break;
            case 5: System.out.println("enter the side: "); int side1=in.nextInt();
                square(side1); break;
            case 6: System.out.println("enter the side: "); double length2=in.nextDouble();
                rhombus(length2); break;
        }

    }
}
