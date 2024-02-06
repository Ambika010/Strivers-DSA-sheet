/* You are given an array 'a' of size 'n' and an integer 'k'.
Find the length of the longest subarray of 'a' whose sum is equal to 'k'.
Example :
Input: ‘n’ = 7 ‘k’ = 3
‘a’ = [1, 2, 3, 1, 1, 1, 1]
Output: 3
Explanation: Subarrays whose sum = ‘3’ are:
[1, 2], [3], [1, 1, 1] and [1, 1, 1]
Here, the length of the longest subarray is 3, which is our final answer */


public class Longest_Subarray_with_given_Sum_K {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int n = a.length;
        int len = 0 ;
        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end=j;
                int sum = 0;
                for(int t=start;t<=end;t++){
                    sum = sum + a[t];
                }
                if(sum == k){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = longestSubarrayWithSumK(a, k);
        System.out.println("The length of the longest subarray with sum K is: " + len);
    }
}