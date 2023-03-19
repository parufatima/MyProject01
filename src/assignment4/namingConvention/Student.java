package assignment4.namingConvention;

public class Student {
    public static void main(String[] args) {

        int subjectNumber = 6;
        char grade ='A';
        String studentName = "Nabila";
        String subjectName1 = "Java";
        String subjectName2 = "SQL";
        System.out.println(studentName + " is learning  "+subjectName1 +" and "+  subjectName2+" and her grade is "+grade );

        Student student =new Student();

        student.learn();
        student.write();
        student.watch();

    }
    public  void learn() {
        System.out.println("Students are learning programing. ");
    }
    public  void write() {
        System.out.println("They are writing code.");
    }
    public  void watch() {
        System.out.println("They are watching how to write good code.");
    }

}
