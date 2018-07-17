package packt.java9.by.example.ch03;

import java.util.Comparator;

public interface Sort<E> {
    void sort(SortableCollection<E> collection);
    void setComparator(Comparator<E> comparator);
    void setSwapper(Swapper swapper);
}
