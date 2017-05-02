package BigNumber;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by bvpham on 5/1/2017.
 */
public class Java_BigDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String[] S = new String[n + 2];
        for (int i = 0; i < n; i++) {
            S[i] = scan.next();
        }
        scan.close();

        BigDecimal b1, b2, a1, a2;
        String b;


        for (int i = 0; i < n - 1; i++) {
            b1 = new BigDecimal(S[i + 1]);
            b2 = new BigDecimal(S[i]);
            if (b1.compareTo(b2) == 1) {
                b = S[i + 1];
                S[i + 1] = S[i];
                S[i] = b;
                for (int j = i; j >= 1; j = j - 1) {
                    a1 = new BigDecimal(S[j]);
                    a2 = new BigDecimal(S[j - 1]);


                    if (a1.compareTo(a2) == 1) {
                        b = S[j];
                        S[j] = S[j - 1];
                        S[j - 1] = b;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(S[i]);
        }
    }
}