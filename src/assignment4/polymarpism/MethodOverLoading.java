package assignment4.polymarpism;

public class MethodOverLoading {

    public void login(){
        System.out.println("Message : Enter userName & passWord");
    }
    public void login(String userName){
        System.out.println("Message :Enter userName");
    }
    public void login(int passWord){
        System.out.println("Message :Enter passWord");
    }
    public void login(String userName, int passWord){
        System.out.println("Message :Logging successfully");
    }

    public static void main(String[] args) {
        MethodOverLoading methodOverLoading = new MethodOverLoading();
        methodOverLoading.login();
        methodOverLoading.login("myName");
        methodOverLoading.login(12345);
        methodOverLoading.login("myName",12345);


    }
}
