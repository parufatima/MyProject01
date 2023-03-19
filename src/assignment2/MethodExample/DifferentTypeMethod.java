package assignment2.MethodExample;

public class DifferentTypeMethod {

    private String lastName;
    private String bookName;
    private int id;

    public DifferentTypeMethod(String lastName, String bookName, int id){
        this.lastName = lastName;
        this.bookName = bookName;
        this.id = id;
    }
    public void bookTrack(){
        System.out.println("Person :"+ lastName + ". Book name : "+  bookName + ". Reader id : "+ id);
    }

    public String getBookName() {
        String bookName = "A brief history of time";
        System.out.println("Book name :" + bookName);
        return bookName;
    }

    public int getId() {
        int id = 1234;
        System.out.println("id  :"+ id);
        return id;
    }


    public  void play(){
        System.out.println("Kids likes to play");
    }
    public  String name(){  // without Parameter
        String myName = "Amreen";
        System.out.println(myName);
        return myName;
    }
    public  int multiplication(int number1, int number2){  // with Parameter
        int result = number1*number2;
        System.out.println("Result  :" +result);
        return result;
    }
    public  void studentName(String firstName, String lastName) {
         String fullName =firstName +lastName;
        System.out.println(fullName);
    }
    public  void addition(int number1, int number2 ,int number3 ) {
        System.out.println(number1 + number2 + number3);
    }
}
