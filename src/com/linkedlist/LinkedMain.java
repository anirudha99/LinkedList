package com.linkedlist;

public class LinkedMain {
	
	/**
	 * To create the linked list
	 */
	public static void createLinkedList() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		
		if(firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode)) {
			System.out.println("Nodes Created");
		}else {
			System.out.println("Error");
		}
	}
	
	/**
	 * To add 3 nodes to the top of linked list
	 */
	public static void AddThreeNumbers() {
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);
		
		LinkedListTE<Integer> Linkedlist = new LinkedListTE<>();
		Linkedlist.add(firstNode);
		Linkedlist.add(secondNode);
		Linkedlist.add(thirdNode);
		if(Linkedlist.head.equals(thirdNode) && Linkedlist.head.getNext().equals(secondNode) && Linkedlist.tail.equals(firstNode)){
			Linkedlist.printMyNodes();	
		}else {
			System.out.println("False");
		}
		
	}
	
	/**
	 * To append  element to the last of linked list
	 */
	public static void AppendThreeNumbers() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		
		LinkedListTE<Integer> Linkedlist = new LinkedListTE<>();
		Linkedlist.add(firstNode);
		Linkedlist.append(secondNode);
		Linkedlist.append(thirdNode);
		if(Linkedlist.head.equals(firstNode) && Linkedlist.head.getNext().equals(secondNode) && Linkedlist.tail.equals(thirdNode)){
			Linkedlist.printMyNodes();	
		}else {
			System.out.println("Error");
		}
		
	}
	
	/**
	 * To insert the element in between linked list
	 */
	public static void insertBtwPosition() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		
		LinkedListTE<Integer> Linkedlist = new LinkedListTE<>();
		Linkedlist.add(firstNode);
		Linkedlist.append(thirdNode);
		Linkedlist.insert(firstNode,secondNode);
		if(Linkedlist.head.equals(firstNode) && Linkedlist.head.getNext().equals(secondNode) && Linkedlist.tail.equals(thirdNode)){
			Linkedlist.printMyNodes();	
		}else {
			System.out.println("Error");
		}
		
	}
	
	/**
	 * To delete the first node
	 */
	public static void deleteFirstNode() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		
		LinkedListTE<Integer> Linkedlist = new LinkedListTE<>();
		Linkedlist.add(firstNode);
		Linkedlist.add(secondNode);
		Linkedlist.add(thirdNode);
		INode<Integer> temp = Linkedlist.pop();
		System.out.println(temp.getKey()+" has been deleted");
		Linkedlist.printMyNodes();
		
	}
	
	/**
	 * To delete last node
	 */
	public static void deleteLastElement() {
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);

		LinkedListTE<Integer> Linkedlist = new LinkedListTE<>();
		Linkedlist.add(firstNode);
		Linkedlist.add(secondNode);
		Linkedlist.add(thirdNode);
		INode<Integer> temp = Linkedlist.pop();
		System.out.println(temp.getKey()+" has been deleted");
		Linkedlist.printMyNodes();
	}
	
	/**
	 * To search the node
	 */
	public static void searchElement() {
		MyNode<Integer> firstNode = new MyNode<>(70);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(56);

		LinkedListTE<Integer> Linkedlist = new LinkedListTE<>();
		Linkedlist.add(firstNode);
		Linkedlist.add(secondNode);
		Linkedlist.add(thirdNode);
		INode<Integer> result = Linkedlist.search(56);
		if(result == null)
			System.out.println("Element not found");
		else
			System.out.println(result.getKey()+" found !!Search is successfull");
		Linkedlist.printMyNodes();
	}
	
	/**
	 * To add element at a specific position in linked list
	 */
	public static void addafterSpecifiedNode() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		MyNode<Integer> fourthNode = new MyNode<>(40);

		LinkedListTE<Integer> Linkedlist = new LinkedListTE<Integer>();
		Linkedlist.add(firstNode);
		Linkedlist.append(secondNode);
		Linkedlist.append(thirdNode);
		INode<Integer> temp = Linkedlist.search(30);
		if(temp != null) {
			INode<Integer> next = temp.getNext();
			temp.setNext(fourthNode);
			fourthNode.setNext(next);
		}else {
			System.out.println("Element not found");
		}
		Linkedlist.printMyNodes();
	}
	
	/**
	 * To delete after specified node position
	 */
	public static void deleteafterSpecifiedNode() {
		MyNode<Integer> firstNode = new MyNode<>(56);
		MyNode<Integer> secondNode = new MyNode<>(30);
		MyNode<Integer> thirdNode = new MyNode<>(70);
		MyNode<Integer> fourthNode = new MyNode<>(40);

		LinkedListTE<Integer> Linkedlist = new LinkedListTE<Integer>();
		Linkedlist.add(firstNode);
		Linkedlist.append(secondNode);
		Linkedlist.append(thirdNode);
		Linkedlist.append(fourthNode);
		INode<Integer> head = Linkedlist.deleteSpecified(40);
		int count = Linkedlist.countNode(head);
		System.out.println("Number of nodes in a linked list are "+count);
		Linkedlist.printMyNodes();
	}
	
	
	
	public static void main(String[] args) {
		createLinkedList();
		AddThreeNumbers();
		AppendThreeNumbers();
		insertBtwPosition();
		deleteFirstNode();
		deleteLastElement();
		searchElement();
		addafterSpecifiedNode();
		deleteafterSpecifiedNode();
	}
}
