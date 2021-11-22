import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		//LinkedList<String> al = new LinkedList<String>();
		al.add("hallym"); // ArrayList에 문자열 hallym 추가
		al.add("computer"); // computer 추가 
		al.add("Science"); // Science 추가
		
		// 객체 내용 출력 ( for문 )
		for( int i = 0; i < al.size(); i++ ) {
			System.out.println(al.get(i)); // i번 인덱스 내용을 가져와서 출력.
		}
		
		al.add(1, "University"); // 객체의 1번 인덱스에 University 추가
		
		for( int i = 0; i < al.size(); i++ ) {
			System.out.println(al.get(i)); // i번 인덱스 내용을 가져와서 출력.
		}
		al.set(3, "Enginnering"); // 객체에서 Science의 위치를 Enginnering로 변경
		
		for( int i = 0; i < al.size(); i++ ) {
			System.out.println(al.get(i)); // i번 인덱스 내용을 가져와서 출력.
		}
		
		Iterator e = al.iterator(); // Iterator로 접근해서 while문으로 출력.
		while( e.hasNext() ) {
			System.out.println( e.next() );
		}
	}

}
