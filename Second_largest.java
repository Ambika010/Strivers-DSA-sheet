//Brute force approach
//Time complexity for brute force approach = O(nlog n)
import java.util.*;
public class Second_largest {
    public static int[] getSecondOrderElements(int n, int []a) {
        //condition for the array being empty or having only one element because with 0 or 1 element we cannont find the second largest
        if(n==0 || n==1){
            return new int[] {};
        }
        Arrays.sort(a); //this function sorts the array in ascending order
        int largest = a[n-1]; //as the array is sorted the last element will be the largest one
        int sec_largest = Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){ //this loop is to overcome the condition when there are duplicate elements in the array and (n-2)th element does not become the second largest element
            if(a[i]!=largest){
                sec_largest = a[i];
                break;
            }
        }
        int smallest = a[0]; //sorted array has first element as the smallest one
        int sec_smallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){ //when there are duplicate elements 
            if(a[i]!=smallest){
                sec_smallest = a[i];
                break;
            }
        }
        int arr[] = new int[2];
        arr[0] = sec_largest;
        arr[1] = sec_smallest;
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
        int[] result = getSecondOrderElements(size, array);
        System.out.println("Second smallest and second largest elements: " + Arrays.toString(result));
    }
}
