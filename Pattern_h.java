//Step 1.2 Question 8
public class Pattern_h {
    public static void numberCrown(int n) {
        for(int i=1;i<=n;i++){
            int v=i;
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            int space=2*(n-i);
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(v);
                v=v-1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        numberCrown(5);
    }
}
