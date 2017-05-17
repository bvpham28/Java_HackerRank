package Data_Structure;
import java.util.*;

/**
 * Created by bvpham on 5/17/2017.
 */
public class Java_Dequeue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();


            deque.add(num);
            set.add(num);

            if(deque.size()==m){
                if(set.size() > max ) max = set.size();
                //int first = deque.remove();
                //if (!deque.contains(first)) set.remove(first);

            }
            System.out.println(max);

        }
    }
}
