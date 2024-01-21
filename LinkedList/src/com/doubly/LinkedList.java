package com.doubly;


public class LinkedList {

	class Node{  
	    int data;  
	    Node previous;  
	    Node next;  

	    public Node(int data) {  
	        this.data = data;  
	    }  
	} 
	
	// Represent a node of the doubly linked list

	// Represent the head and tail of the doubly linked list
	Node head, tail = null;

	// addNode() will add a node to the list
	public void addNode(int data) {
		// Create a new node
		Node newNode = new Node(data);

		// If list is empty
		if (head == null) {
			// Both head and tail will point to newNode
			head = tail = newNode;
			// head's previous will point to null
			head.previous = null;
			// tail's next will point to null, as it is the last node of the list
			tail.next = null;
		} else {
			// newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			// newNode's previous will point to tail
			newNode.previous = tail;
			// newNode will become new tail
			tail = newNode;
			// As it is last node, tail's next will point to null
			tail.next = null;
		}
	}
	public void addFirst(int data) {

		// Create a new node
		Node newNode = new Node(data);
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		// newNode will be added after tail such that tail's next will point to newNode
		newNode.next = head;
		head.previous = newNode;
		head = newNode;
	}
	public void addAt(int data ,int position) {

		Node current = head;
		Node newNode = new Node(data);
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		for(int i = 0 ;i < position-1 ;i++) {
			// Prints each node by incrementing the pointer.
			System.out.print(current.data + " ");
			current = current.next;
		}
		current.previous = newNode;
		newNode.next = current.next;
		newNode.previous = current;
		current.next = newNode;

	}

	public void deleteAt(int position) {

		Node current = head;
		Node temp;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		for(int i = 0 ;i < position-1 ;i++) {
			// Prints each node by incrementing the pointer.
			System.out.print(current.data + " ");
			current = current.next;
		}

		temp = current.next;
		current.next = temp.next;
		temp.previous = current;

	}
	public void deleteFirst() {

		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		head = current.next;
		head.previous = null;

	}
	public void deleteLast() {

		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (current.next != null) {
			// Prints each node by incrementing the pointer.

			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("Nodes of doubly linked list: ");


	}
	// display() will print out the nodes of the list
	public void display() {
		// Node current will point to head
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of doubly linked list: ");
		while (current != null) {
			// Prints each node by incrementing the pointer.

			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {

		LinkedList dList = new LinkedList();
		// Add nodes to the list
		dList.addNode(1);
		dList.addNode(2);
		dList.addNode(3);
		dList.addNode(5);
		dList.addNode(6);

		// Displays the nodes present in the list
		dList.display();

		dList.addAt(4,3);
		// Displays the nodes present in the list
		dList.display();

		dList.deleteAt(4);
		// Displays the nodes present in the list
		dList.display();

		dList.deleteFirst();
		// Displays the nodes present in the list
		dList.display();
		dList.deleteLast();
		// Displays the nodes present in the list
		dList.display();

		dList.addFirst(11);
		// Displays the nodes present in the list
		dList.display();

	}
}