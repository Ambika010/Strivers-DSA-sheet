import java.util.*;
public class Pattern_e {
    public static void seeding(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void nNumberTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        seeding(n);
        nNumberTriangle(n);
    }
}