package Exception_Handling;
import java.util.*;
import java.util.Scanner;

/**
 * Created by bvpham on 5/21/2017.
 */
class myCalculator{
    public static int power(int n, int p) throws Exception{
        if(n < 0 || p < 0){
            throw new Exception ("n and p should be non-negative");
        } else {
            return ((int)Math.pow(n,p));
        }
    }
}

public class Java_Exception_Handling {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(scan.hasNextInt()){
            int n = scan.nextInt();
            int p = scan.nextInt();

            myCalculator my_calculator = new myCalculator();
            try{
                System.out.println(my_calculator.power(n, p));
            }catch(Exception e){
                System.out.println(e);
            }

        }

    }
}
