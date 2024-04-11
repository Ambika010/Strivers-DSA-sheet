import java.util.Arrays;

public class Reverse_Array_1 {
    public static int[] reverseArray(int n, int []nums) {
        return Helper(n, 0, nums);
    }
    public static int[] Helper(int n, int index,int []nums){
        if(index==n){
            int result[]=new int[n];
            return result;
        }
        int result[]=Helper(n, index+1, nums);
        result[n - index - 1] = nums[index];
        /*
        for(int i=0;i<result.length;i++){
            result[i]=nums[n-1];
            n=n-1;
        }
        */
        return result;
    }
    public static void main(String[] args) {
        int nums[]={6,2,5,0,9,1,5,3,8};
        int result[]=reverseArray(9, nums);
        System.out.println(Arrays.toString(result));
    }
}
