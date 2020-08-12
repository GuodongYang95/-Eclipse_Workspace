
public class Link<E> {
	
	private Node<E> first;
	
	public Link () {
		first = null;
	}
	
	public void add(E elem, Node<E> pred) {
		// Insert elem at a given point in this link list, either after the
		// node pred or before the first node if pred is null.
		Node<E> tem = new Node(elem, null);
		if (pred == null) {
			tem.next = first;
			first = tem;
		}else {
			tem.next = pred.next;
			pred.next = tem;
		}
	}
	
	public void add(E elem){
		//Insert elem at head of list
		add(elem,null);
	}
	
	public void deleteFirst () {
		// Delete this SLLs first node (assuming length > 0).
		first = first.next;
		}
	
	public void delete (Node<E> del) {
		// Detele node del from this link list
		Node<E> next = del.next;
		if (del == first) {
			first = next;
		}else {
			Node<E> pred = first;
			while(pred.next != del) {
				pred = pred.next;
				pred.next = next;
			}
		}
	}
	
	public Node<E> search (E target) {
		// Find which (if any) node of this SLL contains an 
		// element equal to target. Return a link to the 
		// matching node (or null if there is none).
		Node<E> curr = first;
		while (curr != null) {
			if (target.equals(curr.element))
				return curr;
			curr = curr.next;
			}
		return null;
			
	}
	
}
