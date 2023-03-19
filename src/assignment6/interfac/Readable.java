package assignment6.interfac;
/*1. Interface
        Constant variables
        Abstract methods
        Default methods
        Static methods
        Private methods
        Private Static methods */
public interface Readable {
    final static String book = "Quantum Method";
    void read();
    default void  look(){
        write();
        System.out.println("Look at the picture of that book");
    }
    public static int  readNewspaper(int number){
        draw();
        return number;
    }
    private void write(){
        System.out.println("Write a story");
    }
    private static void draw(){
        System.out.println("Draw the picture of book");
    }

}
