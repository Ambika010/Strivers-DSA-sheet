// Step 1.4 Question 2 
/*  Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer 
range [-231, 231 - 1], then return 0.  */
import java.util.*;
public class Reverse_Integer {
    public static int reverse(int x) {
        int rev=0;
        while(x!=0){
            int r=x%10;
            /* when reversed number is less than the range. Since the minimum value is 
            -2,147,483,648, dividing it by 10 results in -214,748,364. If reversed is 
            less than than or equal to this value, adding the next digit would cause an overflow, so it returns 0. */

            /* (rev == Integer.MIN_VALUE / 10 && r < -8): This condition is used to handle 
            cases where adding the next digit could result in an underflow exactly at the 
            minimum value. If reversed is equal to Integer.MIN_VALUE / 10 (-214,748,364), 
            and the next digit r is less than -8, adding r to reversed would cause an 
            underflow. So, it also returns 0 in this case. */

            if((rev<Integer.MIN_VALUE/10) || (rev == Integer.MIN_VALUE/10 && r < -8 )){
                return 0;
            }

            /* when reversed number is greater than the range. Since the maximum value is 2,147,483,647, 
            dividing it by 10 results in 214,748,364. If reversed is greater than than or equal 
            to this value, adding the next digit would cause an overflow, so it returns 0. */

            /* (rev == Integer.MAX_VALUE / 10 && r > 7): This condition is used to handle 
            cases where adding the next digit could result in an overflow exactly at the 
            maximum value. If reversed is equal to Integer.MAX_VALUE / 10 (214,748,364), 
            and the next digit r is greater than 7, adding r to reversed would cause an 
            overflow. So, it also returns 0 in this case. */

            if((rev>Integer.MAX_VALUE/10) || (rev == Integer.MAX_VALUE/10 && r > 7)){
                return 0;
            }
            rev=rev*10+r;
            x=x/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}
