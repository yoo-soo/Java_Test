/*
 * 파일을 복사하는 정적 메서드를 가지는 클래스
 */
import java.io.*;

public class FileCopy {
	public static void copy( String str1, String str2 ) { // 원본파일 str1, 신규파일 str2
		int c = -1; 
		
		FileReader fr = null; // 파일 읽기 null 값으로 초기화 사용할 때마다 선언
		FileWriter fw = null; // 파일 작성 null 값으로 초기화 사용할 때마다 선언
		
		try {
			fr = new FileReader(str1); // 파일 읽기 str1으로 선언
			fw = new FileWriter(str2); // 파일 작성 str2로 선언
		}catch(FileNotFoundException fnfe) { // 파일이 존재하지 않을 경우
			System.out.println("복사하고자 하는 원본파일이 존재하지 않습니다.");
		}catch(IOException ioe) { // 파일을 열 수 없을 경우
			System.out.println("파일을 열거나 생성할 수 없습니다.");
		}
		
		while( true ) { // 파일 복사가 다 될 때까지 반복
			try {
				if( (c = fr.read()) == -1 ) // 파일 읽기가 -1이라면
					break; // while문 벗어남
				fw.write(c); // 파일을 읽은 것을  write
			}catch(IOException ioe) { // 파일을 읽거나 쓰는데 오류가 발생한 경우
				System.out.println("파일을 읽거나 쓰는데 오류가 발생했습니다.");
			}
		}
		
		try {
			fr.close(); // 파일 읽기 닫음
			fw.close(); // 파일 쓰기 닫음
		}catch(IOException ioe) { // 파일을 닫지 못했을 경우
			System.out.println("파일을 정상적으로 닫지 못했습니다.");
		}
		System.out.println("파일 복사 끝"); // 파일 닫는 것이 성공하면 파일 복사 성공 안내 출력
	}
}
