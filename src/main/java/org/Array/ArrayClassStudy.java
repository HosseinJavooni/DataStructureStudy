package org.Array;


public class ArrayClassStudy {
    public static void main(String[] args) {
        Array array = new Array(3);
//        array.printArray();
        array.insert(10);
        array.printArrayAddress();
        array.printArray();
        array.insert(20);
        array.printArrayAddress();
        array.printArray();
        array.insert(30);
        array.printArrayAddress();
        array.printArray();
        array.insert(40);
        array.printArrayAddress();
        array.printArray();
        array.insert(20);
        array.printArrayAddress();
        array.printArray();
        array.insert(30);
        array.printArrayAddress();
        array.printArray();
        array.insert(40);
        array.printArrayAddress();
        array.printArray();
        array.insert(0);
        array.printArrayAddress();
        array.printArray();
        array.insert(0);
        array.printArrayAddress();
        array.printArray();
        array.insert(40);
        array.printArrayAddress();
        array.printArray();
        array.removeAt(5);
        array.printArrayAddress();
        array.printArray();
        array.removeAt(5);
        array.printArrayAddress();
        array.printArray();
        System.out.println(array.indexOf(20));
    }
}
