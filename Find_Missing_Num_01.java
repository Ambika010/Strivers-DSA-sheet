/* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums. */

//better approach
//Time Complexity = O(N) + O(N) = O(2*N)
public class Find_Missing_Num_01 {
    public static int missingNumber(int[] nums){
        int n=nums.length;
        /* why is the size of hash array n+1 ?? 
        For example, if N is 3, you want indices 0, 1, 2, and 3 to represent frequencies for numbers 0, 1, 2, and 3. Hence, you create an array of size 4 (N + 1) to cover the range from 0 to N. */
        int hash[] = new int[n+1]; //This array will be used to store the frequencies of numbers in the array i.e. how many times the number is appearing in the array
        for(int i=0;i<n;i++){
            hash[nums[i]]++; //if input array = {3,0,1} then hash array = {1,1,0,1} [initially, hash array = {0,0,0,0}]
        }
        for(int i=0;i<n;i++){
            if(hash[i]==0){
                return i; //If the frequency is zero, it means that the number is missing, and the missing number is returned
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,5};
        System.out.println(missingNumber(arr));
    }
}

/*
an array a = {2, 0, 1} and N = 3

First Loop (for (int i = 0; i < N; i++)):
This loop will iterate from i = 0 to i = 2 (N-1). The array indices are 0, 1, 2. So, it will access a[0], a[1], and a[2]
For i = 0: hash[2] is incremented
For i = 1: hash[0] is incremented
For i = 2: hash[1] is incremented
After this loop, the hash array might look like: hash = {1, 1, 1, 0}

Second Loop (for (int i = 0; i <= N; i++)):
This loop will iterate from i = 0 to i = 3 (N). The loop condition i <= N allows it to check frequencies for numbers 0, 1, 2, and 3

For i = 0: hash[0] is not zero, continue
For i = 1: hash[1] is not zero, continue
For i = 2: hash[2] is not zero, continue
For i = 3: hash[3] is zero, so return 3
Therefore, in this example, the missing number is 3, and the loop conditions ensure that both valid array indices and the upper bound are covered
*/
