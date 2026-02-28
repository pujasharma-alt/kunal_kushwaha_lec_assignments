import java.util.Scanner;
public class print_name {

    //Take name as input and print a greeting message for that particular name.
    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your name: ");
        String name=in.nextLine();
        System.out.println("Hi! "+name);
    }
}
