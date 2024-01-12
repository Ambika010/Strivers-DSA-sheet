
// Step 1.4 Question 5
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		int sum=0;
		int count=0;
		// this while loop counts the number of digits
		while(x!=0){
			x=x/10;
			count++;
		}
        x=n;
		// this loop calculates the sum of digits raised to the power of no. of digits i.e
		// if n=340 then this while loop calculates 3^3+4^3+0^3
		while(x!=0){
			int rem=x%10;
			sum=sum+(int)Math.pow(rem, count);
            x=x/10;
		}
		if(n==sum){
			System.out.println("true");
		} 
        else{
			System.out.println("false");
		}
	}
}
