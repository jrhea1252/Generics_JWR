package main;
import linkedlist.Node;
import linkedlist.LinkedList;
import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		// This will test GenericLinkedList with Integer
		GenericLinkedList<Integer> integerList = new GenericLinkedList<>();
		integerList.addNode(new GenericNode<>(1));
		integerList.addNode(new GenericNode<>(2));
		integerList.addNode(new GenericNode<>(3));
		printList(integerList);

		// This will test GenericLinkedList with Double
		GenericLinkedList<Double> doubleList = new GenericLinkedList<>();
		doubleList.addNode(new GenericNode<>(1.1));
		doubleList.addNode(new GenericNode<>(2.2));
		doubleList.addNode(new GenericNode<>(3.3));
		printList(doubleList);

		// This will test GenericLinkedList with String
		GenericLinkedList<String> stringList = new GenericLinkedList<>();
		stringList.addNode(new GenericNode<>("Hello"));
		stringList.addNode(new GenericNode<>("World"));
		printList(stringList);
	}

	private static <T> void printList(GenericLinkedList<T> list) {
		GenericNode<T> current = list.getHead();
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNextNode();
		}

	}//end main

}//end class
