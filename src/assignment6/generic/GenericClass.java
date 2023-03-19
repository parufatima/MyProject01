package assignment6.generic;

public class GenericClass<T>{
    private T object;
    public GenericClass(T object) {
        this.object = object;
    }
    public T getObject() {
        return object;
    }
}
