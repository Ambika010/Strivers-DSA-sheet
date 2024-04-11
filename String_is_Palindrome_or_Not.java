//Determine if a given string ‘S’ is a palindrome using recursion. 
//Return a Boolean value of true if it is a palindrome and false if it is not.
//Example:
//Input: s = "racecar"
//Output: true
//Explanation: "racecar" is a palindrome.

public class String_is_Palindrome_or_Not {
    public static boolean isPalindrome(String str) {
        String s=reverseString(str);
        return str.equals(s);
    }
    static String reverseString(String s){
        if(s.length()==0){
            return "";
        }
        String smallString = s.substring(1);
        String result = reverseString(smallString);
        return result+s.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("abbbbba"));
    }
}