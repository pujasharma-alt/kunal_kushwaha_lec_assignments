import java.util.Scanner;

public class sum_until_zero {
    static void main() {
        Scanner in=new Scanner(System.in);
        String input;
        int sum=0;
        while(in.hasNext())
        {
            input=in.next();
            if(input.equals("0"))
            {
                break;
            }
            else sum+=Integer.parseInt(input);
        }
        System.out.println("The summation of all numbers is= "+sum);
    }
    }

