public class Pattern_n {
    public static void alphaTriangle(int n) {
        for(int i=1;i<=n;i++){
            char ch = (char)('A'+n-1);
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch=(char)(ch-1);
            }
            System.out.println();
        }
    }
    public static void alphaTriangle_1(int n) {
        for(int i=1;i<=n;i++){
            char ch = (char)('A'+n-i);
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch=(char)(ch+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphaTriangle(7);
        System.out.println();
        alphaTriangle_1(7);
    }
}
