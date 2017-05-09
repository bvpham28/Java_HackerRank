package Data_Structure;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by bvpham on 5/9/2017.
 */
public class Java_List {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();


        ArrayList L = new ArrayList(N);
        for (int i = 0; i< N; i++){
            L.add(scan.nextInt());

        }

        int Q = scan.nextInt();

        while (Q-- > 0) {
            switch (scan.next()) {
                case "Insert":
                    L.add(scan.nextInt(), scan.nextInt());
                    break;

                case "Delete":
                    L.remove(scan.nextInt());
                    break;

                default:
                    System.out.println("Invalid operation.");
                    System.exit(-1);
                    break;
            }
        }
        scan.close();
        while (!L.isEmpty()) {
            System.out.print(L.remove(0) + " ");
        }
    }
}
