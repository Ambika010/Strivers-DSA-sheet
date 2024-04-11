import java.util.Arrays;

public class Reverse_Array_2 {
    public static int[] reverseArray(int n, int []nums) {
        Helper(n, 0, n-1, nums);
        return nums;
    }
    public static void Helper(int n, int start, int end, int []nums){
        if(start>=end){
            return;
        }
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        Helper(n, start+1, end-1, nums);
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int result[]=reverseArray(5, nums);
        System.out.println(Arrays.toString(result));
    }
}
