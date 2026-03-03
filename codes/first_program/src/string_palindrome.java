import java.util.Scanner;

public class string_palindrome {
    static void main() {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the word:");
        String word=in.next();
        int len=word.length();
        boolean ans=true;
        for (int i=0;i<len/2;i++){
            if(word.charAt(i) != word.charAt(len-i-1)){
                ans = false;break;
            }

        }
        if(ans) System.out.println(word+" is palindrome");
        else System.out.println(word+" is NOT palindrome");
    }
}
