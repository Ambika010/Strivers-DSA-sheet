public class Pattern_p {
    public static void getNumberPattern(int n) {
        for(int i=1;i<=(2*n)-1;i++) {
            for(int j=1;j<=(2*n)-1;j++) {
                //line 14 to 18 calculates value of a new matrix i.e
                /* 0000000
                   0111110
                   0122210
                   0123210
                   0122210
                   0111110
                   0000000 for n=4(similarly for other n values)
                which is then converted into the required matrix by subtracting the values of the matrix from n */
                int top=i-1;
                int left=j-1;
                int right=((2*n)-1-j);
                int bottom=((2*n)-1-i);
                int value=Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print(n-value);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        getNumberPattern(4);
    }
}
