package com.linkedlist;

public class LinkedListTE<K> {
	
	public INode<K> head;
	public INode<K> tail;
	
	public LinkedListTE() {
		this.head = null;
		this.tail = null;	
	}

	public void printMyNodes() {
		System.out.println("My Nodes: "+head);
	}
}