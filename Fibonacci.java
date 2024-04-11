//Given an integer ‘n’, return first n Fibonacci numbers
//Input: ‘n’ = 5
//Output: 0 1 1 2 3
import java.util.Arrays;

public class Fibonacci {
    public static int[] generateFibonacciNumbers(int n) {
        if (n <= 0) {
            return new int[0]; // Return an empty array for n <= 0
        }
        int result[]=new int[n];
        oneFibonacciNumber(n, result);
        return result;
    }
    public static int oneFibonacciNumber(int n, int[] result){
        if(n<=0){ //base case
            return 0;
        }
        if(n==1){
            result[0]=0;
            return 0;
        }
        if(n==2){
            result[1]=1;
            return 1;
        }
        result[n-1]=oneFibonacciNumber(n-1, result)+oneFibonacciNumber(n-2, result);
        return result[n-1];
    }
    public static void main(String[] args) {
        int result[]=generateFibonacciNumbers(5);
        System.out.println(Arrays.toString(result));
    }
}
