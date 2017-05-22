package Exception_Handling;
import java.util.*;
import java.io.*;

/**
 * Created by bvpham on 5/19/2017.
 */
public class Try_Catch {

    public static void main(String[] args) {

        try( Scanner scan = new Scanner(System.in)){
            System.out.println(scan.nextInt()/scan.nextInt());
        } catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        } catch(ArithmeticException e){
            System.out.println(e);
        }
    }

}
