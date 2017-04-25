package String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * Created by bryanpham626 on 4/24/17.
 */
public class Java_Regex {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String IP = scan.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
    }
}

class myRegex {
    String zeroTo255 = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
}

