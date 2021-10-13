package org.example;


import org.testng.annotations.Test;

public class StackTest {
    @Test
    public void stackTest() {
        Stack obj=new Stack();
        obj.Push(70);
        obj.Push(30);
        obj.Push(56);
        obj.Display();
        System.out.println("Size of stack is "+obj.Size());
        System.out.println("Deleted element is "+obj.pop());
        System.out.println("Size of stack is "+obj.Size());
        System.out.println("peek element is"+obj.peek());
        obj.Display();
    }

}
