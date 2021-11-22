
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount("1234", "Yoo", 12000);
		System.out.println(ba.toString());
		ba.deposit(-20000);
		System.out.println(ba);
		
		try { // withDraw에서 넘겨진 예외처리
			ba.withDraw(45000); // withDraw 메소드에 45000을 입력했을 때
		}catch ( InvalidWithdraw iw ) { // InvalidWithdraw에 예외가 발생하면
			iw.withdrawErr(); // withdrawErr 메소드의 에러메시지 출력
		}
		
		System.out.println(ba.toString()); // 계좌정보 출력
	}

}
