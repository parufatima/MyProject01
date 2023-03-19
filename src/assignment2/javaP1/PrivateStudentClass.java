package assignment2.javaP1;

public class PrivateStudentClass {

    private String studentName ="Amreen Kamal";
    private String email = "amreen@gmail.com";
    public int  age =15;
    int gradePoint =5;
    public String subject ="Java";

    public PrivateStudentClass(){

    }
    private void  study(){
        System.out.println(studentName + " is a good student");
    }
    public void learn(){
        System.out.println("Amreen learning java");
    }

    public static void main(String[] args) {
        PrivateStudentClass privateStudentClass = new PrivateStudentClass();
        privateStudentClass.learn();
        privateStudentClass.study();
        System.out.println( privateStudentClass.age);
        System.out.println( privateStudentClass.studentName);
        System.out.println( privateStudentClass.gradePoint);
        System.out.println( privateStudentClass.email);
        System.out.println( privateStudentClass.subject);
    }

}
