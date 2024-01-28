//Given two sorted(only) arrays of size ‘n’ and ‘m’, return the union of the arrays.
//this code does is not used when the arrays are unsorted 
// to use this for unsorted arrays add one line to get the resulted union array in sorted array : Collections.sort(result);
import java.util.*;
public class Find_the_Union_1 {
    public static List< Integer > getUnion(int []a, int []b) {
        List<Integer> result = new ArrayList<>(); //new arraylist for storing the union of two arrays
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (i > 0 && a[i] == a[i - 1]) { 
                //Skip duplicates in the first array
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                //Skip duplicates in the second array
                j++;
                continue;
            }
            //these conditions add elements in the arraylist in sorted order
            if (a[i] < b[j]) {
                result.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                result.add(b[j]);
                j++;
            } else {
                // Both elements are equal, add any one of them to the result and increment both i and j
                result.add(a[i]);
                i++;
                j++;
            }
        }
        // Add remaining elements from the first array i.e when both the arrays are traversed but i remains less than the actual length of the array that means there are elements left in the array to be put into the resultant union of both the arrays 
        while (i < a.length) {
            if (i == 0 || a[i] != a[i - 1]) {
                result.add(a[i]);
            }
            i++;
        }
        // Add remaining elements from the second array i.e when both the arrays are traversed but j remains less than the actual length of the array that means there are elements left in the array to be put into the resultant union of both the arrays 
        while (j < b.length) {
            if (j == 0 || b[j] != b[j - 1]) {
                result.add(b[j]);
            }
            j++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array : ");
        int n = sc.nextInt(); 
        int a[] = new int[n];
        System.out.println("Enter the elements of first array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the size of second array : ");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter the elements of second array : ");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        List<Integer> union = getUnion(a, b);
        System.out.println("Union of two arrays : "+union);
    }
}


/* 
dry run the provided Java code with the example arrays a = {1, 2, 2, 4, 5, 6} and b = {2, 3, 5, 7}:

Step 1: Initialization

Initialize i = 0 and j = 0.
Initialize an empty result list.
Step 2: Traverse Arrays and Build the Union

Compare a[i] and b[j]: a[0] = 1 and b[0] = 2.

Since a[i] < b[j], add a[i] to the result (result = [1]) and increment i.
Compare a[i] and b[j]: a[1] = 2 and b[0] = 2.

Skip duplicate in a, increment i.
Compare a[i] and b[j]: a[2] = 2 and b[0] = 2.

Skip duplicate in a, increment i.
Compare a[i] and b[j]: a[3] = 4 and b[0] = 2.

Since a[i] > b[j], add b[j] to the result (result = [1, 2]) and increment j.
Compare a[i] and b[j]: a[3] = 4 and b[1] = 3.

Since a[i] > b[j], add b[j] to the result (result = [1, 2, 3]) and increment j.
Compare a[i] and b[j]: a[3] = 4 and b[2] = 5.

Since a[i] < b[j], add a[i] to the result (result = [1, 2, 3, 4]) and increment i.
Compare a[i] and b[j]: a[4] = 5 and b[2] = 5.

Skip duplicate in a, increment i.
Compare a[i] and b[j]: a[5] = 6 and b[2] = 5.

Since a[i] > b[j], add b[j] to the result (result = [1, 2, 3, 4, 5]) and increment j.
At this point, we have traversed both arrays.

Step 3: Handle Remaining Elements

Add remaining unique elements from array a to the result (result = [1, 2, 3, 4, 5, 6]).
Add remaining unique elements from array b to the result (result = [1, 2, 3, 4, 5, 6, 7]).

*/