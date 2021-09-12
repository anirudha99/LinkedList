package com.linkedlist;

public class LinkedListTE<K> {
	
	public INode<K> head;
	public INode<K> tail;
	
	public LinkedListTE() {
		this.head = null;
		this.tail = null;	
	}
	
	public void add(INode<K> newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(INode<K> newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;

		}
	}

	public void printMyNodes() {
		System.out.println("My Nodes: "+head);
	}
}