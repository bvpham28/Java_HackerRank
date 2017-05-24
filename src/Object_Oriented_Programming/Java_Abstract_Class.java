package Object_Oriented_Programming;
import java.util.*;

/**
 * Created by bvpham on 5/24/2017.
 */
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        title = s;
    }
}

public class Java_Abstract_Class {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String title = scan.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        scan.close();
    }
}
