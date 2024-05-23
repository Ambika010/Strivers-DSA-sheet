/*
Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.
Input : n=5
Output : 225
Explanation:
1^3+2^3+3^3+4^3+5^3=225
*/

public class Sum_Of_Series {
    static long sumOfSeries(long n) {
        // code here
        if(n==0){
            return 0;
        }
        long result = sumOfSeries(n-1);
        result = result + (long)Math.pow(n,3);
        return result;
    }
    public static void main(String[] args) {
        long n=5;
        long result=sumOfSeries(n);
        System.out.println(result);
    }
}
