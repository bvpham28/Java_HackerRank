package Data_Structure;
import java.util.*;
import java.io.*;

/**
 * Created by bvpham on 5/10/2017.
 */
public class Java_Map {
    public static void main(String [] argh){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        HashMap<String, Integer> phonebook = new HashMap<>();

        for (int i = 0; i < n; i++){
            String name = scan.nextLine();
            int phone_number = scan.nextInt();

            phonebook.put(name, phone_number);
            scan.nextLine();
        }

        while(scan.hasNext()){
            String input = scan.nextLine();
            if(phonebook.containsKey(input)){
                System.out.println(input + "=" + phonebook.get(input));
            }
            else{
                System.out.println("Not found");
            }
        }

    }
}
