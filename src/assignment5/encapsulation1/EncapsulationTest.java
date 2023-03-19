package assignment5.encapsulation1;

public class EncapsulationTest {
    public static void main(String[] args) {


        Profile profile = new Profile();
        StudentProfile studentProfile = new StudentProfile("Nayla","Selenium",500200);
        TeacherProfile teacherProfile = new TeacherProfile();


        profile.setName("Nabila");
        profile.setEmail("nabila@gmail.com");
        profile.setId(100200345);
        System.out.println("Customer name :"+profile.getName());
        System.out.println("Customer email :"+profile.getEmail());
        System.out.println("Customer id :"+profile.getId());

        System.out.println("-----------------------------------------");

        System.out.println("Student name :"+studentProfile.getStudentName());
        System.out.println("Subject name :"+studentProfile.getSubject());
        System.out.println("Student id :"+studentProfile.getStudentId());

        System.out.println("-----------------------------------------");
        teacherProfile.setTeacherName("Nargis Akter");
        teacherProfile.setTeacherSubject("Physics");
        teacherProfile.setTeacherContact(0177);



    }
}
