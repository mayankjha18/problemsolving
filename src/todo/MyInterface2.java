package todo;

public interface MyInterface2 {
    public default void display() {
        System.out.println("display method of MyInterface2");
    }
}
