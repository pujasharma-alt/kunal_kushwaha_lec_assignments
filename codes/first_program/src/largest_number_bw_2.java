import java.util.Scanner;
public class largest_number_bw_2 {
    // Take 2 numbers as input and print the largest number.
    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 2 numbers to compare");
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println("largest number among "+num1+" "+num2+" is= "+(Math.max(num1, num2)));
    }
}
