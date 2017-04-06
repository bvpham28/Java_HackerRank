import java.util.Scanner;

/**
 * Created by bvpham on 4/6/2017.
 */
public class Java_If_Else {

    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n%2==1){
            System.out.println("Weird");
        }
        else if(n%2==0 && n>=2 && n<= 5){
            System.out.println("Not Weird");
        }
        else if(n%2==0 && n>=6 && n<=20){
            System.out.println("Weird");
        }
        else if(n > 20){
            System.out.println("Not Weird");
        }
    }
}
