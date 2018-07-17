package packt.java9.by.example.ch03.sorttsupportclasses;

import packt.java9.by.example.ch03.SortableCollection;

import java.util.ArrayList;

public class ArrayListSortableCollection<E> implements SortableCollection {
    final private ArrayList<E> array;
    public ArrayListSortableCollection(ArrayList<E> array) {
        this.array = array;
    }
    @Override
    public E get(int i) {
        return array.get(i);
    }
    @Override
    public int size() {
        return array.size();
    }
}