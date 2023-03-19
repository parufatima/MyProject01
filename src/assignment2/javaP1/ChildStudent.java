package assignment2.javaP1;

public class ChildStudent extends ProtectedStudentClass{
    private int graduationYear = 2022;   //  protected method,variable are assessable in same package & subclass.

    public static void main(String[] args) {
        ChildStudent  childStudent = new   ChildStudent();
        System.out.println("Student name : " + childStudent.studentName);
        System.out.println("Student e-mail : " + childStudent.eMail);
        System.out.println("Student age : " + childStudent.age);
        System.out.println("Student Graduation year  : " + childStudent.graduationYear);
        childStudent.meditation();
        childStudent.play();

    }
}
