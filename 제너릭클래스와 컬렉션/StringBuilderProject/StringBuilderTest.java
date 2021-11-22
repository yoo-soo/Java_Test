/*
 *  String은 단순한 문자열을 참조하기 위한 클래스
 *  StringBuilder, StringBuffer는 문자열 편집이 효율적인 클래스
 */
// import java.lang.StringBuilder; 기본 import가 됨.
import java.util.Scanner;
public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); // 키보드 입력받기
		String input = null; // 기본값으로 설정
		//StringBuilder sb = null; 
		StringBuffer sb = null; // 변수를 먼저 만들어놓고 필요할 때 사용하기 위함. 기본값으로 설정
		System.out.println("문자열을 입력하세요"); // 키보드 입력 안내 출력
		input = s.nextLine(); // Scanner을 통해서 문자열 입력 받기, 공백x
		
		//sb = new StringBuilder(input);
		sb = new StringBuffer(input);
		
		//System.out.println( input + "이 입력되었습니다.");
		// .concat -> 뒤에 붙여서 새로운 문자열을 만들어준다.
		System.out.println( input.concat("이 입력되었습니다."));
		// .append -> 기존 문자열 sb에 새로운 문자열 추가
		System.out.println( sb.append("이 입력되었습니다."));
		
		// input과 sb의 차이
		System.out.println( input ); // 변화x
		System.out.println( sb ); // sb는 append 메소드를 통해서 새로운 문자열로 변경 

		sb.insert( 5, " java " ); // 5번 인덱스부터 java라는 문자열 추가
		System.out.println( sb ); // 출력
		sb.delete( 0, 5 ); // 인덱스 0부터 4까지 문자열 삭제
		System.out.println( sb );
		sb.reverse(); // 문자열 역방향 출력
		System.out.println( sb );
	
	}

}
