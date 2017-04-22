package Java_Strings;
import java.io.*;
import java.util.*;

/**
 * Created by bvpham on 4/22/2017.
 */
public class Java_Anagrams {
    static boolean isAnagram( String A, String B) {
        char[] a = A.toLowerCase().toCharArray();
        char[] b = B.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        scan.close();
        boolean ret = isAnagram(a,b);
        System.out.println( (ret) ? "Anagram" : "Not Anagram");
    }
}
