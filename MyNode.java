package org.example;

	public class MyNode<T> implements Inode<T>{
		
		private MyNode<T> next;
		private T key;
		
		public MyNode(T key) {
			this.key=key;
			this.next=null;
		}
			
	
	@Override
	public void setKey(T key) {
		this.key=key;
	}
	@Override
	public void setNext(Inode next) {
		this.next=(MyNode<T>)next;
		
	}

	@Override
	public T getKey() {
		// TODO Auto-generated method stub
		return key;
	}



	@Override
	public Inode<T> getNext() {
		// TODO Auto-generated method stub
		return next;
	}
	
	}

