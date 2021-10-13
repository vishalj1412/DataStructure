package org.example;

public class Queue<T>{
    private Node<T> front;
    private Node<T> rear;
    private int length;
    public static class Node<T>{
        private T data;
        private Node next;
        public Node(T data) {
            super();
            this.data=data;
            this.next=null;

        }
    }
    public void enQueue(T data)
    {
        if(front==null) {
            rear=new Node<T>(data);
            front=rear;
        }else {
            rear.next=new Node<T>(data);
            rear=rear.next;

        }
        length++;

    }
    public T deQueue() {
        if(front!=null) {
            T result=	front.data;
            front=front.next;
            length--;
            return result;
        }
        return null;
    }
    public int Size() {
        return length;
    }
    public void DisplayQueue() {
        Node<T> current=front;
        while(current!=null)
        {
            System.out.print(current.data+"->	");
            current=current.next;
        }
    }
}