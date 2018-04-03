package com.algorithms;

public class DataStructure<T> {

    protected T[] elements;
    protected int length;

    public DataStructure(){
        this(10);
    }

    public DataStructure(int elements) {
        this.elements = (T[]) new Object[elements];
        this.length = 0;
    }

    protected boolean add(T element) {
        increaseCapacity();

        if (this.length < this.elements.length) {
            this.elements[length] = element;
            this.length++;
            return true;
        }
        return false;
    }

    protected boolean add(int position, T element) {
        verifyValidPosition(position);
        increaseCapacity();

        for (int i = this.length - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }

        this.elements[position] = element;
        this.length++;

        return true;
    }

    protected void remove(int position) {
        verifyValidPosition(position);

        for (int i = position; i < this.length - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.length--;
    }

    protected int size() {
        return this.length;
    }

    protected void verifyValidPosition(int position) {
        if (position < 0 || position > this.length - 1) {
            throw new IllegalArgumentException("Invalid position");
        }
    }

    private void increaseCapacity() {
        if (this.length == this.elements.length) {
            T[] newElements = (T[]) new Object[this.length * 2];

            for (int i = 0; i < this.length; i++) {
                newElements[i] = this.elements[i];
            }
            elements = newElements;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.length - 1; i++) {
            s.append(this.elements[i]);
            s.append(", ");
        }

        if (this.length > 0) {
            s.append(this.elements[this.length - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
