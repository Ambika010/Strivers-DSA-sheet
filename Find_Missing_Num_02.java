/* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums. */

//Optimal approach
//Time Complexity = O(N)
public class Find_Missing_Num_02 {
    public static int missingNumber(int[] nums){
        int n = nums.length;
        int sum1 = (n*(n+1))/2; //calculates the sum of all elements in the array including the missing one
        int sum2 = 0;
        for(int i=0;i<n;i++){
            sum2 += nums[i]; //calculates the sum of currently present elements in the array
        }
        int missing_num = sum1 - sum2; // Calculates the missing number by subtracting the sum of present elements from the sum of all elements
        return missing_num;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,5};
        System.out.println(missingNumber(arr));
    }
}