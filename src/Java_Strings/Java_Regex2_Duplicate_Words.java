package Java_Strings;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bvpham on 4/25/2017.
 */
public class Java_Regex2_Duplicate_Words {
    public static void main(String[] args){
        String regex = "([a-z]+)(\\W+\\1\\b)*";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE + Pattern.MULTILINE);

        Scanner in = new Scanner(System.in);
        int numSentences = in.nextInt();

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            while(m.find()){
                input = input.replaceAll(m.group(), m.group(1));
            }

            System.out.println(input);
        }

        in.close();
    }
}
