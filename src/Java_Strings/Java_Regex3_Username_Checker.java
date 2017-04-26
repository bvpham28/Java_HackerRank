package Java_Strings;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bvpham on 4/26/2017.
 */
public class Java_Regex3_Username_Checker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases > 0){
            String username = scan.nextLine();

        String pattern = "^[aA-zZ]\\w{7,29}$";

        Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if(m.find()){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases --;
        }
    }

}
