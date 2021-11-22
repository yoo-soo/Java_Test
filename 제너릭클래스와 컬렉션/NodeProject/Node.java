/*
 * 제너릭 클래스는 자료형이 정해지지 않았기 때문에 연산을 사용할 수 없다.
 */
public class Node<T> {
	private T nodeValue; // 정수값을 저장할 노드 변수 생성
	private Node next;
	                       	     // Node n1 = new Node(); 
	                             // 이 생성 방법을 사용하려면 생성자를 작성해야한다.
	public Node() {
		
	}
	
	public Node(T nodeValue) { // Node n2 = new Node(10);
		this.nodeValue = nodeValue; 
	}
	
	public Node(T nodeValue, Node next) { // Node n2 = new Node(10);
		this.nodeValue = nodeValue;
		this.next = next;
	}
	
	public T getNodeValue() {
		return nodeValue;
	}
	
	public Node getNextNode() {
		return next;
	}
	
	public void setNodeValue(T newValue) {
		nodeValue = newValue;
	}
	
	public void setNextNode(Node nextNode) {
		next = nextNode;
	}
	
	public String toString() {
		return "노드값 : " + nodeValue;
	}
}
