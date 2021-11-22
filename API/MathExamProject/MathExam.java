
public class MathExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 8;
		int j = -5;
		int max;
		
		// Math.log를 이용한 자연로그 값 구하기
		System.out.println( "Natural logarithm value of 2 is : " + Math.log(2) ); 
		// Math.abs를 이용한 절대값 구하기
		System.out.println( "Absolute value of " + i + " is : " + Math.abs(i) ); 
		System.out.println( "Absolute value of " + j + " is : " + Math.abs(j) ); 
		// Math.ceil을 이용한 천장값 구하기
		System.out.println( Math.ceil(10.1) );
		System.out.println( Math.ceil(-42.4) );
		// Math.floor를 이용한 바닥값 구하기
		System.out.println( Math.floor(10.5) );
		// Math.max를 이용한 최대값 구하기
		max = Math.max(10, 20);
		System.out.println( "Max value is " + max);
		// Math.min을 이용한 최소값 구하기
		System.out.println( Math.min(10, 5) );
		// Math.pow를 이용한 승수 구하기
		System.out.println( Math.pow(10, 2) );
		// Math.sqrt를 이용한 루트값 구하기
		System.out.println( Math.sqrt(100) );
		// Math.round를 이용한 반올림값 구하기
		System.out.println( Math.round(20.5f) );
		// Math.random을 이용한 랜덤값 구하기
		System.out.println( (int)(Math.random() * 45) );
		// 랜덤값 0 ~ 1 사이의 실수값
		// (int)(랜덤값 * 100 + 100)
		System.out.println( "Random numbers between 0.0 and 1.0 are, ");
		for( i = 0; i < 5; i++ ) {
			System.out.println( "Random Number [" + (i+1) + "] : " + Math.random() );
		}
		System.out.println( "Random numbers between 1 and 100 are," );
				
		for( i = 0; i < 5; i++ ) {
			System.out.println( "Random Number [" + (i+1) + "] : " + (int)(Math.random()*100) );
		}
	}
}
