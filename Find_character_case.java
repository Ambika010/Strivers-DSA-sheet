
//Step 1.1 Question 1
import java.util.*;
class Find_character_case{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int c = (int)ch; //typecasting character into ASCII values
        if(c>=65 && c<=90){ 
            System.out.println("1");
        }
        else if(c>=97 && c<=122){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }
    }
}
