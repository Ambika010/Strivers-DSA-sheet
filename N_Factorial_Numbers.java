import java.util.ArrayList;
public class N_Factorial_Numbers {
    static long factorial(long n){
        if(n==1){
            return 1;
        }
        long result=factorial(n-1);
        result=result*n;
        return result;
    }
    /*
    //This is my approach that does not give the correct answer
    static ArrayList<Long> factorialNumbers(long N){
        if(N == 0){
            ArrayList<Long> a=new ArrayList<Long>();
            return a;
        }
        ArrayList<Long> al = factorialNumbers(N-1);
        long result = factorial(N);
        if(result<=N){
            al.add(result);
        }
        return al;
    }
    */
    static void collectFactorialNumbers(long i, long N, ArrayList<Long> al) {
        long fact = factorial(i);
        if (fact > N) {
            return; 
        }
        al.add(fact);
        collectFactorialNumbers(i + 1, N, al); 
    }
    static ArrayList<Long> factorialNumbers(long N){
        ArrayList<Long> al = new ArrayList<>();
        collectFactorialNumbers(1, N, al); 
        return al;
    }
    public static void main(String[] args) {
        int N=6;
        ArrayList<Long> list = factorialNumbers(N);
        System.out.println(list);
    }
}
