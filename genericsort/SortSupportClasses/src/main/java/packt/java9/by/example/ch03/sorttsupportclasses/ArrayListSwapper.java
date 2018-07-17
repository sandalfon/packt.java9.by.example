package packt.java9.by.example.ch03.sorttsupportclasses;

import packt.java9.by.example.ch03.Swapper;

import java.util.ArrayList;

public class ArrayListSwapper<E> implements Swapper {
    final private ArrayList<E> array;
    public ArrayListSwapper(ArrayList<E> array) {
        this.array = array;
    }
    @Override
    public void swap(int k, int r) {
        final E tmp = array.get(k);
        array.set(k,array.get(r));
        array.set(r, tmp);
    }
}
