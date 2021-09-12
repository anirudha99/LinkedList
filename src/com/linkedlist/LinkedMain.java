package com.linkedlist;

public class LinkedMain {
	
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
	
	public static void main(String[] args) {
		createLinkedList();
	}
}
