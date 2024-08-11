package linkedlist;

/**
 * This class models a GenericNode object which can contain any type of data.
 * Each node has its internal data and pointers to the next node in the list.
 * 
 * @param <T> the type of data this node holds
 */
public class GenericNode<T> {
	
	private T data;  //data that the object stores
	private GenericNode<T> nextNode; //pointer to the nextNode that will be in GenericLinkedList
	
	/**
	 * Constructor builds GenericNode object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode() {
		this.nextNode = null;
		this.data = null;
	}
	
	/**
	 * Constructor builds GenericNode object with data.
	 * @param data the data to store in this node
	 */
	public GenericNode(T data) {
		this.data = data;
		this.nextNode = null;
	}
	
	/**
	 * This method sets the data of the object.
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	/**
	 * This method returns the data of the object.
	 * @return T (data)
	 */
	public T getData() {
		return this.data;
	}
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode the next node to set
	 */
	public void setNextNode(GenericNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return GenericNode object
	 */
	public GenericNode<T> getNextNode() {
		return this.nextNode;
	}
}
