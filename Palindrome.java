// Step 1.4
import java.util.*;
public class Palindrome {
    public static boolean palindromeNumber(int n){
        int x=n;
        int rev=0;
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(n==rev){
            return true;
        }else{
            return false;
        }
        /*if(x!=rev || x<0){   //leetcode condition (bcs for -121 the output is 121- which is not palindrome)
            return false;
        }else{
            return true;
        }*/
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindromeNumber(n));
    }
}
