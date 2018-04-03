package com.algorithms;

public class ArrList<T> extends DataStructure<T> {

    public ArrList() {
        super();
    }

    public ArrList(int elements) {
        super(elements);
    }

    public boolean add(T element) {
        return super.add(element);
    }

    public boolean add(int position, T element) {
        return super.add(position, element);
    }

    protected void remove(T element) {
        int position = find(element);
        if(position >= 0)
            super.remove(position);
    }

    protected T find(int position) {
        super.verifyValidPosition(position);
        return elements[position];
    }

    protected int find(T element) {
        for (int i = 0; i < size(); i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    protected boolean contains(T element) {
        return find(element) >= 0;
    }

    protected int lastIndexOf(T element) {
        for (int i = length - 1; i >= 0; i--) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void clearArrList(){
        elements = (T[]) new Object[elements.length];
        length = 0;
    }
}
