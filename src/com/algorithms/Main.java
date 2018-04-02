package com.algorithms;

public class Main {

    public static void main(String[] args) {

        testOne();

        testTwo();

        testTree();


    }

    private static void testTree() {

        List<Person> listPerson = new List<>(10);

        Person p1 = new Person("Leandro", "333555777", "leandro@gmail.com");
        Person p2 = new Person("Carlos", "555777333", "carlos@gmail.com");
        Person p3 = new Person("Ricardo", "777333555", "ricardo@gmail.com");
        Person p4 = new Person("Ricardo", "777333555", "ricardo@gmail.com");

        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);

        int pos = listPerson.find(p4);

        System.out.println(pos > 0 ? "Element remove at position " + pos : "Element does not exist at this collection");

        System.out.println(listPerson.toString());
    }

    private static void testTwo() {

        Vetor vetor = new Vetor(3);
        Person p1 = new Person("Leandro", "333555777", "leandro@gmail.com");
        Person p2 = new Person("Carlos", "555777333", "carlos@gmail.com");
        Person p3 = new Person("Ricardo", "777333555", "ricardo@gmail.com");
        Person p4 = new Person("Ricardo", "777333555", "ricardo@gmail.com");

        vetor.add(p1);
        vetor.add(p2);
        vetor.add(p3);

        int pos = vetor.find(p4);

        System.out.println(pos > 0 ? "Element remove at position " + pos : "Element does not exist at this collection");

        System.out.println(vetor.toString());
    }

    private static void testOne() {

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
