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
        last.setNode(new Node(i, null));
        last = last.getNode();
    }

    public void deleteFirst(){
        if(first != null)
            first = first.getNode();
//        else
//            throw new NullPointerException("There is no first Element!");
    }

    public void deleteLast(){
        Node nodeBeforeLast = findJustBeforeTheLast();
        if(nodeBeforeLast != first){
            nodeBeforeLast.setNode(null);
            last = nodeBeforeLast;
        } else {
            last = null;
            first = null;
        }
    }

    private Node findJustBeforeTheLast(){
        Node nodeBeforeLast = first;
        if(first != null && first != last) {
            while (nodeBeforeLast.getNode() != last) {
                nodeBeforeLast = nodeBeforeLast.getNode();
            }
        } else nodeBeforeLast = null;
        return nodeBeforeLast;
    }

    public boolean contains(int i){
        Node thisNode = first;
            while (thisNode != null){
                if(thisNode.getValue() == i) {
                    return true;
                } else {
                    thisNode = thisNode.getNode();
                }
            }
        return false;
    }

    public int indexOf(int integer){
        int i = 0;
        Node nodeForCheck = first;
        while(nodeForCheck != null){
            if(nodeForCheck.getValue()== integer) {
                return i;
            } else {
                nodeForCheck = nodeForCheck.getNode();
                i++;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder linkedListString = new StringBuilder("[");
        Node element = first;
        while (element != null){
            if(element.getNode() != null) {
                linkedListString.append(element.getValue()).append(", ");
            } else {
                linkedListString.append(element.getValue());
            }
            element = element.getNode();
        }
        linkedListString.append("]");
        return linkedListString.toString();
    }

    public int size(){
        Node node = first;
        int i = 0;
        while (node != null){
            node = node.getNode();
            i++;
        }
        return i;
    }

    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // contains
    // indexOf
    // size()
}
