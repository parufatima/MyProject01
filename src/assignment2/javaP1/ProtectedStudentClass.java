package assignment2.javaP1;

public class ProtectedStudentClass {
    protected String studentName = "Safwan";
    protected String eMail ="safwam@gmail.com";
    protected int age= 21;

    public ProtectedStudentClass(){

    }
    protected void play(){
        System.out.println(studentName + " likes play football");
    }
    public void meditation(){
        System.out.println(studentName + "do meditation everyday");
    }

    public static void main(String[] args) {

    }
}
