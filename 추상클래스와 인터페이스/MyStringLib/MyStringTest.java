import mylib.lang.*;
public class MyStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyString s = new MyString("hallym university"); // hallym university 문자열 저장
		
		System.out.println( "생성된 문자열 길이 " + s.length() ); // 문자열 길이 출력
		System.out.println( "5번째 문자 " + s.charAt(4)); // 문자열의 5번째 문자 출력
		System.out.println("0~6 부분 문자열 " + s.subString(0, 6)); // 문자열의 0~6번째 인덱스 문자 모두 출력
		System.out.println("역 문자열 : " + s.reverse() ); // 문자열 거꾸로 출력
	}
}
