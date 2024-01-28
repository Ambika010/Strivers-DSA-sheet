//The union of two arrays (either sorted or unsorted) of size n and m can be defined as an array consisting of the common and the distinct elements of the two arrays. The final array should be sorted in ascending order.

//solution is written using hashset
//A HashSet automatically ensures that it contains unique elements. When you add elements to a HashSet, duplicates are automatically eliminated avoiding the need for nested loops and conditional checks to handle duplicates.
/* Why Elements in Union Do Not Get Repeated:
When elements from both arrays are added to the HashSet, any duplicates are automatically ignored. */
import java.util.*;
public class Find_the_Union {
    private static ArrayList<Integer> getUnion(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> Union = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>(); 
        for (int i = 0; i < n; i++) {
            s.add(arr1[i]); //elements of first array is added to hash set
        }
        for (int i = 0; i < m; i++) {
            s.add(arr2[i]); //elements of second array is added to hash set
        }
        for (int i : s) {
            Union.add(i); //elements of hash set is added to the arraylist
        }
        Collections.sort(Union); //sorting the elements of the array list
        return Union;
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
        ArrayList<Integer> union = getUnion(a, b, n, m);
        System.out.println("Union of two arrays : "+union);
    }
}