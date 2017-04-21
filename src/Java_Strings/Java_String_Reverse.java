package Java_Strings;
import java.io.*;
import java.util.*;

/**
 * Created by bvpham on 4/21/2017.
 */
public class Java_String_Reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();

        if (S.equals(new StringBuilder(S).reverse().toString())) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
