package org.example;

import java.util.EmptyStackException;

public class Stack<T> {

    private Node top;
    private int size;
    public class Node<T>
    {
        private T data;
        private Node next;
        public Node(T data) {
            this.data=data;
            this.next=null;
        }
    }
    public void Push(T data) {
        Node tempNode=new Node(data);
        tempNode.next=top;
        top=tempNode;
        size++;

    }
    public T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        T result=(T) top.data;
        top=top.next;
        size--;
        return result;

    }
    public T peek() {
        if(isEmpty()) {

            throw new EmptyStackException();
        }
        return (T) top.data;
    }
    public int Size() {
        return size;

    }
    public boolean isEmpty() {
        return size==0;
    }
    public void Display() {
        Node current=top;
        while(current!=null) {
            System.out.println(current.data+"");

            current=current.next;
        }
    }
}



