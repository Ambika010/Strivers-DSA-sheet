/*
The Road Department is planning to make some new traffic regulations. But to make the regulations they need to analyze the current situation of the traffic.
The traffic can be analyzed from an array 'VEHICLE' of length 'N' , which consists of ‘0’ if there is no vehicle at that point and ‘1’ if there is a vehicle at the point.
Unfortunately the array ‘VEHICLE’ got corrupted as at most 'M' '1' got flipped to ‘0’.
Traffic jam is defined as the length of consecutive vehicles on the road.
The Road Department wants to know the worst possible scenario for the traffic jam. Return the maximum possible length of the consecutive vehicles.
Example:
Input: ‘N’ = 3, ‘M’ = 1, VEHICLE’ = [0, 1, 1]
Output: 3
Explanation:As there is at most one 1 that got flipped to 0, so for the worst-case scenario we can reflip the first(1-based ) index to 1, resulting in a length of 3. 
*/

public class Maximum_Consecutive_Ones_2nd_ques {
    public static int traffic(int n, int m, int []vehicle) {
        int left = 0;  // Left pointer for the window
        int right = 0; // Right pointer for the window
        int maxConsecutiveLength = 0;
        int zeroCount = 0; // Count of '0's in the current window
        // Iterate through the array using the sliding window approach
        while (right < n) {
            if (vehicle[right] == 0) {
                zeroCount++;
            }
            // Shrink the window if the number of '0's exceeds the limit 'm'
            while (zeroCount > m) {
                if (vehicle[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            // Update the maximum consecutive length
            maxConsecutiveLength = Math.max(maxConsecutiveLength, right - left + 1);
            // Move the right pointer to the next element
            right++;
        }
        return maxConsecutiveLength;
    }
    public static void main(String[] args) {
        int n = 10;
        int m = 2;
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 1, 1, 1};
        int result = traffic(n, m, arr);
        System.out.println("Max Consecutive length of vehicles : "+result);
    }
}
