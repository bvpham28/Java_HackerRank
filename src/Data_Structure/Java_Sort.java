package Data_Structure;
import java.util.*;

/**
 * Created by bvpham on 5/16/2017.
 */
class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int d, String fname, double cgpa) {
        super();
        this.id = id;
        this. fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

}


public class Java_Sort {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();



        List<Student> studentList = new ArrayList<Student>();
        while(n > 0){
            int id = scan.nextInt();
            String fname = scan.nextLine();
            double cgpa = scan.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            n--;
        }

        Collections.sort(studentList,  Comparator.comparing(Student :: getCgpa).reversed().
                thenComparing(Student :: getFname).thenComparing(Student :: getId));


        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }

}
