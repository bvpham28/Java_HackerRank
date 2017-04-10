import java.io.*;
import java.util.*;
/**
 * Created by bvpham on 4/10/2017.
 */
public class Java_Loops_I {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i = 1; i < 11; i++ ){
            System.out.println(a+ " x " + i + " = " + (a*i));
        }
    }
}
