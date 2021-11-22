/*
 * 
 */
import java.util.Scanner;
public class FileCopyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = null; // 복사할 파일명 저장
		String target = null; // 복사 대상 파일명 저장
		Scanner s = new Scanner(System.in); // Scanner 키보드 입력
		
		System.out.println("복사할 파일명을 입력하세요.");
		source = s.next(); // scource에 복사할 파일명 입력
		System.out.println("복사할 대상 파일명을 입력하세요.");
		target = s.next(); // targer에 복사 대상 파일명 입력
		
		FileCopy.copy(source, target); // FileCopy Class에 있는 copy mathod static 사용
		
		System.out.println("복사가 완료되었습니다."); // 복사 완료 안내 출력
	}

}
