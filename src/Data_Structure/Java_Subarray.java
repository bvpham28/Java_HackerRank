package Data_Structure;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by bvpham on 5/6/2017.
 */
public class Java_Subarray {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[]arr = new int[x];
        int[][]array = new int[x][x];
        int count = 0;

        for(int i = 0; i<x; i++){
            arr[i] = scan.nextInt();
            if(arr[i]<0) count++;
            array[i][i] = arr[i];
            for(int j=0; j<i; j++){
                array[j][i] = array[j][i-1]+arr[i];
                if(array[j][i]<0) count++;
            }
        }
        System.out.println(count);




    }
}
