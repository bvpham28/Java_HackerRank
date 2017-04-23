package Java_Strings;
import java.io.*;
import java.util.*;

/**
 * Created by bvpham on 4/23/2017.
 */
public class Java_String_Tokens {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s.trim();
        if(s.length()>400000){
            return;
        }
        else if(s.length()==0){
            System.out.println(0);
            return;
        }

        else{
            String demlims = "[!,?.*_'@\\ ]+";
            String[] tokens = s.split(demlims);
            System.out.println(tokens.length);

            for(String token : tokens){
                System.out.println(token);
            }


        }



    }
}
