import java.util.Scanner;

public class fibo_series {
    // To calculate Fibonacci Series up to n numbers.
    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the nth digit: ");
        int end=in.nextInt();
        int i=0, sum=0, firstnum=0,secnum=1;;
        System.out.print(firstnum+" "+secnum+" ");
        while(sum<end)
        {
            sum=firstnum+secnum;
            firstnum=secnum;
            secnum=sum;
            System.out.print(sum+" ");
        }
    }
}
