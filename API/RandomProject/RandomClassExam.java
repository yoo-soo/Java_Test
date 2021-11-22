import java.util.Random;
import java.util.Scanner;

public class RandomClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(); // 랜덤값
		int start, end; // 시작값과 끝값 정수형으로 선언
		int[] randValue = new int[5]; // 크기가 5인 배열 선언
		boolean flag = false;
		int rvalue;
		
		// 랜덤 정수 범위값 입력
		System.out.print("랜덤 정수 범위를 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		start = sc.nextInt(); // 시작값 입력
		end = sc.nextInt(); // 끝값 입력
		
		for ( int i = 0; i < 5; i++ ) {
			flag = false; // flag값 false로 초기화
			rvalue = r.nextInt(start) + ( end - start );
			// 	rvalue = r.nextInt(start) + (end - start);
			for( int j = 0; j < i; j++ ) {
				// 만약 랜덤값이 중복이면 flag값 true
				if( rvalue == randValue[j] ) {
					flag = true;
					break;
				}
			}
			if( flag ) { // flag
				i--; // i값을 1씩 빼줌
			}else {
				randValue[i] = rvalue; // rvalue값이 randvalue[i]값에 들어감
			}
		}
		
		for ( int i = 0; i < 5; i++ ) { // 랜덤값 5개 출력
			System.out.print( randValue[i] + " , ");
		}
	}

}
