import java.io.*;
import java.util.*;
/**
 * Created by bvpham on 4/11/2017.
 */
public class Java_End_of_file {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = 0;

        while(scan.hasNextLine()){
            String data = scan.nextLine();
            System.out.println((a+=1) + " " + data);
        }
    }
}


