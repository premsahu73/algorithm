package com;

public class LinkedList {

	Node node;

	class Node {
		Node next;
		int value;

		Node(int value) {
			this.value = value;
			this.next = null;
		}
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		Node first = node;
		if (first != null) {
			System.out.println("it is empty");
		} else {
			newNode.next = node;
			node = newNode;
		}
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		Node first = node;
		while (first.next != null) {
			first = first.next;
		}
		first.next = newNode;
		//first.next = null;
	}

	public void show() {
		Node first = node;
		while (first != null) {
			System.out.println(first.value);
			first = first.next;
		}
	}

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.show();
		ll.addLast(20);
		ll.show();

	}
}