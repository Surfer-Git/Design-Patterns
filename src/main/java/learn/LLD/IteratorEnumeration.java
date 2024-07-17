package learn.LLD;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration <T> implements Enumeration<T> {
    Iterator<T> it;

    public IteratorEnumeration(Iterator<T> it) {
        this.it = it;
    }

    @Override
    public boolean hasMoreElements() {
        return it.hasNext();
    }

    @Override
    public T nextElement() {
        return it.next();
    }
}
