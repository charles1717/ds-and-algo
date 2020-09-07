package com.codetests;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.print();

        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(8);

        list.insertToEndOfList(a);
        list.insertToEndOfList(b);
        list.insertToEndOfList(c);
        list.insertToEndOfList(d);
        list.print();

        list.insertInOrder(e);
        list.print();
    }
}
