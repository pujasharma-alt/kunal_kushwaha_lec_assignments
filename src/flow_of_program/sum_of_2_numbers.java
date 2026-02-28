package flow_of_program;

import java.util.Scanner;
public class sum_of_2_numbers
{
    // Take two numbers and print the sum of both.

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 2 digits to add: ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println("sum of "+num1+" and "+num2+" is= "+(num1+num2));
    }
}
