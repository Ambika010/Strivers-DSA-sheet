/*You are given a sorted array 'arr' of positive integers of size 'n'.
It contains each number exactly twice except for one number, which occurs exactly once.
Find the number that occurs exactly once.
Example :
Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.
Output: 2
Explanation: 1, 3, and 4 occur exactly twice. 2 occurs exactly once. Hence the answer is 2. */

//Brute-Force approach
//Time Complexity = O(N^2) 
public class Find_Num_that_Appears_Once {
    public static int getSingleElement(int []arr){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int num = arr[i]; // Get the current element
            for(int j=0;j<n;j++){
                if(arr[j]==num){ //If the current element matches with an element in the array that means that the element is present more than once in the array
                    count++; // Increment the count
                }
            }
            if(count == 1){ //If the count is 1, it means the current element occurred exactly once
                return num; // Return the current element as the single element
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}
