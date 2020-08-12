
public class Node<E> {
	protected E element;
	protected Node<E> next;
	public Node(E elem, Node<E> n) {
		element = elem;
		next = n;
	}
	
}
