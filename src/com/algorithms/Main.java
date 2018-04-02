package com.algorithms;

public class Main {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.add("1");
        vetor.add("3");
        vetor.add("5");
        vetor.add("7");
        vetor.add("9");


        vetor.add(1, "2");
        vetor.add(3, "4");
        vetor.add(5, "6");
        vetor.add(7, "8");

        vetor.remove(7);

        System.out.println(vetor.find(0));
        System.out.println(vetor.find("1"));
        System.out.println(vetor);
    }
}
