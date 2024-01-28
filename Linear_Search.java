/* You are given an array ‘arr’ containing ‘n’ integers. You are also given an integer ‘num’, and your task is to find whether ‘num’ is present in the array or not.
If ‘num’ is present in the array, return the 0-based index of the first occurrence of ‘num’. Else, return -1. */
import java.util.*;
public class Linear_Search {
    public static int linearSearch(int n, int num, int []arr){
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
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
        System.out.print("Enter the element to search : ");
        int key=sc.nextInt();
        int index = linearSearch(size, key, array);
        if(index==-1){
            System.out.println("element is not present in the array");
        }else{
            System.out.println("Element found at index : "+index);
        }
    }
}