package adapter.myexample;

import java.util.Collection;

public interface MyCollection<T extends Collection<E>, E> {
    public T getCollection();
    public int getLength();
    public E getLast();
    public void setElement(E element);
    public void printAll();
    public E pop();
}
