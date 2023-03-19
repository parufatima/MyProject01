package assignment6.interfac;

public class ReadableTest {
    public static void main(String[] args) {
        Read read = new Read();
        read.look();
        read.read();
        System.out.println( Readable.readNewspaper(4));
        System.out.println(Readable.book);
    }
}
