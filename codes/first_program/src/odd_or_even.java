import java.util.Scanner;
public class odd_or_even {
    // Write a program to print whether a number is even or odd, also take input from the user.

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=in.nextInt();
        if(num%2!=0) System.out.println(num+" is a Odd no.");
        else System.out.println(num+" is a Even no.");
    }
}
