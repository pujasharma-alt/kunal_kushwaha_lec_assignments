import java.util.Scanner;
public class simple_interest {
    //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the Principal amt: ");
        int principal=in.nextInt();
        System.out.println("enter the time: ");
        int time=in.nextInt();
        System.out.println("enter the rate: ");
        int rate=in.nextInt();
        double si=(double)((principal*time*rate)/100.0);
        System.out.println("the simple interest is= "+si);
    }
}
