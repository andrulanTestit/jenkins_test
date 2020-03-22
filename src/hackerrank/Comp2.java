package hackerrank;

import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
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

//Complete the code
public class Comp2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort((o1, o2) -> {
            if (o1.getCgpa() == o2.getCgpa()) {
                int fNameComp = o1.getFname().compareTo(o2.getFname());
                if (fNameComp != 0) {
                    return fNameComp;
                } else {
                    return o1.getId() - o2.getId();
                }
            } else if (o1.getCgpa() > o2.getCgpa()) {
                return -1;
            } else {
                return 1;
            }
        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}



