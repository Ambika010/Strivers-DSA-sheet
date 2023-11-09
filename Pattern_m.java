// Step 1.2
public class Pattern_m {
    public static void alphaHill(int n){
        for(int i=1;i<=n;i++){
            int space=n-i;
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+j-1));
            }
            for(int j=i-1;j>=1;j--){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphaHill(5);
    }
}
