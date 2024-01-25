//You have been given an array ‘a’ of ‘n’ non-negative integers.You have to check whether the given array is sorted in the non-decreasing order or not.
//return 1 if the given array is sorted. Else, return 0.
import java.util.*;
public class Sorted_Array_Or_Not {
    public static int isSorted(int n, int []a){
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                return 0;
            }
        }
        return 1;
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
        System.out.println("Required output : "+isSorted(size, array));
    }
}
