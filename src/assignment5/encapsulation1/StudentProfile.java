package assignment5.encapsulation1;

 // Read Only Encapsulation
public class StudentProfile {
    private String studentName;
    private String subject;
    private int studentId;

     public StudentProfile(String studentName, String subject, int studentId) {
         this.studentName = studentName;
         this.subject = subject;
         this.studentId = studentId;
     }

     public String getStudentName() {
         return studentName;
     }

     public String getSubject() {
         return subject;
     }

     public int getStudentId() {
         return studentId;
     }
 }
