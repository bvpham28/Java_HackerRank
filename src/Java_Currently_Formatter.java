import java.util.*;
import java.text.*;
/**
 * Created by bvpham on 4/18/2017.
 */
public class Java_Currently_Formatter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double payment = scan.nextDouble();
        //Scanner.close();


        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance( new Locale("en", "IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);


        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));


    }
}
