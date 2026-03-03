import java.util.Scanner;
public class area_of_polygon {
    //Area Of Circle Java Program
    //Area Of Triangle
    //Area Of Rectangle Program
    //Area Of Isosceles Triangle
    //Area Of Parallelogram
    //Area Of Rhombus
    static void circle(int radius){
        System.out.println("Area of the circle is: "+(3.14159265359*radius*radius));
    }
    static void triangle(int height, int base)
    {
        System.out.println("Area of the triangle is: "+(1/2*height*base));
    }
    static void rectangle(int lenght, double width){
        System.out.println("Area of the reactangle is: "+(lenght*width));
    }
    static void isotriangle(int s, int a, int b, int c){
        System.out.println("Area of Isosceles Triangle is: "+(Math.sqrt(s*((s-a)*(s-b)*(s-c)))));
    }
    static void parallelogram(double lenght, double width){
        System.out.println("Area of the Parallwlogram is: "+(lenght*width));
    }
    static void rhombus(int p, double q)
    {
        System.out.println("Area of the rhombus is: "+(1/2*p*q));
    }

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 1. circle 2.triangle 3.rectangle 4.isoceles triangle 5.parallelogram 6. rhombus area calculation: ");
        int check=in.nextInt();
        switch(check)
        {
            case 1:
                System.out.println("enter the radius: "); int radius=in.nextInt();
                circle(radius); break;
            case 2: System.out.println("enter the height: "); int height=in.nextInt();
                System.out.println("enter the base: "); int base=in.nextInt();
                triangle(height, base); break;
            case 3: System.out.println("enter the length: "); int length=in.nextInt();
                System.out.println("enter the width: "); double width=in.nextDouble();
                rectangle(length, width); break;
            case 4: System.out.println("enter the a: "); int a=in.nextInt();
                System.out.println("enter the b: "); int b=in.nextInt();
                System.out.println("enter the c: "); int c=in.nextInt();
                System.out.println("enter the d: "); int d=in.nextInt();
                isotriangle(a,b,c,d); break;
            case 5: System.out.println("enter the length: "); double length1=in.nextDouble();
                System.out.println("enter the width: "); double width1=in.nextDouble();
                parallelogram(length1, width1); break;
            case 6: System.out.println("enter the length: "); int length2=in.nextInt();
                System.out.println("enter the width: "); double width2=in.nextDouble();
                rhombus(length2, width2); break;
        }

    }
}
