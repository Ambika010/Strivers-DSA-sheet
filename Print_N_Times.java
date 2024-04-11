import java.util.ArrayList;
import java.util.List;
public class Print_N_Times{
    public static List<String> printNtimes(int n){
        List<String> list = new ArrayList<>();
        Helper(n, list);
        return list;
    }
    public static void Helper(int n, List<String> list){
        if(n==0){
            return;
        }
        list.add("Coding Ninjas");
        Helper(n-1, list);
    }
    public static void main(String[] args) {
        System.out.println(printNtimes(5));
    }
}