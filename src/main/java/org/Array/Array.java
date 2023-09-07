package org.Array;

import java.util.Arrays;
import java.util.List;

public class Array {
    private int length;
    private int indexCounter;
    int[] array;
    public Array(int length){
        this.length = length;
        array = new int[length];
    }
    public void insert(int item){
        if (indexCounter >= length){
            length++;
            int[] newArray = new int[length];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
            array[length - 1] = item;
            indexCounter++;
        } else {
            array[indexCounter] = item;
            indexCounter++;
        }

    }
    public void printArray(){
        System.out.println(Arrays.toString(array));
    }
    public void printArrayAddress(){
        System.out.println(array.toString());
    }

    public void removeAt(int index){
        if(index <= length - 1) {
            int[] tempArray = new int[--length];
            System.arraycopy(array, 0, tempArray, 0, index);
            System.arraycopy(array, index + 1, tempArray, index, length - index);
            array = tempArray;
        }
    }
    public String indexOf(int number){
        StringBuilder positions = new StringBuilder();
        for(int num = 0; num < array.length; num++){
            if(array[num] == number)
                positions.append(num).append("  ");
        }
        return positions.toString().trim().equals("") ? "-1" : positions.toString().trim();
    }
}
