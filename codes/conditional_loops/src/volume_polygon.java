import java.util.Scanner;

public class volume_polygon {
    //Volume Of Prism
    //Volume Of Cylinder
    //Volume Of Sphere
    //Volume Of Pyramid
    static void prism(int b, int h, int l){
        System.out.println("Volume of prism is: "+(1/2*b*h*l));
    }
    static void cylinder(int rad, int h){
        System.out.println("Volume of prism is: "+(3.14159265359*rad*rad*h));
    }
    static void sphere(double rad){
        System.out.println(4.0/3.0*3.14159265359*rad*rad);
    }
    static void pyramid(double l, double w, double h){
        System.out.println("Volume of prism is: "+(1.0/3.0*w*h*l));
    }

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 1.Prism 2. Cylinder 3.Sphere 4.Pyramid to calculate the volume: ");
        int choice=in.nextInt();
        switch(choice){
            case 1:
                System.out.println("enter the breadth: "); int breadth=in.nextInt();
                System.out.println("enter the heigth: "); int height=in.nextInt();
                System.out.println("enter the length: "); int length=in.nextInt();
                prism(breadth, height, length); break;
            case 2:
                System.out.println("enter the radius: "); int radius=in.nextInt();
                System.out.println("enter the heigth: "); int height1=in.nextInt();
                cylinder(radius, height1); break;
            case 3:
                System.out.println("enter the radius "); double rad=in.nextDouble();
                sphere(rad); break;
            case 4:
                System.out.println("enter the length: "); double len=in.nextDouble();
                System.out.println("enter the width: "); double wid=in.nextDouble();
                System.out.println("enter the heigth: "); double ht=in.nextDouble();
                pyramid(len,wid,ht); break;

        }
    }
}
