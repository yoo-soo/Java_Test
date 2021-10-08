package mylib.lang;

public class MyString {
	private char[] strs; // 문자열을 저장하기 위한 문자배열
	
	// MyString ms = new MyString("Kim");
	// 문자열의 길이만큼 배열 생성
	// 반복문을 이용해서 초기화
	public MyString(String str) {
		strs = new char[str.length()]; // 문자열의 길이만큼 배열을 생성
		
		for ( int i = 0; i < str.length(); i++) { // 문자열 길이보다 작을 때까지 반복문 실행
			strs[i] = str.charAt(i); // 해당 인덱스 문자를 문자열 배열 해당 인덱스에 저장.
		}
	}
		
	// 문자열의 길이 리턴
	public int length() {
		return strs.length;
	}
	
	// 문자열의 index 위치의 문자 리턴
	// 단, index가 문자열의 길이를 넘어가면 에러출력
	public char charAt(int index) {
		if( index < 0 || index > strs.length ) { // 인덱스가 0보다 작을 때 또는 인덱스가 문자열 길이보다 길 때  
			return '\0'; // 빈칸 출력
		} else { // 인덱스가 0보다 클 때 또는 인덱스가 문자열 길이보다 작을 때
			return strs[index]; // 문자열의 해당 인덱스 출력
		}
	}
	
	// 배열의 start 인덱스부터 end 인덱스까지의 부분 문자열을 리턴
	public String subString(int start, int end) { 
		String s = "";
		
		if ( start > end ) // start가 end보다 클 때
			return ""; // 빈칸 출력
		
		if( start < 0 || end > strs.length) // start가 0보다 작을 때 또는 end가 문자열의 길이보다 작을 때
			return ""; // 빈칸 출력
		
		for( int i = start; i < end; i++) // start에서 end까지
			s += strs[i]; // s에 문자열 해당 인덱스 문자 저장
		return s;  // s에 저장된 문자 출력
	}
	
	// 문자열을 역으로 만들어 리턴
	public String reverse() {
		String r = ""; 
		
		for( int i = strs.length - 1; i >= 0; i--) // i는 문자열의 길이 - 1, i가 0보다 크거나 같을 때 까지 반복, i는 감소.
			r += strs[i]; // r에 문자열 해당 인덱스를 저장
		return r; // r에 저장된 문자 출력
	}
}
