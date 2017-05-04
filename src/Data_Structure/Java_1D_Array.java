package Data_Structure;
import java.util.*;

/**
 * Created by bvpham on 5/3/2017.
 */
public class Java_1D_Array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];


        for(int i =0; i<n; i++){
            int val = scan.nextInt();
            a[i] = val;
        }

        scan.close();

        for(int i =0; i < args.length; i++){
            System.out.println(a[i]);
        }
    }
}
