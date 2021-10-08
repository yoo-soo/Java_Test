package mylib.lang;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyString s = new MyString("hallym"); // hallym 문자열 저장
		
		System.out.println("문자의 길이 : " + s.length()); // 문자열의 길이 출력
		System.out.println("1번째 위치 문자 : " + s.charAt(1)); // 문자열 인덱스 첫 번째에 있는 문자 출력
		System.out.println("2~4 부분 문자열 : " + s.subString(2, 4)); // 문자열 인덱스 2~4번째에 있는 문자 모두 출력
		System.out.println("역 문자열 : " + s.reverse()); // 문자열 거꾸로 출력
	}

}
