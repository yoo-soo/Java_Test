import java.util.*;

public class QueueTest {
    public static void main(String[] args) throws InterruptedException {
  	int time =10;
	Queue<Integer> queue = new LinkedList<Integer>();
	
	for ( int i = time ; i >= 0 ; i-- ) {
		queue.add(i);
	}
	
	while( !queue.isEmpty() ) {
		System.out.print( queue.remove() + " " );
 		Thread.sleep(1000); // 예외처리를 하지 않으면 오류가 뜸.
 	}
    }
}
