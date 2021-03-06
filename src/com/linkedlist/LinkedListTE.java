package com.linkedlist;

public class LinkedListTE<K> {
	
	public INode<K> head;
	public INode<K> tail;
	
	public LinkedListTE() {
		this.head = null;
		this.tail = null;	
	}
	
	/**
	 * method to add
	 * calls sort function
	 * @param newNode
	 */
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
			sort();
		}
	}
	
	/**
	 * To append between nodes
	 * @param newNode
	 */
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
	
	/**
	 * @param myNode
	 * @param newNode
	 */
	public void insert(INode<K> myNode,INode<K> newNode) {
		INode<K> tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	/**
	 * @return first item
	 */
	public INode<K> pop(){
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	/**
	 * @return last item
	 */
	public INode<K> delete() {
		INode<K> curNode = head;
		INode<K> prevNode = null;
		while(curNode != null && curNode.getNext() != null) {
			prevNode = curNode;
			curNode = curNode.getNext();
		}
		prevNode.setNext(null);
		return curNode;
	}
	
	/**
	 * @param Key
	 * @return node if found
	 */
	public INode<K> search(K Key) {
		INode<K> tempNode = head;
		while(tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey().equals(Key)){
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	/**
	 * @param Key
	 * @return deleted node
	 */
	public INode<K> deleteSpecified(K Key) {
		if(head == null || head.getNext() == null) {
			return null;
		}
		INode<K> curNode = this.head;
		INode<K> prevNode = null;

		while(curNode != null && curNode.getKey() != Key) {
			prevNode = curNode;
			curNode = curNode.getNext();
		}

		if(curNode == null) {
			System.out.println("key not found");
			return head;
		}
	    System.out.println(curNode.getKey()+" deleted");
		prevNode.setNext(curNode.getNext());
		return head;
	}
	
	/**
	 * method to count
	 * @param head
	 * @return count
	 */
	public int countNode(INode<K> head) {
		INode<K> tempNode = head;
		if(tempNode == null)
			return 0;
		if(tempNode.getNext() == null)
			return 1;
		int count = 1;
		while(tempNode != null && tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
			count++;
		}
		return count;

	}
	
	/**
	 * To sort the values in ascending order
	 */
	private void sort() 
	{
		INode<K>current = this.head;
		INode<K>index = null;
		K temp;
		if(this.head == null) {
			System.out.println("List is empty");
		}
		else {
			while(current != null)
			{
				//Node index will point to node next to current
				index = current.getNext();
				while(index != null) {
					//If current node's data is greater than index's node data, swap the data between them
					if((int)current.getKey()>(int)index.getKey()){
						temp = current.getKey();
						current.setKey(index.getKey());
						index.setKey(temp);
					}
					index = index.getNext();
	                }
	                current = current.getNext();
			}  		
		}
		
	}

	/**
	 * method to print
	 */
	public void printMyNodes() {
		System.out.println("My Nodes: "+head);
	}
}