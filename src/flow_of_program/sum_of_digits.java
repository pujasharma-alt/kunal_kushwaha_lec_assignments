package flow_of_program;

import java.util.Scanner;
public class sum_of_digits
{
    // Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number until x: ");
        String input;
        int sum=0;
        while(in.hasNext())
        {
            input=in.next();
            if(input.equals("x")||input.equals("X"))
            {
                break;
            }
            else sum+=Integer.parseInt(input);
        }
        System.out.println("The summation of all numbers is= "+sum);
    }
}
