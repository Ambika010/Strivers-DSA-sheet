import java.util.*;
public class Right_Rotate_Array_by_K_places {
    public static int[] rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n; //// In case k is greater than the array length
        for(int i=0;i<k;i++){ //outer loop for no. of rotations to be made
            int j;
            int last = nums[n-1]; //Stores the last element of the array in the variable, This element will be moved to the front during the rotation
            for(j=n-1;j>0;j--){ //inner loop iterates from the last index to the second index of the array
                nums[j]=nums[j-1]; //Shifts the element at index j-1 to the position j (right shift)
            }
            nums[j] = last; //Sets the first element of the array (nums[0]) to the value stored in last, effectively moving the last element to the front
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("By how many places the right shift is to be performed : ");
        int k=sc.nextInt();
        int[] result = rotate(array, k);
        System.out.println("Required Array : " + Arrays.toString(result));
    }
}
