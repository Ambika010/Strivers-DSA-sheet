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