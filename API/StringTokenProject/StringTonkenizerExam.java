import java.util.StringTokenizer; //패키지 사용
public class StringTokenizerExam {

	public static void main(String[] args) {
		// 특정 문자 (://.) 를 기준으로 토큰을 나눔
		StringTokenizer stk = new StringTokenizer("http://www.hallym.ac.kr", "://.");
		while( stk.hasMoreElements() ) { 
			System.out.println( stk.nextElement() ); // 분할된 토큰 출력
		}
	}

}
