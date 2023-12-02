//Step 1.1 Question 2
import java.util.Scanner;
public class Data_Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String datatype = sc.nextLine();
        System.out.println(dataTypes(datatype));//Function calling
    }
    public static int dataTypes(String type){
        switch(type){
            //when return statement is used then there is no need of using the break statement with the cases
            case "Integer":return 4;
            case "Long":return 8;
            case "Float":return 4;
            case "Double":return 8;
            case "Character":return 1;
        }
        return -1;
    }
}
