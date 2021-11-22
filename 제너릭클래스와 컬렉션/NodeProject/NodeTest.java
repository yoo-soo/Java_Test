/*
 * 
 */
public class NodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> n1 = new Node<Integer>(100);
		Node<Double> n2 = new Node<Double>(4.5);
		Node<Integer> temp;
		n1.setNextNode(n2);
		n2.setNextNode(new Node(300));
		
		temp = n1;
		
		for( int i = 0; i < 3; i++ ) {
			System.out.println( temp );
			temp = temp.getNextNode();
		}
		/*
		System.out.println( temp.toString() );
		temp = n1.getNextNode();
		System.out.println( temp );
		temp = temp.getNextNode();
		System.out.println( temp );
		*/
	}

}
