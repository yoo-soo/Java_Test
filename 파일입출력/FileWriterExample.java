/*
 * 
 */
import java.io.*; // 파일 입출력 패키지

public class FileWriterExample {

	public static void main(String[] args) {
		int c = -1 ; // 변수에 -1값을 줌.
		FileWriter fw = null; // 선언해놓고 필요할 때마다 선언해서 사용.
		
		try {
			fw = new FileWriter("output.txt"); // 저장할 파일명 지정.
		}catch( IOException ioe ) { // 파일(객체)을 생성할 수 없을 경우
			System.out.println("파일을 생성할 수 없습니다.");
		}
		System.out.println("입력을 마치고 엔터를 친 후 ctrl + z 를 누르세요.");
		long start = System.currentTimeMillis(); // 타이머 시작
		
		while( true ) { // while의 조건이 true일 경우 반복
			try {
				if( (c = System.in.read()) == -1 ) // 만약 -1이면
					break; // while문 빠져나감
			}catch( IOException ioe ) { // 키보드 입력이 잘못되었을 경우
				System.out.println("키보드로부터 입력에 문제가 발생했습니다.");
			}
			
			try {
				fw.write(c); // 파일 읽기 시도
			}catch( IOException ioe ) { // 파일을 읽을 수 없을 경우
				System.out.println("파일을 저장할 수 없습니다.");
			}
		}
		long end = System.currentTimeMillis(); // 타이머 중지
		try {
			fw.close(); // 파일 닫기 시도
		}catch(IOException e) { // 파일을 닫을 수 없을 경우
			System.out.println("파일을 닫지 못했습니다.");
		}
		// 키보드 입력에 걸린 시간 측정 후 출력
		System.out.println("키보드 입력에 걸린 시간 : " + (end - start)/1000 );
	}
}
