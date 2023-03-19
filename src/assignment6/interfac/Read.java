package assignment6.interfac;

public class Read implements Readable{
    @Override
    public void read() {
        System.out.println("Reading is a good habit");
    }
    @Override
    public void look() {
        Readable.super.look();
    }
}
