package org.example;

public class MyLinkedListWithAppend {
public Inode head;
public Inode tail;


public MyLinkedListWithAppend() {
	this.head=null;
	this.tail=null;
	}
public void Append(Inode newnode) {
	if (head==null) {
		this.head=newnode;
	}
	if(tail==null) {
		this.tail=newnode;
	}else
	{
		Inode tempNode=this.tail;
		this.tail=newnode;
		this.tail.setNext(tempNode);
		}
}

public void PrintNodeWithAppend() {
	Inode tempNode=tail;
	StringBuffer MyNode=new StringBuffer("Linked List With Append: ");
	while(tempNode.getNext() != null) {
     MyNode.append(tempNode.getKey());
     if(tempNode != head) {
    	 MyNode.append("<-");
    	 tempNode=tempNode.getNext();
     } 
	}
     MyNode.append(tempNode.getKey());
     System.out.println(MyNode);

	

}
}
