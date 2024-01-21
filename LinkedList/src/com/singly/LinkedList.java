package com.singly;

public class LinkedList {

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

	public void addLast(int data) {
		Node newNode = new Node(data);
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}

	public void deleteFirst() {
		Node currentNode = head;
		head = currentNode.next;
	}

	public void deleteLast() {
		Node secondlast = head;
		Node last = head.next;
		while (last.next != null) {
			last = last.next;
			secondlast = secondlast.next;
		}
		secondlast.next = null;
	}

	public void addAt(int index, int data) {
		Node newNode = new Node(data);
		Node currentNode = head;
		for (int i = 0; i < index - 1; i++) {
			currentNode = currentNode.next;
		}
		newNode.next = currentNode.next;
		currentNode.next = newNode;
	}
	
	public void deleteAt(int index) {
		Node currentNode = head;
		Node newNode;
		for (int i = 0; i < index - 1; i++) {
			currentNode = currentNode.next;
		}
		newNode = currentNode.next;
		currentNode.next = newNode.next;
	}

	public int getCount() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public void show() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data+" -- > ");
			currentNode = currentNode.next;
		}
		System.out.println("NULL");
	}
	
	public void sortList() {
		// Node current will point to head
		Node current = head, index = null;
		int temp;
		if (head == null) {
			return;
		} else {
			while (current != null) {
				// Node index will point to node next to
				// current
				index = current.next;

				while (index != null) {
					// If current node's data is greater
					// than index's node data, swap the data
					// between them
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		System.out.println("=========== Add Fist Node ===============");
		linkedList.addFirst(50);
		linkedList.addFirst(40);
		linkedList.addFirst(30);
		linkedList.addFirst(20);
		linkedList.addFirst(10);
		linkedList.show();
		System.out.println(" ========= Add Last Node ==============");
		linkedList.addLast(60);
		linkedList.show();
		System.out.println("=========== Add node at index 2 ===========");
		linkedList.addAt(2, 90);
		linkedList.show();
		System.out.println("=========== Delete Last node ==========> ");
		linkedList.deleteFirst();
		linkedList.show();
		System.out.println("=========== Delete Last node ===========> ");
		linkedList.deleteLast();
		linkedList.show();
		System.out.println("=========== Delete node at index 3 ==========> ");
		linkedList.deleteAt(3);
		linkedList.show();
		System.out.println(linkedList.getCount());
		System.out.println("=========== sort the linked list ==========> ");
		linkedList.sortList();
		linkedList.show();
		
	}

}
