package template.GOFEx;

public interface Document {
    default void save(){
    }
    default void open(){
    }
    default void close(){
    }

    public void read();
}
