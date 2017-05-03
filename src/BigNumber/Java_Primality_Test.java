package BigNumber;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by bvpham on 5/3/2017.
 */
public class Java_Primality_Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();

        if(n.isProbablePrime(1)) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}