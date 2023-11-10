//Step 1.4
import java.util.*;
public class Check_for_Prime {
    public static String isPrime(int num) {
        boolean prime = true;
        if(num==1){
          prime=false;
        }else{
          for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime ? "YES" : "NO";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
    }
}
