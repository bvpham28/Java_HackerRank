package Data_Structure;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by bvpham on 5/7/2017.
 */
public class Java_Arraylist {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i<n; i++){
            int d = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int x = 0; x< d; x++){
                list.add(scan.nextInt());
            }
            lists.add(list);
        }

        int q = scan.nextInt();
        for(int i = 0; i<q; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> list = lists.get(x-1);
            if(y <= list.size()){
                System.out.println(list.get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
        scan.close();

    }
}
