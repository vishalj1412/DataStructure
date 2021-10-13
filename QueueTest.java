package org.example;
import org.testng.annotations.Test;

public class QueueTest {
	@Test
	public void Test()
	{
	Queue<Integer> obj=new Queue<>();
	obj.enQueue(56);
	obj.enQueue(30);
	obj.enQueue(70);
	
obj.DisplayQueue();
System.out.println("");
System.out.println("Size of Queue "+obj.Size());
	System.out.println("Deleted element is "+obj.deQueue());
	System.out.println("Size of Queue after delete element "+obj.Size());
	System.out.println("Queue after delete element");
	obj.DisplayQueue();
	}
}