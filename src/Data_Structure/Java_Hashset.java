package Data_Structure;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by bvpham on 5/12/2017.
 */
public class Java_Hashset {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        String[] left = new String[input];
        String[] right = new String[input;

        for (int i = 0; i < input; i++){
            left[input] = scan.next();
            right[input] = scan.next();

        }

        Set set =  new HashSet();
        for (int i =0 ; i<input ;i++){
            set.add(left[i]+"_"+right[i]);
            System.out.println(set.size());
        }






    }
}
