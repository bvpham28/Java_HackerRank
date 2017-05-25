package Object_Oriented_Programming;
import java.util.*;

/**
 * Created by bvpham on 5/25/2017.
 */
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    int j= 0;
    public int divisor_sum(int n) {
        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                j = j+i;
            }
        }
        return j;
    }
}

public class Java_Interface {
    public static void main(String[] args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(my_calculator.divisor_sum(n) + "\n");
        scan.close();
    }

    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for(int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
        }