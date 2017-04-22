package Java_Strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by bvpham on 4/21/2017.
 */
public class Java_String_Compare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        int k = scan.nextInt();

        SortedSet<String> sets=new TreeSet<String>();
        for(int i = 0; i <= S.length()-k; i++){
            sets.add(S.substring(i, i+k));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());
    }
}
