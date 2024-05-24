import java.lang.Character;
public class Recursive_Implementation_Of_Atoi {
    static final int Int_max = Integer.MAX_VALUE;
    static final int Int_min = Integer.MIN_VALUE;
    public static int myAtoi(String s) {
        s=s.trim();
        if(s.isEmpty()){
            return 0;
        }
        int sign = 1;
        int index = 0;
        if(s.charAt(0)=='-' || s.charAt(0)=='+'){
            sign = (s.charAt(0)=='+')?1:-1;
            index++;
        }
        return myAtoiHelper(s, index, 0, sign, true);
    }
    public static int myAtoiHelper(String s, int index, int num, int sign, boolean leadingZero){
        if((index >= s.length()) || (!Character.isDigit(s.charAt(index)))){
            return num*sign;
        }
        char c = s.charAt(index);
        int digit = c-'0';
        if(leadingZero && digit==0){
            return myAtoiHelper(s, index+1, num, sign, true);
        }
        if (num > (Int_max - digit) / 10) {
            return (sign == 1) ? Int_max : Int_min;
        }
        num=num*10+digit;
        return myAtoiHelper(s, index+1, num, sign, false);
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("000004193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-0000091283472332"));
        System.out.println(myAtoi("  -0012a42"));
    }
}