package Data_Structure;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created by bvpham on 5/13/2017.
 */
public class Java_Generics {

    class Printer {
        <T>void printArray(T a[]){
            for(T obj:a){
                System.out.println(obj);
            }
        }
    }

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}