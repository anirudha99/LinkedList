package com.linkedlist;

public class MyNode<K> implements INode<K> {
	
	private K key;
	private INode<K> next;

	public MyNode(K Key) {
		this.key = Key;
		this.next = null;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(INode<K> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		StringBuilder nodeString = new StringBuilder();
		nodeString.append("MyNodes {" + "key=").append(key).append('}');
		if(next != null) {
			nodeString.append("->").append(next);
		}
		return nodeString.toString();
	}
	 
}


