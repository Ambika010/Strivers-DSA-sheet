/*You are given a sorted array 'arr' of positive integers of size 'n'.
It contains each number exactly twice except for one number, which occurs exactly once.
Find the number that occurs exactly once.
Example :
Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.
Output: 2
Explanation: 1, 3, and 4 occur exactly twice. 2 occurs exactly once. Hence the answer is 2. */

//Better Approach (using hashing)
//Time Complexity: O(N)+O(N)+O(N), where N = size of the array
public class Find_Num_that_Appears_Once_01 {
    public static int getSingleElement(int []arr) {
        int n = arr.length;
        int max = arr[0];
        for(int i=0;i<n;i++){ //this loop finds the maximum element in the array so that the size of the hash array can be defined equal to the (max element + 1) , so that all the elements can fit in the hash array
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int hash[] = new int[max+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++; //how many times a number is present in the original array is stored
        }
        for(int i=0;i<n;i++){
            if(hash[arr[i]] == 1){ //if hash array stores 1 for an element in the original array then that element in presenr once in the array
                return arr[i]; //return that element from the original array
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