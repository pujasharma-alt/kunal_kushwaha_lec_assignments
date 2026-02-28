package flow_of_program;

import java.util.Scanner;
public class multiplication_table {
    // ake a number as input and print the multiplication table for it.

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number to print its table: ");
        int num=in.nextInt();
        for (int i=1; i<11;i++)
        {
            System.out.println(num+" x "+ i+" = "+(num*i));
        }
    }
}
