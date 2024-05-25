/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
The algorithm for myAtoi(string s) is as follows:
Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-2^31, (2^31 - 1)], then round the integer to remain in the range. Specifically, integers less than -2^31 should be rounded to -2^31, and integers greater than (2^31 - 1) should be rounded to (2^31 - 1).
Return the integer as the final result.
*/

import java.lang.Character;
public class Recursive_Implementation_Of_Atoi {
    // Constants for the maximum and minimum values of a 32-bit signed integer
    static final int Int_max = Integer.MAX_VALUE;
    static final int Int_min = Integer.MIN_VALUE;
    public static int myAtoi(String s) {
        s=s.trim(); // Trimming Whitespaces (leading and trailing both)
        if(s.isEmpty()){ 
            return 0;
        }
        int sign = 1;
        int index = 0;

        // Signedness
        // Determine the sign based on the first character
        if(s.charAt(0)=='-' || s.charAt(0)=='+'){
            sign = (s.charAt(0)=='+')?1:-1;
            index++; // Move to the next character
        }
        return myAtoiHelper(s, index, 0, sign, true);
    }
    public static int myAtoiHelper(String s, int index, int num, int sign, boolean leadingZero){
        // Base case: If we've reached the end of the string or a non-digit character
        if((index >= s.length()) || (!Character.isDigit(s.charAt(index)))){
            return num*sign; // Return the accumulated number with the correct sign
        }
        char c = s.charAt(index); // get the character at the current index value
        int digit = c-'0'; // converts character to digit

        // Conversion : skip leading zeros
        if(leadingZero && digit==0){
            return myAtoiHelper(s, index+1, num, sign, true);
        }

        // Rounding
        // Ensure the number does not exceed the range of a 32-bit signed integer.
        if (num > (Int_max - digit) / 10) {
            return (sign == 1) ? Int_max : Int_min;
        }
        num=num*10+digit; // Update the accumulated number
        return myAtoiHelper(s, index+1, num, sign, false); // Process the next character
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
