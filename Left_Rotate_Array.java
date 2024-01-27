//Given an array 'arr' containing 'n' elements, rotate this array left once and return it.
//Rotating the array left by one means shifting all elements by one place to the left and moving the first element to the last position in the array.
import java.util.*;
public class Left_Rotate_Array {
    public static int[] rotateArray(int[] arr, int n) {
        int j;
        int first = arr[0]; //storing the first index element in the first variable
        for(j=0;j<n-1;j++){ //loop starts from 0th index and goes till (n-2)th index
            arr[j]=arr[j+1]; //replacing jth index with (j+1)th index
        }
        arr[j]=first; //replacing the last index with the 0th index element
        return arr;
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
        int[] result = rotateArray(array, size);
        System.out.println("Required new Array : " + Arrays.toString(result));
    }
}
