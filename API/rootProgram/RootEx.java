package rootProgram;

import java.lang.Math; // lang 패키지는 기본 import
public class RootEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 5;
		int c = 4;
		
		// x의 해를 double로 선언
		double x1 = 0.0;
		double x2 = 0.0;
		
		// 근의 공식
		// Math.sqrt로 ( Math.pow(b, 2) - 4 * a * c)) / (2 * a) 루트값 구하기
		// Math.pow로 b의 2제곱 승수 구하기.
		x1 = ( -b + Math.sqrt( Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		x2 = ( -b - Math.sqrt( Math.pow(b, 2) - 4 * a * c)) / (2 * a);

		System.out.println( x1 + ", " + x2 ); // 근의 공식 풀이 해 두 개 출력
	}

}
