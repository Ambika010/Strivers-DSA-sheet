/* for example : FOR N=5
WE NEED TO FIND SumOfDivisors(i) for all i from 1 to 5
SumOfDivisors(1) = 1
SumOfDivisors(2) = 2+1 = 3
SumOfDivisors(3) = 3+1 = 4
SumOfDivisors(4) = 4+2+1 = 7
SumOfDivisors(5) = 5+1 = 6
Therefore our answer should be SumOfDivisors(1)+SumOfDivisors(2)+SumOfDivisors(3)+SumOfDivisors(4)+SumOfDivisors(5) = 1+3+4+7+6 = 21  */
import java.util.*;
public class Sum_of_Al_Divisors {
    public static void sumOfAllDivisors(int n){
        int final_sum=0;
        for(int i=1;i<=n;i++){
            int sum=0; //the sum variable is initialized in the for loop as after every iteration it should be reset to 0 i.e if it is not done so for each value of i it continues to adds the divisors of the previous value of i
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            System.out.println("sum of divisors of "+i+" = "+sum);
            final_sum+=sum;
        }
        System.out.println("Final sum of all divisors: " + final_sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sumOfAllDivisors(n);
    }
}