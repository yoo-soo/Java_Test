/*
 * throw를 이용한 예외처리
 */
public class ThreadExam1 {
	// throws : 현재 메소드를 호출한 쪽으로 예외를 옮김.
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		for( int i = 0; i < 10; i++ ) { // 인덱스 0부터 9까지 반복
			System.out.println(i); // 인덱스 출력
			try { // 예외가 발생하는 지점을 try로 묶어줌
				Thread.sleep(1000); // 1초 간격으로 멈춤.
			}catch(InterruptedException ie) { // 예외가 발생하면
				System.out.println("예외발생"); // 예외발생 문구 출력
			}
		}
	}

}
