
public class BankAccount {
	private String accountNo; // 계좌번호
	private String owner; // 예금주
	private int balance; // 잔액
	
	public BankAccount(String accountNo, String owner, int balance) {
		this.accountNo = accountNo; // 맴버변수 accountNo에 매개변수 accountNo 
		this.owner = owner; // 맴버변수 owner에 매개변수 owner 
		this.balance = balance; // 맴버변수 balance에 매개변수 balance 
	}
	
	public void deposit(int money) { // 입금 메소드
		try {
			if( money < 0 ) // money가 0보다 작으면
				throw new InvalidWithdraw("0보다 작은 값 입금"); // 예외발생
			this.balance += money; // 잔액에 해당 money를 더해줌
		} catch( InvalidWithdraw iw ) { // invalidWithdraw에 예외 발생하면
				iw.inputErr(); // inputErr메소드의 오류메시지 출력
		}
	}
	
	public void withDraw(int money) throws InvalidWithdraw { // 출금 메소드, 호출한 위치로 예외 처리 넘김.
		if( balance - money < 0 ) // 잔액에서 money를 뺐을 때 0보다 작으면
			throw new InvalidWithdraw("잔액부족"); // 예외발생
		this.balance -= money; // 잔액에 해당 money를 빼줌
	}
	
	public String toString() { // 계좌정보 toString
		return "계좌정보 :  계좌번호 ( " + accountNo + " ) 예금주 ( " + owner + " )  예금잔액 ( " + balance + " ) ";
	}
}
