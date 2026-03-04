import java.util.Scanner;

public class voting_eligibility {
    // A person is eligible to vote if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is eligible to vote.
    static void eligibility(int age){
        if(age>=18)
            System.out.println("eligible");
        else
            System.out.println("NOT eligible");
    }

    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter your age: ");
        int age=in.nextInt();
        eligibility(age);
    }
}
