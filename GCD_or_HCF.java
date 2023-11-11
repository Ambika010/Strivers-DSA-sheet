// Step 1.4 Question 4
import java.util.*;
public class GCD_or_HCF {
    public static int calcGCD(int n, int m){
        int gcd=1;
        for(int i=1;i<=n && i<=m;i++){
            if(n%i==0 && m%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(calcGCD(n,m));
    }
}
