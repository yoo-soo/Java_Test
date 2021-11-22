import java.util.StringTokenizer; // 패키지 사용
public class StringTokenizerAndSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String delims = ","; // 기준점 선언
		String splitString = "one,two,,three,four,,five"; // 구분할 문자열 선언
		
		System.out.println( "StringTokenizer Example : \n");
		StringTokenizer st = new StringTokenizer(splitString, delims);
		while ( st.hasMoreElements() ) { // 토큰 
			System.out.println( "StringTokenizer Output : " + st.nextElement() );
		}
		System.out.println( "\n\nSplit Example : \n");
		String[] tokens = splitString.split( delims );
		int tokenCount = tokens.length; // 토큰 개수 카운트
		for ( int j = 0; j < tokenCount; j++ ) { // 토큰 개수 미만 for반복문 작동
			System.out.println( "Split Output : " + tokens[j] ); // 분할된 토큰 출력
		}
	}
}
