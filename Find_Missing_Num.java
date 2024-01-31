/* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums. */


//Brute-force approach
//Time complexity = O(n^2), two for loops used
public class Find_Missing_Num {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        //outer for loop runs for the range of numbers to be present
        for(int i=0;i<n;i++){
            int flag = 0;
            //inner for loop runs to traverse the array elements i.e to find the missing no. 
            for(int j=0;j<n-1;j++){
                if(nums[j]==i){
                    // i is present in the array:
                    flag = 1;
                    break;
                }
            }
            // check if the element is missing
            //i.e flag == 0:
            if(flag==0){
                return i;
            }
        }
        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,3};
        System.out.println(missingNumber(arr));
    }
}
