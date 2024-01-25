//This is the optimal approach to the problem 
// Time Complexity = O(N)
import java.util.*;
public class Second_largest_2 {
    public static int[] getSecondOrderElements(int n, int []a){
        int largest = a[0];
        int sec_largest = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]>largest){ //when the current element is larger than the previous value of largest element then the current element becomes the largest and the previous value of largest element becomes the second largest
                sec_largest = largest;
                largest = a[i];
            }else if(a[i]<largest && a[i]>sec_largest){ //when the current element is less than the value of largest element and also the current element is smaller than the value of second largest
                sec_largest = a[i];
            }
        }
        int smallest = a[0];
        int sec_smallest = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(a[i]<smallest){
                sec_smallest = smallest;
                smallest = a[i];
            }else if(a[i]>smallest && a[i]<sec_smallest){
                sec_smallest = a[i];
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