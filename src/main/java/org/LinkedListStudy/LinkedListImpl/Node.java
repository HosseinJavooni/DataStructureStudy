package org.LinkedListStudy.LinkedListImpl;

public class Node {
    private int value;
    private Node node;

    public Node(){}
    public Node(int value, Node node){
        this.value = value;
        this.node = node;
    }

    public void setNode(Node node){
        this.node = node;
    }

    public Node getNode(){
        return node;
    }
}
