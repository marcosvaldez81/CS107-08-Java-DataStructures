/* Author:  Marcos Valdez and Professor assisted me! Thanks!
 * Date:  4/18/21
 * Finished: 4/18/2021
 * Purpose:  Math 140
 * 
 * */



import java.util.NoSuchElementException;

/*
 *  The class passed to E must implement Comparable interface.
 *  Therefore the item stored in a Node defines the compareTo method
 */
public class LinkedList<E extends Comparable<E>> {

	private Node head;
	private Node last;
	private int size;

	private class Node { // private inner class

		private E item;
		private Node next;
		private Node prev;

		private Node(E item) { //
			this.item = item;
		}
	}

	//**   Don't edit code above this statement --------------

	/* Purpose:  Remove the head node of the linked list
	 * Parameters: No parameters here
	 * Return:  Returns tmp value that is the removed head
	 * 
	 **/

	public E removeFirst(){

		if(size == 0) {
			throw new NoSuchElementException();
		}
		E tmp = head.item;

		if (size == 1) {
			head = last = null;
		}else {
			head = head.next;
			head.prev = null;
		}
		
		size--;
		return tmp;
	}
	
	/* Purpose:  Display the linked list in reverse
	 * Parameters: No parameters here
	 * Return:  Returns a display of the linkedlist in reverse.
	 * 
	 **/
	
	public void displayReverse() {
		Node ptr = last;
		
		while(ptr != null) {
			System.out.println(ptr.item);
			ptr = ptr.prev;
		}
	}
	
	/* Purpose:  Fetches the head paramater from removeFirst() and uses add() to add head node to end of list
	 * Parameters: No parameters here
	 * Return:  Returns head node to the tail
	 * 
	 **/
	
	public void moveHeadToLast() {
	
		if(size == 0) {
			throw new NoSuchElementException();
		}

		E tmp = removeFirst();
		
		add(tmp);
		


	}
	
	/* Purpose:  Remove the last node of the linked list to move to head. Uses the removeLast() and addFirst() method to achieve this.
	 * Parameters: No parameters here
	 * Return:  Returns tail node to the front of linked list
	 * 
	 **/
	
	public void moveLastToHead() {
	
		if(size == 0) {
			throw new NoSuchElementException();
		}
		E tmp = removeLast();
		addFirst(tmp);


	}

	/* Purpose: Appends all items in the linkedlist that are greater than E item and adds to tmp list
	 * Parameters: E Item that is being compared to
	 * Return:  Returns tmp linked list
	 * 
	 **/
	
	public LinkedList<E>greaterThan(E item){
		LinkedList<E> tmp = new LinkedList<>();
		
		
		Node ptr = head;
		if (item != null) {
			while(ptr != null) {
				if(ptr.item.compareTo(item) >0) {	
					tmp.add(ptr.item);
				}
				ptr = ptr.next;
			}

		}
		return tmp;
	}
	
	/* Purpose:  Appends all items in the linkedlist that are less than E item and adds to tmp list
	 * Parameters: E Item that is being compared to
	 * Return:  Returns tmp linked list
	 * 
	 **/
	public LinkedList<E>lessThan(E item){
		LinkedList<E> tmp = new LinkedList<>();

			
		Node ptr = head;
		if(item != null) {
			while (ptr != null) {

				if(ptr.item.compareTo(item) < 0) {	
					tmp.add(ptr.item);

				}
				ptr = ptr.next;
			}
			
		}

		return tmp;

	}
	/* Purpose: if inputted linkedlist has all same elements as main linked list, return true
	 * Parameters: LinkedList list
	 * Return:  Returns true if all items in input are the same, else, false
	 * 
	 **/

	public boolean containsAll(LinkedList<E>list) {
		boolean flag = true;
		
		if(list == null) {
			flag = true;
		}

		
		if(list != null) {
	
			Node ptr2 = list.head;
			while(ptr2 != null && flag) {
				flag = contains(ptr2.item) ;
				ptr2 = ptr2.next;

			}
		}
		return flag;
		
	}
	/* Purpose: if inputted linkedlist has at least one item that is the same element as main linked list, return true
	 * Parameters: LinkedList list
	 * Return:  Returns true if at least one item in input are the same, else, false
	 * 
	 **/

	public boolean containsAtLeastOne(LinkedList<E>list) {
		boolean flag = false;

		if(list == null) {
			flag = false;
		}
		if(list != null) {
			Node ptr2 = list.head;
			while(ptr2 != null && !flag) {
				flag = contains(ptr2.item);
				ptr2 = ptr2.next;

			}
		}


		return flag;
	}
	
	// Don't edit the code below this line ----------------------------------------------------------------
	
	/* Purpose: Displays the items from head to last 
	 * Parameters: No parameters
	 * Return:  Returns void
	 */
	public void display() {
		Node ptr = head;
		while (ptr != null) {
			System.out.println(ptr.item);
			ptr = ptr.next;
		}
	}

	/*
	 * Purpose: Remove the last Node in the linked list. Return the item stored in the
	 * removed Node object. Throw a NoSuchElementException if size = 0.
	 * Parameters: No parameters
	 * Return:  The item stored in the removed Node
	 */
	public E removeLast() {
		if (size == 0) {
			throw new NoSuchElementException();
		}
		E tmp = last.item;
		if (size == 1) {
			head = last = null;
		} else {
			last = last.prev;
			last.next = null;
		}
		size--;
		return tmp;
	}
	
	/*
	 * Purpose: Add a Node at the head containing the specified item.
	 * Parameters: The specified item that will be stored in the linked list
	 * Return: return void
	 */

	public void addFirst(E item) {
		Node node = new Node(item); // create the Node object
		if (head == null) { // if size = 0
			head = last = node; // size = 1
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}
		size++; // critical
	}
	
	/*
	 * Purpose: Determines if the specific item is contained in the linked list.
	 * Parameters: The specified item 
	 * Return: Return true if the item is stored in the linked list; otherwise return false
	 */

	public boolean contains(Object item) {
		boolean flag = false; // assume item is not in the Linked List

		Node ptr = head;
		while (ptr != null && !flag) {
			flag = equals(ptr.item, item);
			ptr = ptr.next; // advance to the next node in the linked list
		}

		return flag;
	}

	/*
	 * Purpose: Determine if the input parameters are equal.  The input arguments can 
	 * be equal to null.
	 * Parameters: Two Object values
	 * Return: Return true if the input arguments are equal; otherwise return false
	 */
	private boolean equals(Object target, Object src) {
		boolean flag = false;
		if (target == null) { 
			if (src == null) {
				flag = true; //
			} else { // src != null and target = null
				flag = false;
			}
		} else { // target != null
			flag = target.equals(src); // false if src is null target.equals(null) is false
		}
		return flag;
	}

	/*
	 * Purpose: Update the item at the specified index. Throws an
	 * exception if index is negative or greater than or equal to size.
	 * Parameters: The item that will be stored in the Node at the specified index.
	 * Return: Return the item previous stored in the Node at the specified index.
	 */
	public E set(int index, E item) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node ptr = head;
		for (int i = 0; i < index; i++) { // advance to node index
			ptr = ptr.next;
		}
		E tmp = ptr.item;
		ptr.item = item; // assign parameter to ptr.item
		return tmp;
	}
	
	/*
	 * Purpose: Retrieve the item in the Node at the specified index. Throws an
	 * exception if index is negative or greater than or equal to size.
	 * Parameters: The specified index.
	 * Return: Return the item stored in the Node at the specificied index.
	 */

	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node ptr = head;
		for (int i = 0; i < index; i++) { // advance to node index
			ptr = ptr.next;
		}

		return ptr.item;
	}

	/*
	 * Purpose: Obtain the number of Node objects in the Linked List.
	 * Parameters: No parameters
	 * Return: Return the number of Node objects in the Linked List.
	 */
	public int size() {
		return size;
	}
	
	/*
	 * Purpose: Add a Node object that contains the specified item at the end of
	 * the linked list.
	 * Parameters: The specified item.
	 * Return: Always returns true.
	 */

	public boolean add(E item) { 
		Node node = new Node(item); // create the Node object
		if (head == null) { // if size = 0
			head = last = node; // size = 1
		} else { // if size > 0
			last.next = node;
			node.prev = last;
			last = node;
		}
		size++; // increase size by 1
		return true;
	}

}
