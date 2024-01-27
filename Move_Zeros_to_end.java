//Given an array 'arr' of 'n' non-negative integers, your task is to move all the zeros to the end of the array while keeping the non-zero elements at the start of the array in their original order. Return the modified array.
import java.util.*;
public class Move_Zeros_to_end {
    public static int[] moveZeros(int n, int []a) {
        int nonZeroIndex = 0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){ //this condition checks for all the non-zero elements in the array
                a[nonZeroIndex] = a[i]; //keep on storing the non-zero elements by skipping the zeros
                nonZeroIndex++;
            }
        }
        for(int i=nonZeroIndex;i<n;i++){
            a[i]=0; //once all the non-zero element is placed in it's original order, fill the remaining places in the array with zeros
        }
        return a;
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
        int[] result = moveZeros(size, array);
        System.out.println("Required Array : " + Arrays.toString(result));
    }
}
