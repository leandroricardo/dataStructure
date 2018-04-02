package com.algorithms;

public class Vetor {

    private String[] elements;
    private int length;

    public Vetor(int elements) {
        this.elements = new String[elements];
        this.length = 0;
    }

    public boolean add(String element) {
        increaseCapacity();

        if (this.length < this.elements.length) {
            this.elements[length] = element;
            this.length++;
            return true;
        }
        return false;
    }

    public boolean add(int position, String element) {
        verifyValidPosition(position);
        increaseCapacity();

        for (int i = this.length - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }

        this.elements[position] = element;
        this.length++;

        return true;
    }

    public void remove(int position){
        verifyValidPosition(position);

        for(int i = position; i < this.length - 1; i++){
            this.elements[i] = this.elements[i + 1];
        }
        this.length--;
    }

    public String find(int position) {
        verifyValidPosition(position);
        return this.elements[position];
    }

    public int find(String element) {
        for (int i = 0; i < this.length; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    private void verifyValidPosition(int position) {
        if (position < 0 || position > this.length - 1) {
            throw new IllegalArgumentException("Invalid position");
        }
    }

    private void increaseCapacity() {
        if (this.length == this.elements.length) {
            String[] newElements = new String[this.length * 2];

            for (int i = 0; i < this.length; i++) {
                newElements[i] = this.elements[i];
            }
            elements = newElements;
        }
    }

    public int length() {
        return this.length;
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
