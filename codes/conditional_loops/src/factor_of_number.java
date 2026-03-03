import java.util.Scanner;

public class factor_of_number {
    // Input a number and print all the factors of that number
    static void factor(int num){
        for(int i=1;i<num/2;i++){
            if(num%i==0) System.out.print(i+" ");
        }
    }

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=in.nextInt();
        factor(num);
    }
}
