package assignment2.javaP1;

public class ModifierPublicClass {


    public static void main(String[] args) {
        PrivateStudentClass privateStudentClass = new PrivateStudentClass();
        privateStudentClass.learn();
       // privateStudentClass.study();                //private method, variable can not assessable from another class
        System.out.println( privateStudentClass.age);
       // System.out.println( privateStudentClass.studentName);
        System.out.println( privateStudentClass.gradePoint);  //default can assessable from same package another class
       // System.out.println( privateStudentClass.email);
        System.out.println( privateStudentClass.subject);    //public can assessable from any class
    }
}
