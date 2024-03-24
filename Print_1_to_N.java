import java.util.Arrays;

public class Print_1_to_N{
    public static void printNosHelper(int arr[], int x){
        if(x==0){
            return;
        }
        printNosHelper(arr, x-1);
        arr[x-1]=x;
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[]=new int[x];
        printNosHelper(arr, x);
        return arr;
    }
    public static void main(String[] args) {
        int result[] = printNos(5);
        System.out.println(Arrays.toString(result));
    }
}