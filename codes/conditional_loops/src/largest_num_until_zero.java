import java.util.Scanner;

public class largest_num_until_zero {
    // Take integer inputs till the user enters 0 and print the largest number from all.
    static void main() {
        Scanner in=new Scanner(System.in);
        String input;
        int max=Integer.MIN_VALUE;
        while(in.hasNext())
        {
            input=in.next();
            int inp=Integer.parseInt(input);
            if(max<inp)
                max=inp;
        }
        System.out.println("The max of all numbers is= "+max);
    }
}
