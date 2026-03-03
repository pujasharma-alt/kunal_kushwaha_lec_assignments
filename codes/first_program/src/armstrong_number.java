import java.util.Scanner;

public class armstrong_number {
    static int digcounter(int num)
    {
        int counter=0;
        while(num>0)
        {
            counter++;
            int digit = num % 10;
            num/=10;
        }
        return counter;
    }
    static boolean checker (int num)
    {
        int org=num;
        int power=digcounter(num);
        int checknum=0;
        while(num>0)
        {
            int digit = num % 10;
            checknum+=Math.pow(digit,power);
            num/=10;
        }
        return (checknum==org);
    }

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=in.nextInt();
        boolean res=checker(num);
        System.out.println(num+" is an Armstrong number= "+res);
    }
}
