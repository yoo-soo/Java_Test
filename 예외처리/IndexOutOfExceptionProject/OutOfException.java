import java.util.Scanner;

public class OutOfException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrs[] = new int[10]; // 크기 10인 배열 생성
		Scanner s = new Scanner(System.in); // 키보드 입력을 위한 Scanner
		int index; // 정수형 index 변수 생성
		
		System.out.println("정수 배열값 10개 입력 : ");
		for( int i = 0; i < 10; i++ ) { // 9번 반복
			arrs[i] = s.nextInt(); // 총 10번의 정수 배열값을 arrs 배열의 i번 인덱스에 저장함
		}
		for( int i = 0; i < 10; i++ ) { // 9번 반복
			System.out.println(arrs[i] + " "); // 배열 인덱스 출력
		}
		
		do {
			System.out.print("출력할 배열 인덱스 입력 : "); 
			index = s.nextInt(); // 인덱스 입력 받기
			if( index == -1 ) // -1을 입력받으면
				break; // 끝내기
			try { // 예외 처리해주지 않으면 오류 발생.
				System.out.println("배열의 [" + index + "] 의 값은 : " + arrs[index]);
			}catch(ArrayIndexOutOfBoundsException aiobe) { // ArrayIndexOutOfBoundsException에 대한 예외 처리
				System.out.println("배열 인덱스 " + index + " 값은 배열 범위를 벗어납니다. 다시 입력해주세요."); // 예외발생 시 해당 문구 출력
			}
		}while(true);
	}

}
