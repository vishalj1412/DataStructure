package org.example;

public class MyLinkedListWithAdd {
	public Inode head;
	public Inode tail;
	
	public MyLinkedListWithAdd() {
		this.head=null;
		this.tail=null;
			
	}

	public void add(Inode newNode) {
	if(tail==null) {	// TODO Auto-generated method stub
	this.tail=newNode;
	}
	if(head==null) {
	this.head=newNode;
	}else
	{
		Inode tempNode=this.head;
		this.head=newNode;
		this.head.setNext(tempNode);
	}
}
	public void PrintNode() {
		StringBuffer myNode =new StringBuffer("Linked List With Add: ");
		Inode tempNode=head;
		while(tempNode.getNext() != null) {
			myNode.append(tempNode.getKey());
			if(tempNode != tail) {
				myNode.append("->");
			tempNode=tempNode.getNext();
		}
			}
		myNode.append(tempNode.getKey());
		System.out.println(myNode);
	
		}
	}
	
	
	