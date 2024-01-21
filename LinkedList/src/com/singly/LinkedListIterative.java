package com.singly;

public class LinkedListIterative {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void Iterative() {

		if (head == null || head.next == null) {
			return;
		}
		Node prevNode = head;
		Node currentNode = head.next;
		while (currentNode != null) {
			Node nextNode = currentNode.next;
			currentNode.next = prevNode;
			
			prevNode = currentNode;
			currentNode = nextNode;
		}
		head.next = null;
		head = prevNode;
	}

	public void show() {

		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " -- > ");

			currentNode = currentNode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		LinkedListIterative linkedList = new LinkedListIterative();
		System.out.println("=========== Add Fist Node ===============");
		linkedList.addFirst(50);
		linkedList.addFirst(40);
		linkedList.addFirst(30);
		linkedList.addFirst(20);
		linkedList.addFirst(10);
		linkedList.show();
		linkedList.Iterative();
		linkedList.show();
	}

}
