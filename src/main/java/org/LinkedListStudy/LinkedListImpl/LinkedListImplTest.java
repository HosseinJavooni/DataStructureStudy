package org.LinkedListStudy.LinkedListImpl;

public class LinkedListImplTest {
    public static void main(String[] args) {
        LinkedListMyImpl linkedList = new LinkedListMyImpl();
        linkedList.addFirst(23);
        linkedList.addFirst(34);
        linkedList.addFirst(35);
        linkedList.addFirst(36);
        System.out.println(linkedList);
        linkedList.addLast(555);
        linkedList.addLast(666);
        System.out.println(linkedList);
        linkedList.deleteFirst();
        System.out.println(linkedList);
        linkedList.deleteLast();
        System.out.println(linkedList);
        linkedList.deleteLast();
        System.out.println(linkedList);
        linkedList.addLast(78);
        linkedList.addFirst(200);
        System.out.println(linkedList);
        System.out.println(linkedList.contains(34));
        System.out.println(linkedList.contains(345));
        System.out.println(linkedList.contains(200));
        System.out.println(linkedList.contains(78));
        System.out.println(linkedList.indexOf(200));
        System.out.println(linkedList.indexOf(23));
        System.out.println(linkedList.indexOf(78));
        System.out.println(linkedList.indexOf(2003));
        System.out.println(linkedList.size());
        while (linkedList.size() > 0)
            linkedList.deleteLast();
        System.out.println(linkedList);

    }
}
