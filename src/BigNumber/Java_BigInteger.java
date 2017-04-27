package BigNumber;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by bvpham on 4/27/2017.
 */
public class Java_BigInteger {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        BigInteger number1 = new BigInteger(scan.next());
        BigInteger number2 = new BigInteger(scan.next());

        BigInteger C = number1.add(number2);
        BigInteger D = number1.multiply(number2);

        System.out.println(C);
        System.out.println(D);
    }
}
