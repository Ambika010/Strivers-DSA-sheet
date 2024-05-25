/*
Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100

Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25

*/


public class PowerOfNum {
    /*
    // this solution gives correct answer but gives time limit exceeded error when submitting on leetcode
    public static double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        if(n<0){
            x=1/x;
            n=-n;
        }
        double result = myPow(x, n-1);
        result = result*x;
        return result;
    }
    */

    /*
    Logic : 
    x^n = x^(n/2) + x^(n/2), when n is even
    x^n = x^((n-1)/2) + x^((n-1)/2) + x ,when n is odd
    */
    public static double myPow(double x, int n){
        // when n is negative we convert the the problem to +ve exponent by taking the reciprocal of x and making n +ve
        if(n<0){
            x=1/x; // reciprocal of x
            if(n==Integer.MIN_VALUE){ // special case when n = -2147483648
                n=Integer.MAX_VALUE; // we make n = 2147483647 bcs if we make n +ve it will become 2147483648 which exceeds the limit of integer, so we substitute n with the max value of integer that is one less than the actual power and due to this we multiply one x with the result of x^(2147483647)
                return 0.5 * myPow(x, n);
            }else{
                n=-n; // making n +ve after doing reciprocal
            }
        }
        return myPowHelper(x, n);
    }
    public static double myPowHelper(double x, int n){
        if(n==0){
            return 1.0;
        }
        double half = myPowHelper(x, n/2);
        if(n%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }
    public static void main(String[] args) {
        //System.out.println(myPow(2.0,10));
        System.out.println(myPow(2.0, 10));
        System.out.println(myPow(2.0, -4));
        System.out.println(myPow(2.0, -2147483648));
    }
}
