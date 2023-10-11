package org.LinkedListStudy;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Hi");
        linkedList.add(1);
        linkedList.addFirst(new Object());
        linkedList.addLast("564");
        linkedList.remove(2);
        System.out.println(linkedList);
    }
}
