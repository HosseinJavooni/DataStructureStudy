package org.LinkedListStudy.LinkedListImpl;

import java.util.Optional;

public class LinkedListMyImpl{
    private Node first;
    private Node last;

    public void addFirst(int i){
        if(first == null) {
            first = new Node(i, null);
            last = first;
        } else {
            first = new Node(i, first);
        }
    }

    public void addLast(int i){
        last = new Node(i, null);
    }

    public void deleteFirst(){
        if(first != null)
            first = first.getNode();
        else
            throw new NullPointerException("There is no first Element!");
    }

    public void deleteLast(){
        Node nodeBeforeLast = findJustBeforeTheLast();
        if(nodeBeforeLast != null){
            nodeBeforeLast.setNode(null);
            last = nodeBeforeLast;
        } else last = null;
    }

    private Node findJustBeforeTheLast(){
        Node nodeBeforeLast = first;
        if(first != null && first != last) {
            while (nodeBeforeLast != last) {
                nodeBeforeLast = nodeBeforeLast.getNode();
            }
            return nodeBeforeLast;
        } else return null;
    }
    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // contains
    // indexOf
}
