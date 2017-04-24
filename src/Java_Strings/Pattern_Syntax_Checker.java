package Java_Strings;
import java.util.*;
import java.util.regex.*;

/**
 * Created by bvpham on 4/24/2017.
 */
public class Pattern_Syntax_Checker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        while (i > 0) {
            String s = scan.nextLine();
          try{
              Pattern.compile(s);
              System.out.println("Valid");
          } catch(PatternSyntaxException exception){
              System.out.println("Invalid");
          }
        }
    }
}
