import java.util.Arrays;
public class Print_N_to_1 {
    public static void printNosHelper(int arr[], int x){
        if(x==0){
            return;
        }
        arr[arr.length-x]=x;
        printNosHelper(arr, x-1);
    }
    public static int[] printNos(int x) {
        int arr[]=new int[x];
        printNosHelper(arr, x);
        return arr;
    }
    public static void main(String[] args) {
        int result[] = printNos(5);
        System.out.println(Arrays.toString(result));
    }
}
