import java.util.Scanner;

public class max_min_methods {
    // Define two methods to print the maximum and
    // the minimum number respectively among three numbers entered by the user.
    static int max(int num1, int num2, int num3){
        return Math.max(num1,(Math.max(num2,num3)));
    }
    static int min(int num1, int num2, int num3){
        return Math.min(num1,(Math.min(num2,num3)));
    }

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 3 numbers: ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        int maxi=max(num1,num2,num3);
        int mini=min(num1,num2,num3);
        System.out.println("max number is= "+maxi);
        System.out.println("min number is= "+mini);
    }
}
