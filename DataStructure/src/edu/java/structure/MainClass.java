package edu.java.structure;

public class MainClass {
	
	public static void main(String[] args) {
		
		LinkedList list= new LinkedList();
		
		list.addFirst(50);
		list.addLast(5);
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(1));
	}
}
