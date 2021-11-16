package edu.java.structure;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size = 0;

	private class Node {
		private Object data;
		private Node next;

		public Node(Object input) {
			this.data = input;
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}

	Node node(int index) {
		Node x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	public void addFirst(Object input) {

		Node newNode = new Node(input);

		newNode.next = head;
		head = newNode;

		size++;

		if (head.next == null) {
			tail = head;
		}
	}

	public void addLast(Object input) {

		Node newNode = new Node(input);

		if (head == null) {
			head = newNode;
			tail = newNode;

			size++;
			return;
		}
		tail.next = newNode;
		tail = newNode;
		size++;
	}

	public void add(int k, Object input) {
		if (k == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(k - 1);
			Node temp2 = temp1.next;

			Node newNode = new Node(input);

			temp1.next = newNode;

			newNode.next = temp2;
			size++;

			if (newNode.next == null) {
				tail = newNode;
			}
		}
	}

	public Object removeFirst() {

		if (head == null) {

			return null;
		}
		Object temp = head.data;

		if (head == tail) {
			head = tail = null;

		} else {
			head = head.next;
			size--;
		}
		return temp;

	}

	public Object removeLast() {
		if (head == null)
			return null;
		if (head == tail) {
			return removeFirst();
		}

		Node current = head;
		Node previous = null;

		while (current != tail) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		tail = previous;
		size--;
		return current.data;
	}

	public Object remove(int k) {
		if (k == 0)
			return removeFirst();

		Node temp = node(k - 1);
		Node todoDeleted = temp.next;
		temp.next = temp.next.next;

		Object returnData = todoDeleted.data;

		if (todoDeleted == tail) {
			tail = temp;
		}
		todoDeleted = null;
		size--;

		return returnData;
	}

	public String toString() {

		if (head == null) {
			return "[]";
		}

		Node temp = head;
		String str = "[";
		while (temp.next != null) {
			str += temp.data + ",";
			temp = temp.next;
		}

		str += temp.data;
		return str + "]";
	}

	public int size() {
		return size;
	}

	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
}
