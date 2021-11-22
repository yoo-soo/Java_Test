/*
 * 
 */

import java.io.*; // 입출력 관련 패키지
public class FileReaderClass {
	public static void main(String[] args) {
		int c; // 한 문자를 저장할 변수 -1일 경우, 파일의 끝 EOF 의미
		int space = 0; // 공백의 갯수를 카운트할 변수
		int letter = 0; // 문자 변수
		int line = 0; // 줄 변수
		int digit = 0; // 숫자 변수
		// Reader은 파일이 열릴 때 문제가 생기는 거고 close는 파일이 닫힐 때 문제 발생
		FileReader fr = null;
		
		try {
			fr = new FileReader("input.txt"); // input.txt 파일 읽기. 파일이 없는 경우 발생할 수 있는 에외를 처리하지 않음.
			while( (c = fr.read()) != -1 ) { // 정수값이 -1이 아닐 때까지 읽음.
				if( Character.isSpaceChar(c) ) // 공백문자이면
					space++; // space 증가
				if( Character.isLetter(c) ) // 문자이면
					letter++; // letter 증가
				if( Character.isDigit(c) ) // 슷자이면
					digit++; // digit 증가
				if( (char)c == '\n' ) // 줄바꿈이면 
					line++; // line 증가
				System.out.print( (char)c ); // 정수형이 아닌 문자형으로 출력하기 위해 형변환을 해줌.
			}
		}catch( FileNotFoundException fnfe ) { // 파일이 존재하지 않을 경우
				System.out.println("열고자하는 파일 input.txt가 존재하지 않습니다.");
				// 예외 발생 위치 -> fnfe.printStackTrace();
		}catch( IOException ioe ) { // 파일을 읽지 못했을 경우
				System.out.println("파일은 존재하지만 파일을 열 수 없습니다.");
		}
	
		try {
			fr.close(); // 파일을 닫을 때
		}catch( NullPointerException npe ) { // 파일이 열리지 않았을 경우
			System.out.println("파일이 열리지 않았습니다.");
		}catch( IOException ioe ) { // 파일을 닫지 못했을 경우
			System.out.println("파일을 닫지 못했습니다. 파일이 열리지 않았을 수도 있습니다.");
		}
		System.out.println();
		System.out.println( "문자수 : " + letter ); // 파일의 문자수 출력
		System.out.println( "숫자수 : " + digit ); // 파일의 숫자수 출력
		System.out.println( "라인수 : " + line ); // 파일의 라인수 출력
		System.out.println( "공백수 : " + space ); // 파일의 공백수 출력
	}
}
