import java.util.*;
import java.io.*;

/**
 * Created by bvpham on 4/11/2017.
 */
public class Java_Loops_II {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0; i<t; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int res = a;

            for(int j=0; j<n; j++){
                res += (int)(Math.pow(2,j) * b);
                System.out.print(Integer.toString(res) + " ");
            }
            System.out.print("\n");
        }
        scan.close();


    }
}
