import java.util.Scanner;

public class sum_in_method {
    //Write a program to print the sum of two numbers entered by user by defining your own method.
    static int summation(int num1, int num2){
        return (num1+num2);
    }

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 2 numbers: ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println(summation(num1,num2));
    }
}
