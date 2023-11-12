// Step 1.4 Question 2 coding ninja
public class Reverse_Bits {
    public static void reverseBits(long n) {
        // long pow=0;
        // long bin_num=0;
        // while(n>0){
        //     long rem = n%2;
        //     bin_num = bin_num+(rem*((long)Math.pow(10, pow)));
        //     pow++;
        //     n=n/2;
        // }
        String bin_num = Long.toBinaryString(n);
        while(bin_num.length()<32){
            bin_num='0'+bin_num;
        }
        System.out.println(bin_num);
        //String str = Long.toString(bin_num);
        StringBuilder  rev_num = new StringBuilder(bin_num).reverse();
        System.out.println(rev_num);
        String s=rev_num.toString();
        //long num = Long.parseLong(s);
        //System.out.println(num);



        int dec_num=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            char ch = s.charAt(length-1-i);
            if(ch=='1'){
                dec_num+=Math.pow(2,i);
            }
        }


        
        // long rev=0;
        // while(bin_num!=0){
        //     long r=bin_num%10;
        //     rev=rev*10+r;
        //     bin_num=bin_num/10;
        // }
        // long pow_1=0;
        // long dec_num=0;
        // while(num>0){
        //     long rem_1=num%10;
        //     dec_num=dec_num+(rem_1*((long)Math.pow(2, pow_1)));
        //     pow_1++;
        //     num=num/2;
        // }
        System.out.println(dec_num);
        // return dec_num;
    }  
    public static void main(String[] args) {
        reverseBits(13);
    }
}
