package org.example;

public interface Inode<T> {
	T getKey();
	void setKey(T key);
	Inode getNext();
	void setNext(Inode next);
	

}
