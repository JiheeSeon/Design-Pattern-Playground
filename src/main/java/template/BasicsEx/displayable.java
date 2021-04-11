package template.BasicsEx;

public interface displayable {
    // abstract method
    public void open();
    public abstract void print();
    public abstract void close();

    // template method
    // -> allocate flow of methods defined in concrete class
    default void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
