//better approach to the problem
//time complexity for this approach = O(N)
import java.util.*;
public class Second_largest_1 {
    public static int[] getSecondOrderElements(int n, int []a){
        int largest = a[0];
        int sec_largest = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){ //this loop gives the value of largest element in the array
            if(a[i]>largest){
                largest=a[i];
            }
        }
        for(int i=0;i<n;i++){ //this loop gives the value of second largest element in the array
            if(a[i]>sec_largest && a[i]!=largest){ //the if condition checks that if the current element in the array is greater than the last value of second largest and if it is not equal to the largest element in the array then update the value of second largest
                sec_largest = a[i];
            }
        }
        int smallest = a[0];
        int sec_smallest = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){ //this loop gives the value of smallest element in the array
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        for(int i=0;i<n;i++){ //this loop gives the value of second smallest element in the array
            if(a[i]<sec_smallest && a[i]!=smallest){ //the if condition checks that if the current element in the array is smaller than the last value of second smallest and if it is not equal to the smallest element in the array then update the value of second smallest
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
