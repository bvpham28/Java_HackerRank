import java.util.*;
/**
 * Created by bvpham on 4/7/2017.
 */
public class Java_Stdin_andStdout_II {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String c = scan.nextLine();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);

    }
}
