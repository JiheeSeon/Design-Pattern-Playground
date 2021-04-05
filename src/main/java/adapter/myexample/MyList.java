package adapter.myexample;

import java.util.ArrayList;
import java.util.List;

public class MyList<E> implements MyCollection<List<E>, E> {
    private final List<E> list;

    MyList() {
        this.list = new ArrayList<>();
    }

    @Override
    public List<E> getCollection() {
        return list;
    }

    @Override
    public int getLength() {
        return list.size();
    }

    @Override
    public E pop() {
        return getLength() != 0 ? list.remove(getLength() - 1) : null;
    }

    @Override
    public E getLast() {
        return list.get(getLength() - 1);
    }

    @Override
    public void setElement(E element) {
        list.add(element);
    }

    @Override
    public void printAll() {
        for(E i : list) {
            System.out.println("i = " + i);
        }
    }
}
