package patterns.iterator.builtin;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
