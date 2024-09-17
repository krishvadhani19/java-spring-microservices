
class Student {

    int rollNo;
    String name;
    int marks;

}

public class ArrayOfObjects {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 23;
        s1.name = "Krish1";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollNo = 21;
        s2.name = "Krish2";
        s2.marks = 57;

        Student s3 = new Student();
        s3.rollNo = 53;
        s3.name = "Krish3";
        s3.marks = 43;

        // Student[] students = {s1, s2, s3};
        Student[] students = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Name:" + students[i].name);
            System.out.println("Marks:" + students[i].marks);
            System.out.println("RollNo:" + students[i].rollNo);
            System.out.println("");
        }
    }

}
