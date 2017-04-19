package Java_Strings;
import java.util.*;

/**
 * Created by bvpham on 4/18/2017.
 */
public class Java_Strings_Introduction {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();

        System.out.println((A + B).length());
        System.out.println(A.compareTo(B)>0? "Yes":"No");
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) +" "
                + B.substring(0,1).toUpperCase() + B.substring(1));



    }
}
