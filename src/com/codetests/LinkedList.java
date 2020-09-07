package com.codetests;

public class LinkedList {
    private Node head;

    public LinkedList()
    {
        head = null;
    }

    public void insertToFrontOfList(Node node){
        if (head != null) {
            node.setNext(head);
        }
        head = node;
    }

    public void insertToEndOfList(Node node){
        if(head == null){
            head = node;
            return;
        }

        Node cursor = head;

        while(cursor.getNext() != null){
            cursor = cursor.getNext();
        }
        cursor.setNext(node);
    }

    public void insertInOrder(Node node) {
        if(head == null){
            head = node;
            return;
        }
        Node cursor = head;
        Node temp = null;

        while(cursor.getNext() != null)
        {
            if(cursor.getNext().getData() == node.getData()){
                System.out.println("Node already exists: " + cursor.getNext().getData() + " " + node.getData());
                return;
            }
            if(cursor.getNext().getData() > node.getData()){
                node.setNext(cursor.getNext());
                cursor.setNext(node);
                return;
            }
            cursor = cursor.getNext();
        }
        insertToEndOfList(node);
    }

    public void print(){
        if(head == null){
            System.out.println("The list is empty");
        }

        Node cursor = head;

        while(cursor != null){
            System.out.print(cursor.getData() + "-->");
            cursor = cursor.getNext();
        }
        System.out.println();
    }
}
