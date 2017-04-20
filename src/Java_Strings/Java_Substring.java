package Java_Strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by bvpham on 4/20/2017.
 */
public class Java_Substring {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println(S.substring(start, end));

    }
}
