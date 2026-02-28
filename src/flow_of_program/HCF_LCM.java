package flow_of_program;

import java.util.Scanner;
public class HCF_LCM
{
    // Take 2 numbers as inputs and find their HCF and LCM.

    static int HCF(int num1, int num2)
    {
        while (num1>0)
        {
            int rem=num1/num2;
            num2=num1;
            num1=rem;
        }
        return num2;
    }

    static int LCM (int num, int hcf)
    {
        return num*hcf;
    }

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 2 numbers: ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println("hcf of "+num1+" "+num2+" = "+HCF(num1,num2));
        System.out.println("lcm of "+num1+" "+num2+" = "+LCM(num1,HCF(num1,num2)));
    }
}
