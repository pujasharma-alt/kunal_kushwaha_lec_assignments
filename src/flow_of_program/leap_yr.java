package flow_of_program;

import java.util.Scanner;
public class leap_yr
{
    // Input a year and find whether it is a leap year or not.

    static boolean  year(int yr) {
    if (yr % 100 == 0 && yr % 400 == 0) return true;
    if (yr % 4 == 0) return true;
    return false;
}
    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a yr");
        int yr=in.nextInt();
        System.out.println("the year is "+yr+" is a leap year: "+year(yr));

    }
}
