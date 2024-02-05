/*You are given a sorted array 'arr' of positive integers of size 'n'.
It contains each number exactly twice except for one number, which occurs exactly once.
Find the number that occurs exactly once.
Example :
Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.
Output: 2
Explanation: 1, 3, and 4 occur exactly twice. 2 occurs exactly once. Hence the answer is 2. */

//most optiomal approach 
/* Time Complexity: O(N), where N = size of the array.
Reason: We are iterating the array only once */

public class Find_Num_that_Appears_Once_02 {
    public static int getSingleElement(int []arr) {
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
}

/*
xor of any element with 0 is the element itself
xor of any two same elements is 0
XOR of all elements = 4^1^2^1^2 = 4 ^ (1^1) ^ (2^2) = 4 ^ 0 ^ 0 = 4^0 = 4 
Hence, 4 is the single element in the array.
*/