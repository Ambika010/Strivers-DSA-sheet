// You are given a sorted integer array 'arr' of size 'n'.
// You need to remove the duplicates from the array such that each element appears only once.
// Return the length of this new array.
import java.util.*;
public class Remove_duplicates {
    public static int removeDuplicates(int[] arr,int n) {
        int index = 1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){ //checks whether the current index value is equal to the previous index value or not
                arr[index] = arr[i]; // if not, then place the current index value at the current value of index variable and then increment the value stored in the index variable
                index++;
            }
        }
        return index; //return the length of array containing unique elements only
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
        System.out.println("Required length of array : "+removeDuplicates(array,size));
    }
}
