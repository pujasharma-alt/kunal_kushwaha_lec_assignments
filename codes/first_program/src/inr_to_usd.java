import java.util.Scanner;
public class inr_to_usd {
    //Input currency in rupees and output in USD.
    static void main() {
    Scanner in=new Scanner (System.in);
        System.out.println("enter the amt in INR: ");
        int inr=in.nextInt();
        System.out.println(inr+" into usd is $"+(inr*.011));
    }
}
