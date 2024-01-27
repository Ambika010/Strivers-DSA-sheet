//Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.
import java.util.*; //ArrayList class is also present in util package
public class Left_Rotate_Array_by_K_places {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        for(int i=0;i<k;i++){
            int first = arr.remove(0); //the remove function belongs to the Arraylist class, this statement removes the element stored at 0th index
            arr.add(first); //add function always adds the element to the last, so this statement adds the 0th index element at the last index which automatically shifts the other elements to the left
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(2);
        num.add(9);
        num.add(3);
        num.add(5);
        num.add(1);
        System.out.println("Array elements : "+num);
        System.out.print("By how many places the left shift is to be performed : ");
        int k=sc.nextInt();
        System.out.println("Rotated Array : "+rotateArray(num, k));
    }
}
