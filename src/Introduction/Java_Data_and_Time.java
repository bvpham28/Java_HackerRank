import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Calendar;

/**
 * Created by bvpham on 4/17/2017.
 */
public class Java_Data_and_Time {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        int month1 = Integer.parseInt(month);
        int day1 = Integer.parseInt(day);
        int year1 = Integer.parseInt(year);

        Calendar c = new GregorianCalendar(Integer.parseInt(year),
                (Integer.parseInt(month)-1),(Integer.parseInt(day)-1));


        if (c.get(Calendar.DAY_OF_WEEK) == 1){
            System.out.println("MONDAY");
        }
        else if (c.get(Calendar.DAY_OF_WEEK) == 2){
            System.out.println("TUESDAY");
        }
        else if (c.get(Calendar.DAY_OF_WEEK) == 3){
            System.out.println("WEDNESDAY");
        }
        else if (c.get(Calendar.DAY_OF_WEEK) == 4){
            System.out.println("THURSDAY");
        }
        else if (c.get(Calendar.DAY_OF_WEEK) == 5){
            System.out.println("FRIDAY");
        }
        else if (c.get(Calendar.DAY_OF_WEEK) == 6){
            System.out.println("SATURDAY");
        }
        else if (c.get(Calendar.DAY_OF_WEEK) == 7){
            System.out.println("SUNDAY");
        }
    }
}

