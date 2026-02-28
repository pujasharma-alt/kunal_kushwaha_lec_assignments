import java.util.Scanner;
public class calc_conditional {
    // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

    static void main() {
        Scanner in=new Scanner (System.in);
        System.out.println("enter 2 numbers: ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println("enter the operator of your choice: ");
        String operator=in.next();
        if(operator.equals("+")) System.out.println("the summation of nos. is= "+(num1+num2));
        if(operator.equals("-")) System.out.println("the subtraction of nos. is= "+(num1-num2));
        if(operator.equals("*")) System.out.println("the multiplication of nos. is= "+(num1*num2));
        if(operator.equals("/")) System.out.println("the division of nos. is= "+(num1/num2));
        else System.out.println("enter a valid operator +,-,/,*");

    }
}
