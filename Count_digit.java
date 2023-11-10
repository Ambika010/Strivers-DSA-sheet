//Step 1.4
//count only that number of digits which divides the number n completely 
import java.util.*;
public class Count_digit {
    public static int countDigits(int n){
        int count=0;
        int x=n;
        while(x!=0){
            int r=x%10;
            x=x/10;
            try{
                if(n%r==0){
                count++;
                }
            }
            catch(Exception e){};
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(countDigits(num));
    }
}
