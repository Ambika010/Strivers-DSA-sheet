import java.util.HashMap;

//SOLUTION FOR ARRAYS CONTAINING +VE NUMBERS, -VE NUMBERS AND 0's

/* Ninja and his friend are playing a game of subarrays. They have an array ‘NUMS’ of length ‘N’. Ninja’s friend gives him an arbitrary integer ‘K’ and asks him to find the length of the longest subarray in which the sum of elements is equal to ‘K’.
Ninjas asks for your help to win this game. Find the length of the longest subarray in which the sum of elements is equal to ‘K’.
If there is no subarray whose sum is ‘K’ then you should return 0. */

//Optimal Approach
public class Longest_Subarray_with_given_Sum_K_positives_and_negatives {
    public static int longestSubarrayWithSumK(int []a, long k){
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
    }
    public static void main(String[] args) {
        int[] a = {1, 1, -1};
        long k = 1;
        int len = longestSubarrayWithSumK(a, k);
        System.out.println("The length of the longest subarray with sum K is: " + len);
    }
}
