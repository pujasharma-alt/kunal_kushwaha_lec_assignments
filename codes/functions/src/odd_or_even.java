import java.util.Scanner;

public class odd_or_even {
    // Define a program to find out whether a given number is even or odd.
    static void check(int num){
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=in.nextInt();
        check(num);
    }
}
