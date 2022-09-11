package todo;

public interface MyInterface1 {
    public default void display() {
        System.out.println("display method of MyInterface1");
    }
}
