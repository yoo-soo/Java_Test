
public class InvalidWithdraw extends Exception { // Exception 상속
	// 추가 변수
	private String msg;
	
	public InvalidWithdraw(String msg) {
		super(msg); // 부모 개체에 메시지 변수 넘겨줌
		this.msg = msg; // 정보를 가지고 해당 메소드에서 사용 가능
	}
	
	public void depositErr() { // 입금 에러메시지 메소드
		System.out.println("입금액이 잘못되었습니다.");
	}
	
	public void inputErr() { // 입금액 에러메시지 메소드
		System.out.println("0보다 작은 입금액이 입력되었습니다.");
	}
	
	public void withdrawErr() { // 출금액 에러매시지 메소드
		System.out.println("출금액이 잘못되었습니다.");
	}
}
