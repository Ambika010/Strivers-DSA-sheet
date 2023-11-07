//Step 1.2
public class Pattern_j{
    public static void nLetterTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+j-1)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nLetterTriangle(6);
    }
}
