package Data_Structure;

import java.util.*;

/**
 * Created by bvpham on 5/19/2017.
 */
class Student{
    private int token;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa){
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getToken(){
        return token;
    }

    public String getFname(){
        return fname;
    }

    public double getCgpa(){
        return cgpa;
    }
}


public class Java_Priority_Queue {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        PriorityQueue<Student> student_queue = new PriorityQueue(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname).thenComparing(Student::getToken));

        int totalEvents = scan.nextInt();

        while(totalEvents > 0){
            String CGPA_token = scan.nextLine();

            if(CGPA_token.equals("ENTER")){
                String name = scan.nextLine();
                double cgpa = scan.nextDouble();
                int token = scan.nextInt();

                Student1 student = new Student1(token, name, cgpa);
                //student_queue.add(student);
            }

            else if(CGPA_token.equals("SERVED")){
                Student first = student_queue.poll();
            }
            totalEvents--;

        }

        Student first = student_queue.poll();
        if(first==null){
            System.out.println("EMPTY");
        }
        else{
            while(first!= null){
                System.out.println(first.getFname());
                first = student_queue.poll();
            }
        }

    }
}
