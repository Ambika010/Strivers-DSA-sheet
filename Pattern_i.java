public class Pattern_i {
    public static void nNumberTriangle(int n){
        int value = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(value+" ");
                value = value+1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        nNumberTriangle(5);
    }
}