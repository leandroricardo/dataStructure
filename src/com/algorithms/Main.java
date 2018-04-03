package com.algorithms;

public class Main {

    public static void main(String[] args) {
        //testList();

        testStack();
    }

    private static void testStack() {

        Stack<Integer> stack = new Stack<>();

        System.out.println(stack);
        System.out.println(stack.size());
    }

    private static void testList() {

        ArrList<Person> arrListPerson = new ArrList(10);

        Person p1 = new Person("Leandro", "333555777", "leandro@gmail.com");
        Person p2 = new Person("Carlos", "555777333", "carlos@gmail.com");
        Person p3 = new Person("Ricardo", "777333555", "ricardo@gmail.com");
        Person p4 = new Person("Ricardo", "777333555", "ricardo@gmail.com");

        Person p5 = new Person("Leandro", "333555777", "leandro@gmail.com");
        Person p6 = new Person("Carlos", "555777333", "carlos@gmail.com");
        Person p7 = new Person("Ricardo", "777333555", "ricardo@gmail.com");
        Person p8 = new Person("Manuel", "777333555", "ricardo@gmail.com");

        arrListPerson.add(p1);
        arrListPerson.add(p2);
        arrListPerson.add(p3);
        arrListPerson.add(p4);
        arrListPerson.add(p5);
        arrListPerson.add(p6);
        arrListPerson.add(p7);
        arrListPerson.add(p8);

        int lastPos = arrListPerson.lastIndexOf(p2);

        arrListPerson.remove(p8);

        System.out.println("Last position for the element is: " + lastPos);

        arrListPerson.clearArrList();

        System.out.println(arrListPerson.toString());
    }
}
