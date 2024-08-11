package linkedlist;

/**
 * This class models a generic linked list in which each node has a pointer
 * to the node after it, except the tail which does not have a node after.
 * @param <T> the type of elements this list will hold
 */
public class GenericLinkedList<T> {

	private GenericNode<T> head; //node to represent the head of the list
	private GenericNode<T> tail; //node to represent the tail (end) of the list
	private int length; //variable to keep track of the number of elements in the list
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) node.
	 */
	public GenericLinkedList() {
		head = null;
		length = 0;
		tail = head;
	}
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty() {
		return head == null;
	}
	
	/**
	 * This method returns the head node of the list from which
	 * you can traverse the entire by following node links.
	 * @return GenericNode<T> the head node
	 */
	public GenericNode<T> getHead() {
		return head;
	}
	
	/**
	 * This method adds a new node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * @param newNode the new node to add
	 */
	public void addNode(GenericNode<T> newNode) {
		if (isEmpty()) {
			head = newNode;
			tail = head;
			return;
		}
		
		tail.setNextNode(newNode);
		tail = tail.getNextNode();
		tail.setNextNode(null);
		length++;
	}
}
