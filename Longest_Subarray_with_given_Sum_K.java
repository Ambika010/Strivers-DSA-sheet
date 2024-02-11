import java.util.HashMap;

//THSES ARE SOLUTIONS FOR ARRAYS CONTAINING ONLY +VE NUMBERS AND 0's (NO -VE NUMBERS)

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
    //Brute - Force approach [O(N^3)]
    /*public static int longestSubarrayWithSumK(int []a, long k) {
        int n = a.length;
        int len = 0 ;
        for(int i=0;i<n;i++){ //iterate over each starting index i
            int start = i; // Set the starting index for the current subarray
            for(int j=i;j<n;j++){ //iterate over each ending index j
                int end=j; // Set the ending index for the current subarray
                int sum = 0; // Initialize a variable to store the sum of the current subarray
                for(int t=start;t<=end;t++){ //calculate the sum of the subarray
                    sum = sum + a[t];
                }
                if(sum == k){ // Check if the sum of the current subarray is equal to the target sum 'k'
                    len = Math.max(len, j-i+1); // Update the length if the current subarray is longer
                }
            }
        }
        return len;
    }*/

    //Better Approach (using Hash Map)
    /*public static int longestSubarrayWithSumK(int []a, long k){
        int n=a.length;
        HashMap<Long, Integer> preSum = new HashMap<>(); //Create a HashMap to store prefix sums and their corresponding indices i.e. sum after adding each element and their index
        long sum=0;
        int maxLen=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i]; //Update sum by adding the current element
            if(sum == k){
                maxLen = Math.max(maxLen,i+1); //Update the maximum length if the current sum is equal to k
            }
            long rem = sum - k; //Calculate the remaining sum needed to reach the target sum (k)
            if(preSum.containsKey(rem)){ //Check if the remaining sum is present in the HashMap
                int len = i - preSum.get(rem); //Calculate the length of the subarray with the target sum
                maxLen = Math.max(maxLen,len); //Update the maximum length if the current length is greater
            }
            if(!preSum.containsKey(sum)){ //Check if the current sum is not already present in the HashMap
                preSum.put(sum, i); //Store the current sum along with its index in the HashMap
            }
        }
        return maxLen;
    }*/

    //Optimal Approach (using 2-pointers)
    public static int longestSubarrayWithSumK(int []a, long k){
        int n=a.length;
        int sum = a[0];
        int maxLen = 0;
        int pointer1 = 0,pointer2 = 0;
        while(pointer1 < n){ //while the pointer is less than the length of the array
            while(pointer2<=pointer1 && sum > k){ //when the 2nd pointer is less than or equal to the first pointer and when sum becomes greater than k
                sum = sum - a[pointer2]; //subtract the element to which the 2nd pointer points from the sum
                pointer2++; //after subtracting increment the second pointer and check the while condition again
            }
            if(sum==k){
                maxLen = Math.max(maxLen, pointer1-pointer2+1);
            }
            pointer1++; //at each step keep on incrementing the 1st pointer so that each element gets on adding to the sum
            if(pointer1<n){ //when 1st pointer is less than the length of array keep on adding the elements to the sum
                sum = sum+a[pointer1];
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = longestSubarrayWithSumK(a, k);
        System.out.println("The length of the longest subarray with sum K is: " + len);
    }
}